/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
#include "common_tools.h"

#if defined(LWJGL_WINDOWS)
    #include "WindowsLWJGL.h"
#elif defined(LWJGL_LINUX)
    #include <unistd.h>
    #if !defined(_SC_PAGESIZE)
        #define _SC_PAGESIZE 30
    #endif
    #if !defined(_SC_LEVEL1_DCACHE_LINESIZE)
        #define _SC_LEVEL1_DCACHE_LINESIZE 190
    #endif
#elif defined(LWJGL_MACOS) || defined(LWJGL_FREEBSD)
    #include <unistd.h>
    #include <sys/types.h>
    #include <sys/sysctl.h>

    static int64_t sysctlbyname_i64(const char *name) {
        union {
            uint32_t u32;
            uint64_t u64;
        } value = { 0 };
        size_t length = sizeof(value);

        if (sysctlbyname(name, &value, &length, NULL, 0) != 0) {
            return 0;
        }

        switch (length) {
            case sizeof(uint32_t):
                return value.u32;
            case sizeof(uint64_t):
                return (int64_t)value.u64;
            default:
                return 0;
        }
    }
#endif

static int64_t queryPageSize(void) {
#if defined(LWJGL_MACOS) || defined(LWJGL_FREEBSD)
    return getpagesize();
#elif defined(LWJGL_LINUX)
    return sysconf(_SC_PAGESIZE);
#elif defined(LWJGL_WINDOWS)
    SYSTEM_INFO systemInfo;
    GetSystemInfo(&systemInfo);
    return systemInfo.dwPageSize;
#else
    return 0;
#endif
}

static int64_t queryCacheLineSize(void) {
#if defined(LWJGL_FREEBSD)
    return sysctlbyname_i64("machdep.cacheline_size");
#elif defined(LWJGL_LINUX)
    return sysconf(_SC_LEVEL1_DCACHE_LINESIZE);
#elif defined(LWJGL_MACOS)
    return sysctlbyname_i64("hw.cachelinesize");
#elif defined(LWJGL_WINDOWS)
    DWORD byteSize = 0;
    DWORD i;
    SYSTEM_LOGICAL_PROCESSOR_INFORMATION *buffer;
    int64_t fallback = 0;

    if (GetLogicalProcessorInformation(NULL, &byteSize) || GetLastError() != ERROR_INSUFFICIENT_BUFFER || byteSize == 0) {
        return 0;
    }

    buffer = (SYSTEM_LOGICAL_PROCESSOR_INFORMATION *)malloc(byteSize);
    if (buffer == NULL) {
        return 0;
    }

    if (!GetLogicalProcessorInformation(buffer, &byteSize)) {
        free(buffer);
        return 0;
    }

    for (i = 0; i < byteSize / sizeof(SYSTEM_LOGICAL_PROCESSOR_INFORMATION); i++) {
        CACHE_DESCRIPTOR cache;

        if (buffer[i].Relationship != RelationCache) {
            continue;
        }

        cache = buffer[i].Cache;
        if (cache.LineSize == 0) {
            continue;
        }

        if (cache.Level == 1 && (cache.Type == CacheData || cache.Type == CacheUnified)) {
            int64_t lineSize = cache.LineSize;
            free(buffer);
            return lineSize;
        }

        if (fallback == 0) {
            fallback = cache.LineSize;
        }
    }

    free(buffer);
    return fallback;
#else
    return 0;
#endif
}

EXTERN_C_ENTER

// ngetPageSize()I
JNIEXPORT jint JNICALL Java_org_lwjgl_system_MemoryUtil_ngetPageSize(JNIEnv *env, jclass clazz) {
    UNUSED_PARAMS(env, clazz)
    return (int)queryPageSize();
}

// ngetCacheLineSize()I
JNIEXPORT jint JNICALL Java_org_lwjgl_system_MemoryUtil_ngetCacheLineSize(JNIEnv *env, jclass clazz) {
    UNUSED_PARAMS(env, clazz)
    return (int)queryCacheLineSize();
}

// memGlobalRefToObject(J)Ljava/lang/Object;
JNIEXPORT jobject JNICALL Java_org_lwjgl_system_MemoryUtil_memGlobalRefToObject(JNIEnv *env, jclass clazz,
    jlong globalRef
) {
    UNUSED_PARAMS(env, clazz)
    return (jobject)(uintptr_t)globalRef;
}

EXTERN_C_EXIT
