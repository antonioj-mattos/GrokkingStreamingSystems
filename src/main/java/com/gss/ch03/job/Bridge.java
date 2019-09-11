package com.gss.ch03.job;

import com.gss.ch03.api.Source;

import java.util.List;
import java.util.Scanner;

class Bridge extends Source<String> {
  private transient Scanner in;

  public Bridge(String name, int parallelism) {
    super(name, parallelism);
  }

  @Override
  public void setup() {
    in = new Scanner(System.in);
  }

  @Override
  public void getEvents(List<String> eventCollector) {
    String input = in.nextLine();
    eventCollector.add(input);
  }
}