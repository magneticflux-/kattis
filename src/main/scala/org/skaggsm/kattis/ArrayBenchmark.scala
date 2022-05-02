package org.skaggsm.kattis

import java.util.concurrent.TimeUnit
import org.openjdk.jmh.annotations.*
import org.openjdk.jmh.infra.Blackhole

import scala.collection.parallel.CollectionConverters.{ArrayIsParallelizable, RangeIsParallelizable}

/**
  * Created by Mitchell Skaggs on 5/2/2018.
  */
@OutputTimeUnit(TimeUnit.SECONDS)
@BenchmarkMode(Array(Mode.Throughput))
@Warmup(iterations = 10)
@Measurement(iterations = 10)
@Threads(1)
@Fork(2)
class ArrayBenchmark {
  @Benchmark
  def parallelSum(bh: Blackhole): Unit = {
    val result = (1 to 1000000).par.map(howmanydigits.logs(_)).sum
    bh.consume(result)
  }

  @Benchmark
  def seqSum(bh: Blackhole): Unit = {
    val result = (1 to 1000000).map(howmanydigits.logs(_)).sum
    bh.consume(result)
  }

  @Benchmark
  def sliceSum(bh: Blackhole): Unit = {
    val result = howmanydigits.logs.slice(1, 1000000).sum
    bh.consume(result)
  }

  @Benchmark
  def sliceParSum(bh: Blackhole): Unit = {
    val result = howmanydigits.logs.par.slice(1, 1000000).sum
    bh.consume(result)
  }
}
