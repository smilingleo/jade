package com.rethrick.jade;

import java.util.Map;

/**
 * @author dhanji@gmail.com (Dhanji R. Prasanna)
 */
class IgnoredNode extends Node {
  IgnoredNode(JadeOptions options) {super(options);}

  @Override public void emit(StringBuilder out, Map<String, Object> context) {
  }
}
