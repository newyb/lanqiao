#其他
建议您使用大赛指定的编辑环境来编写你的代码，以保证评测时和我们的编译环境一致，同时和比赛时使用的环境也一致。
Java 语言开发环境：
·JDK 1.6
·Eclipse Helios for JavaSE
·API 帮助文档（中文，chm格式）

官方 Java编程环境及API帮助文档: [编程环境及API帮助文档.rar](http://static.lanqiao.org/webstatic/document/Java)
可用语言包 http://archive.eclipse.org/technology/babel/update-site/R0.10.1/helios
打开Eclipse—>Help—>Install New Software…，Work with 复制上面的链接，name随意 等待片刻 选择语言包安装.

注：解题允许使用的特性：JDK1.6 支持的特性 意思就是说 很多好东西你不能用
比如：
两个char间的equals 
在Switch中可用String 
支持二进制文字 int binary = 0b1001;

###吐槽：
官方的编译环境说明：JAVA	Javac 1.6.0_07	javac Main.java
但怀疑实际版本不是 因为switch (str) 在jdk1.6.0_45上并不能通过 提示只能使用可转换的int值或枚举常量
要到jdk1.7版本 switch才可以使用字串。
