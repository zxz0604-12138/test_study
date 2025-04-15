---
name: "🐞 Bug Report"
about: 报告代码中的缺陷
title: "[BUG] 除法方法未处理除数为零的情况"
labels: bug
assignees: ""
---
问题描述

代码中的 divide 方法在进行除法运算时，没有对除数为零的情况进行处理，这会导致程序在运行时可能出现异常。

重现步骤

1.调用 divide 方法。

2.传入任意整数作为被除数。

3.传入 0 作为除数。

预期行为

当除数为零时，程序应抛出 IllegalArgumentException 异常，并给出 “除数不能为零” 的提示。

实际行为

程序会进行除法运算，由于除数为零，会抛出 ArithmeticException 异常。

环境信息

OS: windows 11

Java 版本: jdk 23

项目版本: 0.0.0

附加信息

可以在代码中添加对除数为零的检查：

java

if (divisor == 0) {
throw new IllegalArgumentException("除数不能为零");
}