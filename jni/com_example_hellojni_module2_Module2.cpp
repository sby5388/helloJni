#include "com_example_hellojni_module2_Module2.h"
#include <jni.h>

#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_example_hellojni_module2_Module2
 * Method:    addNative
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_com_example_hellojni_module2_Module2_addNative
  (JNIEnv *env, jclass jboj, jint number1, jint number2){
    return number1 + number2;
  }

/*
 * Class:     com_example_hellojni_module2_Module2
 * Method:    subNative
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_com_example_hellojni_module2_Module2_subNative
  (JNIEnv *env, jclass jboj, jint number1, jint number2){
    return number1 - number2;
  }

#ifdef __cplusplus
}
#endif

