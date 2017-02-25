package com.bijay.myanswer.chapter5;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class GroupingBy<T, K> implements Collector<T, Map<K, List<T>>, Map<K, List<T>>> {
  static Set<Characteristics> set = new HashSet<>();
  static {
    set.add(Characteristics.IDENTITY_FINISH);
  }
  private final Function<? super T, ? extends K> classifier;

  public GroupingBy(Function<? super T, ? extends K> classifier) {
    this.classifier = classifier;
  }

  @Override
  public Supplier<Map<K, List<T>>> supplier() {
    return HashMap::new;
  }

  @Override
  public BiConsumer<Map<K, List<T>>, T> accumulator() {
    return (map, s) -> {
      List val = map.computeIfAbsent(classifier.apply(s), k->new ArrayList<>());
      val.add(s);
    };
  }

  @Override
  public BinaryOperator<Map<K, List<T>>> combiner() {
    return (m1, m2) -> {throw new RuntimeException("No parallel execution allowed on GroupingBy. expected to run sequentially.");};
  }

  @Override
  public Function<Map<K, List<T>>, Map<K, List<T>>> finisher() {
    return m->m;
  }

  @Override
  public Set<Characteristics> characteristics() {
    return set;
  }

}

