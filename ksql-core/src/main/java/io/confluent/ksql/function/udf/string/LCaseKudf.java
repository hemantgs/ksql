/**
 * Copyright 2017 Confluent Inc.
 **/

package io.confluent.ksql.function.udf.string;

import io.confluent.ksql.function.KsqlFunctionException;
import io.confluent.ksql.function.udf.Kudf;

public class LCaseKudf implements Kudf {

  @Override
  public void init() {

  }

  @Override
  public Object evaluate(Object... args) {
    if (args.length != 1) {
      throw new KsqlFunctionException("LCase udf should have one input argument.");
    }
    return args[0].toString().toLowerCase();
  }
}
