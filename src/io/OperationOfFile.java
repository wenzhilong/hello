package io;

import java.io.File;
import java.io.IOException;

/**
 * File对象既可以表示文件，也可以表示目录。
 * 特别要注意的是，构造一个File对象，即使传入的文件或目录不存在，代码也不会出错:
 * 因为构造一个File对象，并不会导致任何磁盘操作。只有当我们调用File对象的某些方法的时候，才真正进行磁盘操作。
 */
public class OperationOfFile {
    public static void main(String[] args) throws IOException {
        // 构造一个File对象，需要传入文件路径（绝对路径或者相对路径）：
        File file = new File("documents/test.txt"); // 该语句没有导致任何磁盘操作

        // 返回构造方法传入的路径，返回绝对路径，返回规范路径：
        System.out.printf("%s; %s; %s\n", file.getPath(), file.getAbsolutePath(), file.getCanonicalPath());

        // 创建文件：
        if (file.createNewFile()) {
            System.out.println("文件创建成功！");
        } else {
            System.out.println("文件已存在！");
        }

        // 删除文件：
        if (file.delete()) {
            System.out.println("文件已成功删除！");
        } else {
            System.out.println("文件删除失败！");
        }
    }
}
