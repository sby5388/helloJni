一个简单的jni/ndk helloWorld
《Android C++ 高级编程--使用NDK》的第一个例子
其中代码的组织结构按照原来ADT-eclipse的默认规则，
通过修改android-gradle-build-tools的默认配置，让项目可以运行在AndroidStudio之中;
绝大部分的工作都是Android-Studio完成的，
只有使用了ndk-build对jni目录执行了编译了so文件，so文件生成于libs文件夹，
在build.gradle定义了
android.sourceSets.main{
     jniLibs.srcDirs = ['libs']
}
让AndroidStudio打包apk时打包这些so;
仅仅针对于Windows
其中ndk-build的运行环境需要这些：
1.jdk
2.Apache ANT
3.AndroidSDK
4.Cygwin
5.Android NDK
书本提到了Eclipse ADT,折腾了好久都没有成功，就是用了AndroidStudio+gradle来实现IDE
AndroidManifest.xml仅仅只是提供了一个android:minSdkVersion="16" 来提供给ndk-build 编译时使用，
Android studio打包Apk时使用的是 AndroidManifest2.xml，参考build.gradle

# 需要配置的环境变量，
1.JDK_HOME 检查命令 java -version
2.ANT_HOME 检查命令 ant -version
3.ANDROID_SDK_HOME 检查命令 'SDKManager' (包括引号，但是验证未成功，没有打开AndroidSDKManager的软件，未影响使用)
4.CYGWIN_HOME 检查命令 make -version
5.ANDROID_NDK_HOME 检查命令 ndk-build (只有在含有Android.mk Application.mk的目录下才会成功编译)
