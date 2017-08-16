/**
 * Copyright 2017 Confluent Inc.
 **/

package io.confluent.ksql.function.udf.math;

import io.confluent.ksql.function.KsqlFunctionException;
import io.confluent.ksql.function.udf.Kudf;

public class AbsKudf implements Kudf {

  @Override
  public void init() {
  }

  @Override
  public Object evaluate(Object... args) {
    if (args.length != 1) {
      throw new KsqlFunctionException("Abs udf should have one input argument.");
    }
    return Math.abs((Double) args[0]);
  }
}
