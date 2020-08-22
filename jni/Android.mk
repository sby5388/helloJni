LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_SRC_FILES := hello-jni.cpp
LOCAL_MODULE := hello-jni

include $(BUILD_SHARED_LIBRARY)

#add for module2
include $(CLEAR_VARS)

LOCAL_SRC_FILES := com_example_hellojni_module2_Module2.cpp
LOCAL_MODULE := module2

include $(BUILD_SHARED_LIBRARY)