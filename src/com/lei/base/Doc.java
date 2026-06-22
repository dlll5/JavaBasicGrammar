package com.lei.base;
//给类加
/**
 * @author Denglei
 * @version 1.0
 * @since 1.8
 */
public class Doc {
    String name;
//给方法加
    /**
     * @author Denglei
     * @param name
     * @return
     * @throws Exception
     */
    public String text(String name) throws Exception{
        return name;
    }
}

//可以在cmd中输入命令javadoc -encoding UTF-8 -charset UTF-8 Doc.java 然后再进入该文件所在位置就可以看到有很多新生成的文件。
