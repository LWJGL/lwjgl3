/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#ifdef LWJGL_LINUX
    _Pragma("GCC diagnostic ignored \"-Wsign-compare\"")
#endif
#include "liburing.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1get_1probe_1ring(JNIEnv *__env, jclass clazz, jlong ringAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)io_uring_get_probe_ring(ring);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1get_1probe(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)io_uring_get_probe();
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1free_1probe(JNIEnv *__env, jclass clazz, jlong probeAddress) {
    struct io_uring_probe *probe = (struct io_uring_probe *)(uintptr_t)probeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_free_probe(probe);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1opcode_1supported(JNIEnv *__env, jclass clazz, jlong pAddress, jint op) {
    struct io_uring_probe const *p = (struct io_uring_probe const *)(uintptr_t)pAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_opcode_supported(p, op);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1queue_1init_1mem(JNIEnv *__env, jclass clazz, jint entries, jlong ringAddress, jlong pAddress, jlong bufAddress, jlong buf_size) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct io_uring_params *p = (struct io_uring_params *)(uintptr_t)pAddress;
    void *buf = (void *)(uintptr_t)bufAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_queue_init_mem((unsigned)entries, ring, p, buf, (size_t)buf_size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1queue_1init_1params(JNIEnv *__env, jclass clazz, jint entries, jlong ringAddress, jlong pAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct io_uring_params *p = (struct io_uring_params *)(uintptr_t)pAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_queue_init_params((unsigned)entries, ring, p);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1queue_1init(JNIEnv *__env, jclass clazz, jint entries, jlong ringAddress, jint flags) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_queue_init((unsigned)entries, ring, (unsigned)flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1queue_1mmap(JNIEnv *__env, jclass clazz, jint fd, jlong pAddress, jlong ringAddress) {
    struct io_uring_params *p = (struct io_uring_params *)(uintptr_t)pAddress;
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_queue_mmap(fd, p, ring);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1ring_1dontfork(JNIEnv *__env, jclass clazz, jlong ringAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_ring_dontfork(ring);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1queue_1exit(JNIEnv *__env, jclass clazz, jlong ringAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_queue_exit(ring);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1peek_1batch_1cqe(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong cqesAddress, jint count) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct io_uring_cqe **cqes = (struct io_uring_cqe **)(uintptr_t)cqesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_peek_batch_cqe(ring, cqes, (unsigned)count);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1wait_1cqes(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong cqe_ptrAddress, jint wait_nr, jlong tsAddress, jlong sigmaskAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct io_uring_cqe **cqe_ptr = (struct io_uring_cqe **)(uintptr_t)cqe_ptrAddress;
    struct __kernel_timespec *ts = (struct __kernel_timespec *)(uintptr_t)tsAddress;
    sigset_t *sigmask = (sigset_t *)(uintptr_t)sigmaskAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_wait_cqes(ring, cqe_ptr, (unsigned)wait_nr, ts, sigmask);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1wait_1cqes_1min_1timeout(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong cqe_ptrAddress, jint wait_nr, jlong tsAddress, jint min_ts_usec, jlong sigmaskAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct io_uring_cqe **cqe_ptr = (struct io_uring_cqe **)(uintptr_t)cqe_ptrAddress;
    struct __kernel_timespec *ts = (struct __kernel_timespec *)(uintptr_t)tsAddress;
    sigset_t *sigmask = (sigset_t *)(uintptr_t)sigmaskAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_wait_cqes_min_timeout(ring, cqe_ptr, (unsigned)wait_nr, ts, (unsigned int)min_ts_usec, sigmask);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1wait_1cqe_1timeout(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong cqe_ptrAddress, jlong tsAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct io_uring_cqe **cqe_ptr = (struct io_uring_cqe **)(uintptr_t)cqe_ptrAddress;
    struct __kernel_timespec *ts = (struct __kernel_timespec *)(uintptr_t)tsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_wait_cqe_timeout(ring, cqe_ptr, ts);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1submit(JNIEnv *__env, jclass clazz, jlong ringAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_submit(ring);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1submit_1and_1wait(JNIEnv *__env, jclass clazz, jlong ringAddress, jint wait_nr) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_submit_and_wait(ring, (unsigned)wait_nr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1submit_1and_1wait_1timeout(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong cqe_ptrAddress, jint wait_nr, jlong tsAddress, jlong sigmaskAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct io_uring_cqe **cqe_ptr = (struct io_uring_cqe **)(uintptr_t)cqe_ptrAddress;
    struct __kernel_timespec *ts = (struct __kernel_timespec *)(uintptr_t)tsAddress;
    sigset_t *sigmask = (sigset_t *)(uintptr_t)sigmaskAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_submit_and_wait_timeout(ring, cqe_ptr, (unsigned)wait_nr, ts, sigmask);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1submit_1and_1wait_1min_1timeout(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong cqe_ptrAddress, jint wait_nr, jlong tsAddress, jint min_wait, jlong sigmaskAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct io_uring_cqe **cqe_ptr = (struct io_uring_cqe **)(uintptr_t)cqe_ptrAddress;
    struct __kernel_timespec *ts = (struct __kernel_timespec *)(uintptr_t)tsAddress;
    sigset_t *sigmask = (sigset_t *)(uintptr_t)sigmaskAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_submit_and_wait_min_timeout(ring, cqe_ptr, (unsigned)wait_nr, ts, (unsigned)min_wait, sigmask);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1submit_1and_1wait_1reg(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong cqe_ptrAddress, jint wait_nr, jint reg_index) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct io_uring_cqe **cqe_ptr = (struct io_uring_cqe **)(uintptr_t)cqe_ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_submit_and_wait_reg(ring, cqe_ptr, (unsigned)wait_nr, reg_index);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1wait_1reg(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong regAddress, jint nr) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct io_uring_reg_wait *reg = (struct io_uring_reg_wait *)(uintptr_t)regAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_wait_reg(ring, reg, nr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1resize_1rings(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong pAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct io_uring_params *p = (struct io_uring_params *)(uintptr_t)pAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_resize_rings(ring, p);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1clone_1buffers_1offset(JNIEnv *__env, jclass clazz, jlong dstAddress, jlong srcAddress, jint dst_off, jint src_off, jint nr, jint flags) {
    struct io_uring *dst = (struct io_uring *)(uintptr_t)dstAddress;
    struct io_uring *src = (struct io_uring *)(uintptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_clone_buffers_offset(dst, src, (unsigned)dst_off, (unsigned)src_off, (unsigned)nr, (unsigned)flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1clone_1buffers(JNIEnv *__env, jclass clazz, jlong dstAddress, jlong srcAddress) {
    struct io_uring *dst = (struct io_uring *)(uintptr_t)dstAddress;
    struct io_uring *src = (struct io_uring *)(uintptr_t)srcAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_clone_buffers(dst, src);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1buffers(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong iovecsAddress, jint nr_iovecs) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct iovec const *iovecs = (struct iovec const *)(uintptr_t)iovecsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_buffers(ring, iovecs, (unsigned)nr_iovecs);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1buffers_1tags(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong iovecsAddress, jlong tagsAddress, jint nr) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct iovec const *iovecs = (struct iovec const *)(uintptr_t)iovecsAddress;
    __u64 const *tags = (__u64 const *)(uintptr_t)tagsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_buffers_tags(ring, iovecs, tags, (unsigned)nr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1buffers_1sparse(JNIEnv *__env, jclass clazz, jlong ringAddress, jint nr_iovecs) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_buffers_sparse(ring, (unsigned)nr_iovecs);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1buffers_1update_1tag(JNIEnv *__env, jclass clazz, jlong ringAddress, jint off, jlong iovecsAddress, jlong tagsAddress, jint nr) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct iovec const *iovecs = (struct iovec const *)(uintptr_t)iovecsAddress;
    __u64 const *tags = (__u64 const *)(uintptr_t)tagsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_buffers_update_tag(ring, (unsigned)off, iovecs, tags, (unsigned)nr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1unregister_1buffers(JNIEnv *__env, jclass clazz, jlong ringAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_unregister_buffers(ring);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1files(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong filesAddress, jint nr_files) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    int const *files = (int const *)(uintptr_t)filesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_files(ring, files, (unsigned)nr_files);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1files_1tags(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong filesAddress, jlong tagsAddress, jint nr) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    int const *files = (int const *)(uintptr_t)filesAddress;
    __u64 const *tags = (__u64 const *)(uintptr_t)tagsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_files_tags(ring, files, tags, (unsigned)nr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1files_1sparse(JNIEnv *__env, jclass clazz, jlong ringAddress, jint nr_files) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_files_sparse(ring, (unsigned)nr_files);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1files_1update_1tag(JNIEnv *__env, jclass clazz, jlong ringAddress, jint off, jlong filesAddress, jlong tagsAddress, jint nr_files) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    int const *files = (int const *)(uintptr_t)filesAddress;
    __u64 const *tags = (__u64 const *)(uintptr_t)tagsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_files_update_tag(ring, (unsigned)off, files, tags, (unsigned)nr_files);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1unregister_1files(JNIEnv *__env, jclass clazz, jlong ringAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_unregister_files(ring);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1files_1update(JNIEnv *__env, jclass clazz, jlong ringAddress, jint off, jlong filesAddress, jint nr_files) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    int const *files = (int const *)(uintptr_t)filesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_files_update(ring, (unsigned)off, files, (unsigned)nr_files);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1eventfd(JNIEnv *__env, jclass clazz, jlong ringAddress, jint fd) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_eventfd(ring, fd);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1eventfd_1async(JNIEnv *__env, jclass clazz, jlong ringAddress, jint fd) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_eventfd_async(ring, fd);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1unregister_1eventfd(JNIEnv *__env, jclass clazz, jlong ringAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_unregister_eventfd(ring);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1probe(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong pAddress, jint nr) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct io_uring_probe *p = (struct io_uring_probe *)(uintptr_t)pAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_probe(ring, p, (unsigned)nr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1personality(JNIEnv *__env, jclass clazz, jlong ringAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_personality(ring);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1unregister_1personality(JNIEnv *__env, jclass clazz, jlong ringAddress, jint id) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_unregister_personality(ring, id);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1restrictions(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong resAddress, jint nr_res) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct io_uring_restriction *res = (struct io_uring_restriction *)(uintptr_t)resAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_restrictions(ring, res, (unsigned)nr_res);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1enable_1rings(JNIEnv *__env, jclass clazz, jlong ringAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_enable_rings(ring);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_n_1_1io_1uring_1sqring_1wait(JNIEnv *__env, jclass clazz, jlong ringAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)__io_uring_sqring_wait(ring);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1iowq_1aff(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong cpusz, jlong maskAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    cpu_set_t const *mask = (cpu_set_t const *)(uintptr_t)maskAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_iowq_aff(ring, (size_t)cpusz, mask);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1unregister_1iowq_1aff(JNIEnv *__env, jclass clazz, jlong ringAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_unregister_iowq_aff(ring);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1iowq_1max_1workers(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong valuesAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    unsigned int *values = (unsigned int *)(uintptr_t)valuesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_iowq_max_workers(ring, values);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1ring_1fd(JNIEnv *__env, jclass clazz, jlong ringAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_ring_fd(ring);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1unregister_1ring_1fd(JNIEnv *__env, jclass clazz, jlong ringAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_unregister_ring_fd(ring);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1close_1ring_1fd(JNIEnv *__env, jclass clazz, jlong ringAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_close_ring_fd(ring);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1buf_1ring(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong regAddress, jint flags) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct io_uring_buf_reg *reg = (struct io_uring_buf_reg *)(uintptr_t)regAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_buf_ring(ring, reg, (unsigned int)flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1unregister_1buf_1ring(JNIEnv *__env, jclass clazz, jlong ringAddress, jint bgid) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_unregister_buf_ring(ring, bgid);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1buf_1ring_1head(JNIEnv *__env, jclass clazz, jlong ringAddress, jint buf_group, jlong headAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    unsigned short *head = (unsigned short *)(uintptr_t)headAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_buf_ring_head(ring, buf_group, head);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1sync_1cancel(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong regAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct io_uring_sync_cancel_reg *reg = (struct io_uring_sync_cancel_reg *)(uintptr_t)regAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_sync_cancel(ring, reg);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1file_1alloc_1range(JNIEnv *__env, jclass clazz, jlong ringAddress, jint off, jint len) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_file_alloc_range(ring, (unsigned)off, (unsigned)len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1napi(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong napiAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct io_uring_napi *napi = (struct io_uring_napi *)(uintptr_t)napiAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_napi(ring, napi);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1unregister_1napi(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong napiAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct io_uring_napi *napi = (struct io_uring_napi *)(uintptr_t)napiAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_unregister_napi(ring, napi);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1ifq(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong regAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct io_uring_zcrx_ifq_reg *reg = (struct io_uring_zcrx_ifq_reg *)(uintptr_t)regAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_ifq(ring, reg);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1clock(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong argAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct io_uring_clock_register *arg = (struct io_uring_clock_register *)(uintptr_t)argAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_clock(ring, arg);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1get_1events(JNIEnv *__env, jclass clazz, jlong ringAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_get_events(ring);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1submit_1and_1get_1events(JNIEnv *__env, jclass clazz, jlong ringAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_submit_and_get_events(ring);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1enter(JNIEnv *__env, jclass clazz, jint fd, jint to_submit, jint min_complete, jint flags, jlong sigAddress) {
    sigset_t *sig = (sigset_t *)(uintptr_t)sigAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_enter((unsigned int)fd, (unsigned int)to_submit, (unsigned int)min_complete, (unsigned int)flags, sig);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1enter2(JNIEnv *__env, jclass clazz, jint fd, jint to_submit, jint min_complete, jint flags, jlong argAddress, jlong sz) {
    void *arg = (void *)(uintptr_t)argAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_enter2((unsigned int)fd, (unsigned int)to_submit, (unsigned int)min_complete, (unsigned int)flags, arg, (size_t)sz);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1setup(JNIEnv *__env, jclass clazz, jint entries, jlong pAddress) {
    struct io_uring_params *p = (struct io_uring_params *)(uintptr_t)pAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_setup((unsigned int)entries, p);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_io_1uring_1register(JNIEnv *__env, jclass clazz, jint fd, jint opcode, jlong argAddress, jint nr_args) {
    void *arg = (void *)(uintptr_t)argAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register((unsigned int)fd, (unsigned int)opcode, arg, (unsigned int)nr_args);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1region(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong regAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct io_uring_mem_region_reg *reg = (struct io_uring_mem_region_reg *)(uintptr_t)regAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_region(ring, reg);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1setup_1buf_1ring(JNIEnv *__env, jclass clazz, jlong ringAddress, jint nentries, jint bgid, jint flags, jlong errAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    int *err = (int *)(uintptr_t)errAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)io_uring_setup_buf_ring(ring, (unsigned int)nentries, bgid, (unsigned int)flags, err);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1free_1buf_1ring(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong brAddress, jint nentries, jint bgid) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct io_uring_buf_ring *br = (struct io_uring_buf_ring *)(uintptr_t)brAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_free_buf_ring(ring, br, (unsigned int)nentries, bgid);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1set_1iowait(JNIEnv *__env, jclass clazz, jlong ringAddress, jboolean enable_iowait) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_set_iowait(ring, (bool)enable_iowait);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_io_1uring_1cqe_1shift_1from_1flags(JNIEnv *__env, jclass clazz, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_cqe_shift_from_flags((unsigned)flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1cqe_1shift(JNIEnv *__env, jclass clazz, jlong ringAddress) {
    struct io_uring const *ring = (struct io_uring const *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_cqe_shift(ring);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1cqe_1nr(JNIEnv *__env, jclass clazz, jlong cqeAddress) {
    struct io_uring_cqe const *cqe = (struct io_uring_cqe const *)(uintptr_t)cqeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_cqe_nr(cqe);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1cq_1advance(JNIEnv *__env, jclass clazz, jlong ringAddress, jint nr) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_cq_advance(ring, (unsigned)nr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1cqe_1seen(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong cqeAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct io_uring_cqe *cqe = (struct io_uring_cqe *)(uintptr_t)cqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_cqe_seen(ring, cqe);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1sqe_1set_1data(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong dataAddress) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    void *data = (void *)(uintptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_sqe_set_data(sqe, data);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1cqe_1get_1data(JNIEnv *__env, jclass clazz, jlong cqeAddress) {
    struct io_uring_cqe const *cqe = (struct io_uring_cqe const *)(uintptr_t)cqeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)io_uring_cqe_get_data(cqe);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1sqe_1set_1data64(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong data) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_sqe_set_data64(sqe, (__u64)data);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1cqe_1get_1data64(JNIEnv *__env, jclass clazz, jlong cqeAddress) {
    struct io_uring_cqe const *cqe = (struct io_uring_cqe const *)(uintptr_t)cqeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)io_uring_cqe_get_data64(cqe);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1sqe_1set_1flags(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_sqe_set_flags(sqe, (unsigned int)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1sqe_1set_1buf_1group(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint bgid) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_sqe_set_buf_group(sqe, bgid);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1initialize_1sqe(JNIEnv *__env, jclass clazz, jlong sqeAddress) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_initialize_sqe(sqe);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1splice(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd_in, jlong off_in, jint fd_out, jlong off_out, jint nbytes, jint splice_flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_splice(sqe, fd_in, (int64_t)off_in, fd_out, (int64_t)off_out, (unsigned int)nbytes, (unsigned int)splice_flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1tee(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd_in, jint fd_out, jint nbytes, jint splice_flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_tee(sqe, fd_in, fd_out, (unsigned int)nbytes, (unsigned int)splice_flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1readv(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong iovecsAddress, jint nr_vecs, jint offset) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct iovec const *iovecs = (struct iovec const *)(uintptr_t)iovecsAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_readv(sqe, fd, iovecs, (unsigned int)nr_vecs, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1readv2(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong iovecsAddress, jint nr_vecs, jint offset, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct iovec const *iovecs = (struct iovec const *)(uintptr_t)iovecsAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_readv2(sqe, fd, iovecs, (unsigned int)nr_vecs, offset, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1read_1fixed(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong bufAddress, jint nbytes, jlong offset, jint buf_index) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    void *buf = (void *)(uintptr_t)bufAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_read_fixed(sqe, fd, buf, (unsigned int)nbytes, (__u64)offset, buf_index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1readv_1fixed(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong iovecsAddress, jint nr_vecs, jlong offset, jint flags, jint buf_index) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct iovec const *iovecs = (struct iovec const *)(uintptr_t)iovecsAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_readv_fixed(sqe, fd, iovecs, (unsigned int)nr_vecs, (__u64)offset, flags, buf_index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1writev(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong iovecsAddress, jint nr_vecs, jlong offset) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct iovec const *iovecs = (struct iovec const *)(uintptr_t)iovecsAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_writev(sqe, fd, iovecs, (unsigned int)nr_vecs, (__u64)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1writev2(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong iovecsAddress, jint nr_vecs, jlong offset, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct iovec const *iovecs = (struct iovec const *)(uintptr_t)iovecsAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_writev2(sqe, fd, iovecs, (unsigned int)nr_vecs, (__u64)offset, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1write_1fixed(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong bufAddress, jint nbytes, jlong offset, jint buf_index) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    void const *buf = (void const *)(uintptr_t)bufAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_write_fixed(sqe, fd, buf, (unsigned int)nbytes, (__u64)offset, buf_index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1writev_1fixed(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong iovecsAddress, jint nr_vecs, jlong offset, jint flags, jint buf_index) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct iovec const *iovecs = (struct iovec const *)(uintptr_t)iovecsAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_writev_fixed(sqe, fd, iovecs, (unsigned int)nr_vecs, (__u64)offset, flags, buf_index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1recvmsg(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong msgAddress, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct msghdr *msg = (struct msghdr *)(uintptr_t)msgAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_recvmsg(sqe, fd, msg, (unsigned)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1recvmsg_1multishot(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong msgAddress, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct msghdr *msg = (struct msghdr *)(uintptr_t)msgAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_recvmsg_multishot(sqe, fd, msg, (unsigned)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1sendmsg(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong msgAddress, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct msghdr const *msg = (struct msghdr const *)(uintptr_t)msgAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_sendmsg(sqe, fd, msg, (unsigned)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1poll_1add(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jint poll_mask) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_poll_add(sqe, fd, (unsigned)poll_mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1poll_1multishot(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jint poll_mask) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_poll_multishot(sqe, fd, (unsigned)poll_mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1poll_1remove(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong user_data) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_poll_remove(sqe, (__u64)user_data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1poll_1update(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong old_user_data, jlong new_user_data, jint poll_mask, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_poll_update(sqe, (__u64)old_user_data, (__u64)new_user_data, (unsigned)poll_mask, (unsigned)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1fsync(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jint fsync_flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_fsync(sqe, fd, (unsigned)fsync_flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1nop(JNIEnv *__env, jclass clazz, jlong sqeAddress) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_nop(sqe);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1nop128(JNIEnv *__env, jclass clazz, jlong sqeAddress) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_nop128(sqe);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1timeout(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong tsAddress, jint count, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct __kernel_timespec const *ts = (struct __kernel_timespec const *)(uintptr_t)tsAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_timeout(sqe, ts, (unsigned)count, (unsigned)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1timeout_1remove(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong user_data, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_timeout_remove(sqe, (__u64)user_data, (unsigned)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1timeout_1update(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong tsAddress, jlong user_data, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct __kernel_timespec const *ts = (struct __kernel_timespec const *)(uintptr_t)tsAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_timeout_update(sqe, ts, (__u64)user_data, (unsigned)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1accept(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong addrAddress, jlong addrlenAddress, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct sockaddr *addr = (struct sockaddr *)(uintptr_t)addrAddress;
    socklen_t *addrlen = (socklen_t *)(uintptr_t)addrlenAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_accept(sqe, fd, addr, addrlen, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1accept_1direct(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong addrAddress, jlong addrlenAddress, jint flags, jint file_index) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct sockaddr *addr = (struct sockaddr *)(uintptr_t)addrAddress;
    socklen_t *addrlen = (socklen_t *)(uintptr_t)addrlenAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_accept_direct(sqe, fd, addr, addrlen, flags, (unsigned int)file_index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1multishot_1accept(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong addrAddress, jlong addrlenAddress, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct sockaddr *addr = (struct sockaddr *)(uintptr_t)addrAddress;
    socklen_t *addrlen = (socklen_t *)(uintptr_t)addrlenAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_multishot_accept(sqe, fd, addr, addrlen, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1multishot_1accept_1direct(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong addrAddress, jlong addrlenAddress, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct sockaddr *addr = (struct sockaddr *)(uintptr_t)addrAddress;
    socklen_t *addrlen = (socklen_t *)(uintptr_t)addrlenAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_multishot_accept_direct(sqe, fd, addr, addrlen, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1cancel64(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong user_data, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_cancel64(sqe, (__u64)user_data, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1cancel(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong user_dataAddress, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    void *user_data = (void *)(uintptr_t)user_dataAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_cancel(sqe, user_data, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1cancel_1fd(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_cancel_fd(sqe, fd, (unsigned int)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1link_1timeout(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong tsAddress, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct __kernel_timespec const *ts = (struct __kernel_timespec const *)(uintptr_t)tsAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_link_timeout(sqe, ts, (unsigned)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1connect(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong addrAddress, jint addrlen) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct sockaddr const *addr = (struct sockaddr const *)(uintptr_t)addrAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_connect(sqe, fd, addr, (socklen_t)addrlen);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1bind(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong addrAddress, jint addrlen) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct sockaddr const *addr = (struct sockaddr const *)(uintptr_t)addrAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_bind(sqe, fd, addr, (socklen_t)addrlen);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1listen(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jint backlog) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_listen(sqe, fd, backlog);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1epoll_1wait(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong eventsAddress, jint maxevents, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct epoll_event *events = (struct epoll_event *)(uintptr_t)eventsAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_epoll_wait(sqe, fd, events, (unsigned int)maxevents, (unsigned)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1files_1update(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong fdsAddress, jint nr_fds, jint offset) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    int *fds = (int *)(uintptr_t)fdsAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_files_update(sqe, fds, (unsigned)nr_fds, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1fallocate(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jint mode, jlong offset, jlong len) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_fallocate(sqe, fd, mode, (__u64)offset, (__u64)len);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1openat(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint dfd, jlong pathAddress, jint flags, jint mode) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    char const *path = (char const *)(uintptr_t)pathAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_openat(sqe, dfd, path, flags, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1openat_1direct(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint dfd, jlong pathAddress, jint flags, jint mode, jint file_index) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    char const *path = (char const *)(uintptr_t)pathAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_openat_direct(sqe, dfd, path, flags, mode, (unsigned int)file_index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1open(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong pathAddress, jint flags, jint mode) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    char const *path = (char const *)(uintptr_t)pathAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_open(sqe, path, flags, (mode_t)mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1open_1direct(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong pathAddress, jint flags, jint mode, jint file_index) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    char const *path = (char const *)(uintptr_t)pathAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_open_direct(sqe, path, flags, (mode_t)mode, (unsigned)file_index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1close(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_close(sqe, fd);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1close_1direct(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint file_index) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_close_direct(sqe, (unsigned int)file_index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1read(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong bufAddress, jint nbytes, jlong offset) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    void *buf = (void *)(uintptr_t)bufAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_read(sqe, fd, buf, (unsigned int)nbytes, (__u64)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1read_1multishot(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jint nbytes, jlong offset, jint buf_group) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_read_multishot(sqe, fd, (unsigned int)nbytes, (__u64)offset, buf_group);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1write(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong bufAddress, jint nbytes, jlong offset) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    void const *buf = (void const *)(uintptr_t)bufAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_write(sqe, fd, buf, (unsigned int)nbytes, (__u64)offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1statx(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint dfd, jlong pathAddress, jint flags, jint mask, jlong statxbufAddress) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    char const *path = (char const *)(uintptr_t)pathAddress;
    struct statx *statxbuf = (struct statx *)(uintptr_t)statxbufAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_statx(sqe, dfd, path, flags, (unsigned)mask, statxbuf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1fadvise(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong offset, jint len, jint advice) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_fadvise(sqe, fd, (__u64)offset, (__u32)len, advice);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1madvise(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong addrAddress, jint length, jint advice) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    void *addr = (void *)(uintptr_t)addrAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_madvise(sqe, addr, (__u32)length, advice);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1fadvise64(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong offset, jlong len, jint advice) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_fadvise64(sqe, fd, (__u64)offset, (off_t)len, advice);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1madvise64(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong addrAddress, jlong length, jint advice) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    void *addr = (void *)(uintptr_t)addrAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_madvise64(sqe, addr, (off_t)length, advice);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1send(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint sockfd, jlong bufAddress, jlong len, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    void const *buf = (void const *)(uintptr_t)bufAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_send(sqe, sockfd, buf, (size_t)len, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1send_1bundle(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint sockfd, jlong len, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_send_bundle(sqe, sockfd, (size_t)len, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1send_1set_1addr(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong dest_addrAddress, jshort addr_len) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct sockaddr const *dest_addr = (struct sockaddr const *)(uintptr_t)dest_addrAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_send_set_addr(sqe, dest_addr, (__u16)addr_len);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1sendto(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint sockfd, jlong bufAddress, jlong len, jint flags, jlong addrAddress, jint addrlen) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    void const *buf = (void const *)(uintptr_t)bufAddress;
    struct sockaddr const *addr = (struct sockaddr const *)(uintptr_t)addrAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_sendto(sqe, sockfd, buf, (size_t)len, flags, addr, (socklen_t)addrlen);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1send_1zc(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint sockfd, jlong bufAddress, jlong len, jint flags, jint zc_flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    void const *buf = (void const *)(uintptr_t)bufAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_send_zc(sqe, sockfd, buf, (size_t)len, flags, (unsigned)zc_flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1send_1zc_1fixed(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint sockfd, jlong bufAddress, jlong len, jint flags, jint zc_flags, jint buf_index) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    void const *buf = (void const *)(uintptr_t)bufAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_send_zc_fixed(sqe, sockfd, buf, (size_t)len, flags, (unsigned)zc_flags, (unsigned)buf_index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1sendmsg_1zc(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong msgAddress, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct msghdr const *msg = (struct msghdr const *)(uintptr_t)msgAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_sendmsg_zc(sqe, fd, msg, (unsigned)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1sendmsg_1zc_1fixed(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong msgAddress, jint flags, jint buf_index) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct msghdr const *msg = (struct msghdr const *)(uintptr_t)msgAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_sendmsg_zc_fixed(sqe, fd, msg, (unsigned)flags, (unsigned)buf_index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1recv(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint sockfd, jlong bufAddress, jlong len, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    void *buf = (void *)(uintptr_t)bufAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_recv(sqe, sockfd, buf, (size_t)len, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1recv_1multishot(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint sockfd, jlong bufAddress, jlong len, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    void *buf = (void *)(uintptr_t)bufAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_recv_multishot(sqe, sockfd, buf, (size_t)len, flags);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1recvmsg_1validate(JNIEnv *__env, jclass clazz, jlong bufAddress, jint buf_len, jlong msghAddress) {
    void *buf = (void *)(uintptr_t)bufAddress;
    struct msghdr *msgh = (struct msghdr *)(uintptr_t)msghAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)io_uring_recvmsg_validate(buf, buf_len, msgh);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1recvmsg_1name(JNIEnv *__env, jclass clazz, jlong oAddress) {
    struct io_uring_recvmsg_out *o = (struct io_uring_recvmsg_out *)(uintptr_t)oAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)io_uring_recvmsg_name(o);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1recvmsg_1cmsg_1firsthdr(JNIEnv *__env, jclass clazz, jlong oAddress, jlong msghAddress) {
    struct io_uring_recvmsg_out *o = (struct io_uring_recvmsg_out *)(uintptr_t)oAddress;
    struct msghdr *msgh = (struct msghdr *)(uintptr_t)msghAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)io_uring_recvmsg_cmsg_firsthdr(o, msgh);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1recvmsg_1cmsg_1nexthdr(JNIEnv *__env, jclass clazz, jlong oAddress, jlong msghAddress, jlong cmsgAddress) {
    struct io_uring_recvmsg_out *o = (struct io_uring_recvmsg_out *)(uintptr_t)oAddress;
    struct msghdr *msgh = (struct msghdr *)(uintptr_t)msghAddress;
    struct cmsghdr *cmsg = (struct cmsghdr *)(uintptr_t)cmsgAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)io_uring_recvmsg_cmsg_nexthdr(o, msgh, cmsg);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1recvmsg_1payload(JNIEnv *__env, jclass clazz, jlong oAddress, jlong msghAddress) {
    struct io_uring_recvmsg_out *o = (struct io_uring_recvmsg_out *)(uintptr_t)oAddress;
    struct msghdr *msgh = (struct msghdr *)(uintptr_t)msghAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)io_uring_recvmsg_payload(o, msgh);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1recvmsg_1payload_1length(JNIEnv *__env, jclass clazz, jlong oAddress, jint buf_len, jlong msghAddress) {
    struct io_uring_recvmsg_out *o = (struct io_uring_recvmsg_out *)(uintptr_t)oAddress;
    struct msghdr *msgh = (struct msghdr *)(uintptr_t)msghAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_recvmsg_payload_length(o, buf_len, msgh);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1openat2(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint dfd, jlong pathAddress, jlong howAddress) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    char const *path = (char const *)(uintptr_t)pathAddress;
    struct open_how const *how = (struct open_how const *)(uintptr_t)howAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_openat2(sqe, dfd, path, how);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1openat2_1direct(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint dfd, jlong pathAddress, jlong howAddress, jint file_index) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    char const *path = (char const *)(uintptr_t)pathAddress;
    struct open_how const *how = (struct open_how const *)(uintptr_t)howAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_openat2_direct(sqe, dfd, path, how, (unsigned)file_index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1epoll_1ctl(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint epfd, jint fd, jint op, jlong evAddress) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct epoll_event const *ev = (struct epoll_event const *)(uintptr_t)evAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_epoll_ctl(sqe, epfd, fd, op, ev);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1provide_1buffers(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong addrAddress, jint len, jint nr, jint bgid, jint bid) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    void *addr = (void *)(uintptr_t)addrAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_provide_buffers(sqe, addr, len, nr, bgid, bid);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1remove_1buffers(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint nr, jint bgid) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_remove_buffers(sqe, nr, bgid);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1shutdown(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jint how) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_shutdown(sqe, fd, how);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1unlinkat(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint dfd, jlong pathAddress, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    char const *path = (char const *)(uintptr_t)pathAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_unlinkat(sqe, dfd, path, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1unlink(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong pathAddress, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    char const *path = (char const *)(uintptr_t)pathAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_unlink(sqe, path, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1renameat(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint olddfd, jlong oldpathAddress, jint newdfd, jlong newpathAddress, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    char const *oldpath = (char const *)(uintptr_t)oldpathAddress;
    char const *newpath = (char const *)(uintptr_t)newpathAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_renameat(sqe, olddfd, oldpath, newdfd, newpath, (unsigned int)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1rename(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong oldpathAddress, jlong newpathAddress) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    char const *oldpath = (char const *)(uintptr_t)oldpathAddress;
    char const *newpath = (char const *)(uintptr_t)newpathAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_rename(sqe, oldpath, newpath);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1sync_1file_1range(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jint len, jlong offset, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_sync_file_range(sqe, fd, (unsigned)len, (__u64)offset, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1mkdirat(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint dfd, jlong pathAddress, jint mode) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    char const *path = (char const *)(uintptr_t)pathAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_mkdirat(sqe, dfd, path, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1mkdir(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong pathAddress, jint mode) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    char const *path = (char const *)(uintptr_t)pathAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_mkdir(sqe, path, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1symlinkat(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong targetAddress, jint newdirfd, jlong linkpathAddress) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    char const *target = (char const *)(uintptr_t)targetAddress;
    char const *linkpath = (char const *)(uintptr_t)linkpathAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_symlinkat(sqe, target, newdirfd, linkpath);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1symlink(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong targetAddress, jlong linkpathAddress) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    char const *target = (char const *)(uintptr_t)targetAddress;
    char const *linkpath = (char const *)(uintptr_t)linkpathAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_symlink(sqe, target, linkpath);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1linkat(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint olddfd, jlong oldpathAddress, jint newdfd, jlong newpathAddress, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    char const *oldpath = (char const *)(uintptr_t)oldpathAddress;
    char const *newpath = (char const *)(uintptr_t)newpathAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_linkat(sqe, olddfd, oldpath, newdfd, newpath, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1link(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong oldpathAddress, jlong newpathAddress, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    char const *oldpath = (char const *)(uintptr_t)oldpathAddress;
    char const *newpath = (char const *)(uintptr_t)newpathAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_link(sqe, oldpath, newpath, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1msg_1ring_1cqe_1flags(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jint len, jlong data, jint flags, jint cqe_flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_msg_ring_cqe_flags(sqe, fd, (unsigned int)len, (__u64)data, (unsigned int)flags, (unsigned int)cqe_flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1msg_1ring(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jint len, jlong data, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_msg_ring(sqe, fd, (unsigned int)len, (__u64)data, (unsigned int)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1msg_1ring_1fd(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jint source_fd, jint target_fd, jlong data, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_msg_ring_fd(sqe, fd, source_fd, target_fd, (__u64)data, (unsigned int)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1msg_1ring_1fd_1alloc(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jint source_fd, jlong data, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_msg_ring_fd_alloc(sqe, fd, source_fd, (__u64)data, (unsigned int)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1getxattr(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong nameAddress, jlong valueAddress, jlong pathAddress, jint len) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    char *value = (char *)(uintptr_t)valueAddress;
    char const *path = (char const *)(uintptr_t)pathAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_getxattr(sqe, name, value, path, (unsigned int)len);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1setxattr(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong nameAddress, jlong valueAddress, jlong pathAddress, jint flags, jint len) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    char const *value = (char const *)(uintptr_t)valueAddress;
    char const *path = (char const *)(uintptr_t)pathAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_setxattr(sqe, name, value, path, flags, (unsigned int)len);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1fgetxattr(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong nameAddress, jlong valueAddress, jint len) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    char *value = (char *)(uintptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_fgetxattr(sqe, fd, name, value, (unsigned int)len);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1fsetxattr(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong nameAddress, jlong valueAddress, jint flags, jint len) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    char const *value = (char const *)(uintptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_fsetxattr(sqe, fd, name, value, flags, (unsigned int)len);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1socket(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint domain, jint type, jint protocol, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_socket(sqe, domain, type, protocol, (unsigned int)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1socket_1direct(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint domain, jint type, jint protocol, jint file_index, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_socket_direct(sqe, domain, type, protocol, (unsigned)file_index, (unsigned int)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1socket_1direct_1alloc(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint domain, jint type, jint protocol, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_socket_direct_alloc(sqe, domain, type, protocol, (unsigned int)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1uring_1cmd(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint cmd_op, jint fd) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_uring_cmd(sqe, cmd_op, fd);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1uring_1cmd128(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint cmd_op, jint fd) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_uring_cmd128(sqe, cmd_op, fd);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1cmd_1sock(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint cmd_op, jint fd, jint level, jint optname, jlong optvalAddress, jint optlen) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    void *optval = (void *)(uintptr_t)optvalAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_cmd_sock(sqe, cmd_op, fd, level, optname, optval, optlen);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1cmd_1getsockname(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong sockaddrAddress, jlong sockaddr_lenAddress, jint peer) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct sockaddr *sockaddr = (struct sockaddr *)(uintptr_t)sockaddrAddress;
    socklen_t *sockaddr_len = (socklen_t *)(uintptr_t)sockaddr_lenAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_cmd_getsockname(sqe, fd, sockaddr, sockaddr_len, peer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1waitid(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint idtype, jint id, jlong infopAddress, jint options, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    siginfo_t *infop = (siginfo_t *)(uintptr_t)infopAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_waitid(sqe, (idtype_t)idtype, (id_t)id, infop, options, (unsigned int)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1futex_1wake(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong futexAddress, jlong val, jlong mask, jint futex_flags, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    uint32_t const *futex = (uint32_t const *)(uintptr_t)futexAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_futex_wake(sqe, futex, (uint64_t)val, (uint64_t)mask, (uint32_t)futex_flags, (unsigned int)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1futex_1wait(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong futexAddress, jlong val, jlong mask, jint futex_flags, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    uint32_t const *futex = (uint32_t const *)(uintptr_t)futexAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_futex_wait(sqe, futex, (uint64_t)val, (uint64_t)mask, (uint32_t)futex_flags, (unsigned int)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1futex_1waitv(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong futexAddress, jint nr_futex, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct futex_waitv const *futex = (struct futex_waitv const *)(uintptr_t)futexAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_futex_waitv(sqe, futex, (unsigned int)nr_futex, (unsigned int)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1fixed_1fd_1install(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_fixed_fd_install(sqe, fd, (unsigned int)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1ftruncate(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong len) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_ftruncate(sqe, fd, (loff_t)len);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1cmd_1discard(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong offset, jlong nbytes) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_cmd_discard(sqe, fd, (uint64_t)offset, (uint64_t)nbytes);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1pipe(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong fdsAddress, jint pipe_flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    int *fds = (int *)(uintptr_t)fdsAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_pipe(sqe, fds, pipe_flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1pipe_1direct(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong fdsAddress, jint pipe_flags, jint file_index) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    int *fds = (int *)(uintptr_t)fdsAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_pipe_direct(sqe, fds, pipe_flags, (unsigned int)file_index);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1load_1sq_1head(JNIEnv *__env, jclass clazz, jlong ringAddress) {
    struct io_uring const *ring = (struct io_uring const *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_load_sq_head(ring);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1sq_1ready(JNIEnv *__env, jclass clazz, jlong ringAddress) {
    struct io_uring const *ring = (struct io_uring const *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_sq_ready(ring);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1sq_1space_1left(JNIEnv *__env, jclass clazz, jlong ringAddress) {
    struct io_uring const *ring = (struct io_uring const *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_sq_space_left(ring);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_io_1uring_1sqe_1shift_1from_1flags(JNIEnv *__env, jclass clazz, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_sqe_shift_from_flags((unsigned)flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1sqe_1shift(JNIEnv *__env, jclass clazz, jlong ringAddress) {
    struct io_uring const *ring = (struct io_uring const *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_sqe_shift(ring);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1sqring_1wait(JNIEnv *__env, jclass clazz, jlong ringAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_sqring_wait(ring);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1cq_1ready(JNIEnv *__env, jclass clazz, jlong ringAddress) {
    struct io_uring const *ring = (struct io_uring const *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_cq_ready(ring);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1cq_1has_1overflow(JNIEnv *__env, jclass clazz, jlong ringAddress) {
    struct io_uring const *ring = (struct io_uring const *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)io_uring_cq_has_overflow(ring);
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1cq_1eventfd_1enabled(JNIEnv *__env, jclass clazz, jlong ringAddress) {
    struct io_uring const *ring = (struct io_uring const *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)io_uring_cq_eventfd_enabled(ring);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1cq_1eventfd_1toggle(JNIEnv *__env, jclass clazz, jlong ringAddress, jboolean enabled) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_cq_eventfd_toggle(ring, (bool)enabled);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1wait_1cqe_1nr(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong cqe_ptrAddress, jint wait_nr) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct io_uring_cqe **cqe_ptr = (struct io_uring_cqe **)(uintptr_t)cqe_ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_wait_cqe_nr(ring, cqe_ptr, (unsigned int)wait_nr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1peek_1cqe(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong cqe_ptrAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct io_uring_cqe **cqe_ptr = (struct io_uring_cqe **)(uintptr_t)cqe_ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_peek_cqe(ring, cqe_ptr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1wait_1cqe(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong cqe_ptrAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct io_uring_cqe **cqe_ptr = (struct io_uring_cqe **)(uintptr_t)cqe_ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_wait_cqe(ring, cqe_ptr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1buf_1ring_1advance(JNIEnv *__env, jclass clazz, jlong brAddress, jint count) {
    struct io_uring_buf_ring *br = (struct io_uring_buf_ring *)(uintptr_t)brAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_buf_ring_advance(br, count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1buf_1ring_1cq_1advance(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong brAddress, jint count) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct io_uring_buf_ring *br = (struct io_uring_buf_ring *)(uintptr_t)brAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_buf_ring_cq_advance(ring, br, count);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1buf_1ring_1available(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong brAddress, jshort bgid) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct io_uring_buf_ring *br = (struct io_uring_buf_ring *)(uintptr_t)brAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_buf_ring_available(ring, br, (unsigned short)bgid);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1get_1sqe(JNIEnv *__env, jclass clazz, jlong ringAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)io_uring_get_sqe(ring);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1get_1sqe128(JNIEnv *__env, jclass clazz, jlong ringAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)io_uring_get_sqe128(ring);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_io_1uring_1mlock_1size(JNIEnv *__env, jclass clazz, jint entries, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_mlock_size((unsigned)entries, (unsigned)flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1mlock_1size_1params(JNIEnv *__env, jclass clazz, jint entries, jlong pAddress) {
    struct io_uring_params *p = (struct io_uring_params *)(uintptr_t)pAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_mlock_size_params((unsigned)entries, p);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_io_1uring_1memory_1size(JNIEnv *__env, jclass clazz, jint entries, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)io_uring_memory_size((unsigned)entries, (unsigned)flags);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1memory_1size_1params(JNIEnv *__env, jclass clazz, jint entries, jlong pAddress) {
    struct io_uring_params *p = (struct io_uring_params *)(uintptr_t)pAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)io_uring_memory_size_params((unsigned)entries, p);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_io_1uring_1major_1version(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_major_version();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_io_1uring_1minor_1version(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_minor_version();
}

JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_io_1uring_1check_1version(JNIEnv *__env, jclass clazz, jint major, jint minor) {
    UNUSED_PARAMS(__env, clazz)
    return (jboolean)io_uring_check_version(major, minor);
}

EXTERN_C_EXIT
