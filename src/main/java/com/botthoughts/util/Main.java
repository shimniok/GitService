/*
 * Copyright 2021 mes.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.botthoughts.util;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

/**
 * Main class for command line testing
 * @author mes
 */
public class Main {
    public static void main(String args[]) {
    if (args.length < 2) {
      System.out.println("Usage: GitTagGetter username repo");
      return;
    }
    
    try {
      GitTagService gtg = new GitTagService(args[0], args[1]);
      ArrayList<String> list = gtg.getNames();
      list.forEach(s -> System.out.println(s));
    } catch (MalformedURLException ex) {
      System.out.println("MalformedURLException "+ex);
    } catch (IOException ex) {
      System.out.println("IOException: "+ex);
    }
  }

}
