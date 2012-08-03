package com.rethrick.jade;

import java.util.Map;

/**
 * @author dhanji@gmail.com (Dhanji R. Prasanna)
 */
class FilterNode extends Node {
  private final Jade jade;

  public FilterNode(Jade jade) {
    this.jade = jade;
  }

  @Override public void emit(StringBuilder out, Map<String, Object> context) {
    Filter filter = jade.filters.get(line);

    if (filter == null)
      throw new RuntimeException("No such filter registered :" + line);

    StringBuilder text = new StringBuilder();
    for (Node child : getChildren()) {
      text.append(child.indent()).append(child.line).append('\n');
    }

    out.append('\n').append(filter.filter(indent(), text.toString()));
  }
}