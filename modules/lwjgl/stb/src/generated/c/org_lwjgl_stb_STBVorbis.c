/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#ifdef LWJGL_LINUX
    #include <alloca.h>
#endif
#include "stb_vorbis.c"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1info(JNIEnv *__env, jclass clazz, jlong fAddress, jlong __result) {
    stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
    UNUSED_PARAMS(__env, clazz)
    *((stb_vorbis_info*)(intptr_t)__result) = stb_vorbis_get_info(f);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1error(JNIEnv *__env, jclass clazz, jlong fAddress) {
    stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stb_vorbis_get_error(f);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1close(JNIEnv *__env, jclass clazz, jlong fAddress) {
    stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
    UNUSED_PARAMS(__env, clazz)
    stb_vorbis_close(f);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1sample_1offset(JNIEnv *__env, jclass clazz, jlong fAddress) {
    stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stb_vorbis_get_sample_offset(f);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1file_1offset(JNIEnv *__env, jclass clazz, jlong fAddress) {
    stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stb_vorbis_get_file_offset(f);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1open_1pushdata__JIJJJ(JNIEnv *__env, jclass clazz, jlong datablockAddress, jint datablock_length_in_bytes, jlong datablock_memory_consumed_in_bytesAddress, jlong errorAddress, jlong alloc_bufferAddress) {
    unsigned char const *datablock = (unsigned char const *)(intptr_t)datablockAddress;
    int *datablock_memory_consumed_in_bytes = (int *)(intptr_t)datablock_memory_consumed_in_bytesAddress;
    int *error = (int *)(intptr_t)errorAddress;
    stb_vorbis_alloc const *alloc_buffer = (stb_vorbis_alloc const *)(intptr_t)alloc_bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)stb_vorbis_open_pushdata(datablock, datablock_length_in_bytes, datablock_memory_consumed_in_bytes, error, alloc_buffer);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1decode_1frame_1pushdata__JJIJJJ(JNIEnv *__env, jclass clazz, jlong fAddress, jlong datablockAddress, jint datablock_length_in_bytes, jlong channelsAddress, jlong outputAddress, jlong samplesAddress) {
    stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
    unsigned char const *datablock = (unsigned char const *)(intptr_t)datablockAddress;
    int *channels = (int *)(intptr_t)channelsAddress;
    float ***output = (float ***)(intptr_t)outputAddress;
    int *samples = (int *)(intptr_t)samplesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stb_vorbis_decode_frame_pushdata(f, datablock, datablock_length_in_bytes, channels, output, samples);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1flush_1pushdata(JNIEnv *__env, jclass clazz, jlong fAddress) {
    stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
    UNUSED_PARAMS(__env, clazz)
    stb_vorbis_flush_pushdata(f);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1decode_1filename__JJJJ(JNIEnv *__env, jclass clazz, jlong filenameAddress, jlong channelsAddress, jlong sample_rateAddress, jlong outputAddress) {
    char const *filename = (char const *)(intptr_t)filenameAddress;
    int *channels = (int *)(intptr_t)channelsAddress;
    int *sample_rate = (int *)(intptr_t)sample_rateAddress;
    short **output = (short **)(intptr_t)outputAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stb_vorbis_decode_filename(filename, channels, sample_rate, output);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1decode_1memory__JIJJJ(JNIEnv *__env, jclass clazz, jlong memAddress, jint len, jlong channelsAddress, jlong sample_rateAddress, jlong outputAddress) {
    unsigned char const *mem = (unsigned char const *)(intptr_t)memAddress;
    int *channels = (int *)(intptr_t)channelsAddress;
    int *sample_rate = (int *)(intptr_t)sample_rateAddress;
    short **output = (short **)(intptr_t)outputAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stb_vorbis_decode_memory(mem, len, channels, sample_rate, output);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1open_1memory__JIJJ(JNIEnv *__env, jclass clazz, jlong memAddress, jint len, jlong errorAddress, jlong alloc_bufferAddress) {
    unsigned char const *mem = (unsigned char const *)(intptr_t)memAddress;
    int *error = (int *)(intptr_t)errorAddress;
    stb_vorbis_alloc const *alloc_buffer = (stb_vorbis_alloc const *)(intptr_t)alloc_bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)stb_vorbis_open_memory(mem, len, error, alloc_buffer);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1open_1filename__JJJ(JNIEnv *__env, jclass clazz, jlong filenameAddress, jlong errorAddress, jlong alloc_bufferAddress) {
    char const *filename = (char const *)(intptr_t)filenameAddress;
    int *error = (int *)(intptr_t)errorAddress;
    stb_vorbis_alloc const *alloc_buffer = (stb_vorbis_alloc const *)(intptr_t)alloc_bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)stb_vorbis_open_filename(filename, error, alloc_buffer);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1seek_1frame(JNIEnv *__env, jclass clazz, jlong fAddress, jint sample_number) {
    stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stb_vorbis_seek_frame(f, (unsigned int)sample_number);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1seek(JNIEnv *__env, jclass clazz, jlong fAddress, jint sample_number) {
    stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stb_vorbis_seek(f, (unsigned int)sample_number);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1seek_1start(JNIEnv *__env, jclass clazz, jlong fAddress) {
    stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stb_vorbis_seek_start(f);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1stream_1length_1in_1samples(JNIEnv *__env, jclass clazz, jlong fAddress) {
    stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stb_vorbis_stream_length_in_samples(f);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1stream_1length_1in_1seconds(JNIEnv *__env, jclass clazz, jlong fAddress) {
    stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)stb_vorbis_stream_length_in_seconds(f);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1frame_1float__JJJ(JNIEnv *__env, jclass clazz, jlong fAddress, jlong channelsAddress, jlong outputAddress) {
    stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
    int *channels = (int *)(intptr_t)channelsAddress;
    float ***output = (float ***)(intptr_t)outputAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stb_vorbis_get_frame_float(f, channels, output);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1frame_1short(JNIEnv *__env, jclass clazz, jlong fAddress, jint num_c, jlong bufferAddress, jint num_samples) {
    stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
    short **buffer = (short **)(intptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stb_vorbis_get_frame_short(f, num_c, buffer, num_samples);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1frame_1short_1interleaved__JIJI(JNIEnv *__env, jclass clazz, jlong fAddress, jint num_c, jlong bufferAddress, jint num_shorts) {
    stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
    short *buffer = (short *)(intptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stb_vorbis_get_frame_short_interleaved(f, num_c, buffer, num_shorts);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1samples_1float(JNIEnv *__env, jclass clazz, jlong fAddress, jint channels, jlong bufferAddress, jint num_samples) {
    stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
    float **buffer = (float **)(intptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stb_vorbis_get_samples_float(f, channels, buffer, num_samples);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1samples_1float_1interleaved__JIJI(JNIEnv *__env, jclass clazz, jlong fAddress, jint channels, jlong bufferAddress, jint num_floats) {
    stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
    float *buffer = (float *)(intptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stb_vorbis_get_samples_float_interleaved(f, channels, buffer, num_floats);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1samples_1short(JNIEnv *__env, jclass clazz, jlong fAddress, jint channels, jlong bufferAddress, jint num_samples) {
    stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
    short **buffer = (short **)(intptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stb_vorbis_get_samples_short(f, channels, buffer, num_samples);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1samples_1short_1interleaved__JIJI(JNIEnv *__env, jclass clazz, jlong fAddress, jint channels, jlong bufferAddress, jint num_shorts) {
    stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
    short *buffer = (short *)(intptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)stb_vorbis_get_samples_short_interleaved(f, channels, buffer, num_shorts);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1open_1pushdata__JI_3I_3IJ(JNIEnv *__env, jclass clazz, jlong datablockAddress, jint datablock_length_in_bytes, jintArray datablock_memory_consumed_in_bytesAddress, jintArray errorAddress, jlong alloc_bufferAddress) {
    unsigned char const *datablock = (unsigned char const *)(intptr_t)datablockAddress;
    stb_vorbis_alloc const *alloc_buffer = (stb_vorbis_alloc const *)(intptr_t)alloc_bufferAddress;
    jlong __result;
    jint *datablock_memory_consumed_in_bytes = (*__env)->GetIntArrayElements(__env, datablock_memory_consumed_in_bytesAddress, NULL);
    jint *error = (*__env)->GetIntArrayElements(__env, errorAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)stb_vorbis_open_pushdata(datablock, datablock_length_in_bytes, (int *)datablock_memory_consumed_in_bytes, (int *)error, alloc_buffer);
    (*__env)->ReleaseIntArrayElements(__env, errorAddress, error, 0);
    (*__env)->ReleaseIntArrayElements(__env, datablock_memory_consumed_in_bytesAddress, datablock_memory_consumed_in_bytes, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1decode_1frame_1pushdata__JJI_3IJ_3I(JNIEnv *__env, jclass clazz, jlong fAddress, jlong datablockAddress, jint datablock_length_in_bytes, jintArray channelsAddress, jlong outputAddress, jintArray samplesAddress) {
    stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
    unsigned char const *datablock = (unsigned char const *)(intptr_t)datablockAddress;
    float ***output = (float ***)(intptr_t)outputAddress;
    jint __result;
    jint *channels = channelsAddress == NULL ? NULL : (*__env)->GetIntArrayElements(__env, channelsAddress, NULL);
    jint *samples = (*__env)->GetIntArrayElements(__env, samplesAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)stb_vorbis_decode_frame_pushdata(f, datablock, datablock_length_in_bytes, (int *)channels, output, (int *)samples);
    (*__env)->ReleaseIntArrayElements(__env, samplesAddress, samples, 0);
    if (channels != NULL) { (*__env)->ReleaseIntArrayElements(__env, channelsAddress, channels, 0); }
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1decode_1filename__J_3I_3IJ(JNIEnv *__env, jclass clazz, jlong filenameAddress, jintArray channelsAddress, jintArray sample_rateAddress, jlong outputAddress) {
    char const *filename = (char const *)(intptr_t)filenameAddress;
    short **output = (short **)(intptr_t)outputAddress;
    jint __result;
    jint *channels = (*__env)->GetIntArrayElements(__env, channelsAddress, NULL);
    jint *sample_rate = (*__env)->GetIntArrayElements(__env, sample_rateAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)stb_vorbis_decode_filename(filename, (int *)channels, (int *)sample_rate, output);
    (*__env)->ReleaseIntArrayElements(__env, sample_rateAddress, sample_rate, 0);
    (*__env)->ReleaseIntArrayElements(__env, channelsAddress, channels, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1decode_1memory__JI_3I_3IJ(JNIEnv *__env, jclass clazz, jlong memAddress, jint len, jintArray channelsAddress, jintArray sample_rateAddress, jlong outputAddress) {
    unsigned char const *mem = (unsigned char const *)(intptr_t)memAddress;
    short **output = (short **)(intptr_t)outputAddress;
    jint __result;
    jint *channels = (*__env)->GetIntArrayElements(__env, channelsAddress, NULL);
    jint *sample_rate = (*__env)->GetIntArrayElements(__env, sample_rateAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)stb_vorbis_decode_memory(mem, len, (int *)channels, (int *)sample_rate, output);
    (*__env)->ReleaseIntArrayElements(__env, sample_rateAddress, sample_rate, 0);
    (*__env)->ReleaseIntArrayElements(__env, channelsAddress, channels, 0);
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1open_1memory__JI_3IJ(JNIEnv *__env, jclass clazz, jlong memAddress, jint len, jintArray errorAddress, jlong alloc_bufferAddress) {
    unsigned char const *mem = (unsigned char const *)(intptr_t)memAddress;
    stb_vorbis_alloc const *alloc_buffer = (stb_vorbis_alloc const *)(intptr_t)alloc_bufferAddress;
    jlong __result;
    jint *error = (*__env)->GetIntArrayElements(__env, errorAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)stb_vorbis_open_memory(mem, len, (int *)error, alloc_buffer);
    (*__env)->ReleaseIntArrayElements(__env, errorAddress, error, 0);
    return __result;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1open_1filename__J_3IJ(JNIEnv *__env, jclass clazz, jlong filenameAddress, jintArray errorAddress, jlong alloc_bufferAddress) {
    char const *filename = (char const *)(intptr_t)filenameAddress;
    stb_vorbis_alloc const *alloc_buffer = (stb_vorbis_alloc const *)(intptr_t)alloc_bufferAddress;
    jlong __result;
    jint *error = (*__env)->GetIntArrayElements(__env, errorAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)stb_vorbis_open_filename(filename, (int *)error, alloc_buffer);
    (*__env)->ReleaseIntArrayElements(__env, errorAddress, error, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1frame_1float__J_3IJ(JNIEnv *__env, jclass clazz, jlong fAddress, jintArray channelsAddress, jlong outputAddress) {
    stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
    float ***output = (float ***)(intptr_t)outputAddress;
    jint __result;
    jint *channels = channelsAddress == NULL ? NULL : (*__env)->GetIntArrayElements(__env, channelsAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)stb_vorbis_get_frame_float(f, (int *)channels, output);
    if (channels != NULL) { (*__env)->ReleaseIntArrayElements(__env, channelsAddress, channels, 0); }
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1frame_1short_1interleaved__JI_3SI(JNIEnv *__env, jclass clazz, jlong fAddress, jint num_c, jshortArray bufferAddress, jint num_shorts) {
    stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
    jint __result;
    jshort *buffer = (*__env)->GetShortArrayElements(__env, bufferAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)stb_vorbis_get_frame_short_interleaved(f, num_c, (short *)buffer, num_shorts);
    (*__env)->ReleaseShortArrayElements(__env, bufferAddress, buffer, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1samples_1float_1interleaved__JI_3FI(JNIEnv *__env, jclass clazz, jlong fAddress, jint channels, jfloatArray bufferAddress, jint num_floats) {
    stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
    jint __result;
    jfloat *buffer = (*__env)->GetFloatArrayElements(__env, bufferAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)stb_vorbis_get_samples_float_interleaved(f, channels, (float *)buffer, num_floats);
    (*__env)->ReleaseFloatArrayElements(__env, bufferAddress, buffer, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBVorbis_nstb_1vorbis_1get_1samples_1short_1interleaved__JI_3SI(JNIEnv *__env, jclass clazz, jlong fAddress, jint channels, jshortArray bufferAddress, jint num_shorts) {
    stb_vorbis *f = (stb_vorbis *)(intptr_t)fAddress;
    jint __result;
    jshort *buffer = (*__env)->GetShortArrayElements(__env, bufferAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)stb_vorbis_get_samples_short_interleaved(f, channels, (short *)buffer, num_shorts);
    (*__env)->ReleaseShortArrayElements(__env, bufferAddress, buffer, 0);
    return __result;
}

EXTERN_C_EXIT
