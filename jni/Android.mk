LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_SRC_FILES := hello-jni.cpp
LOCAL_MODULE := hello-jni

include $(BUILD_SHARED_LIBRARY)