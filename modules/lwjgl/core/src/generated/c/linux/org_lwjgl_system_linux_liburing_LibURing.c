/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "liburing.h"

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

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1get_1sqe(JNIEnv *__env, jclass clazz, jlong ringAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)io_uring_get_sqe(ring);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1buffers(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong iovecsAddress, jint nr_iovecs) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct iovec const *iovecs = (struct iovec const *)(uintptr_t)iovecsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_buffers(ring, iovecs, (unsigned)nr_iovecs);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1buffers_1tags__JJJI(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong iovecsAddress, jlong tagsAddress, jint nr) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct iovec const *iovecs = (struct iovec const *)(uintptr_t)iovecsAddress;
    __u64 const *tags = (__u64 const *)(uintptr_t)tagsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_buffers_tags(ring, iovecs, tags, (unsigned)nr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1buffers_1update_1tag__JIJJI(JNIEnv *__env, jclass clazz, jlong ringAddress, jint off, jlong iovecsAddress, jlong tagsAddress, jint nr) {
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

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1files__JJI(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong filesAddress, jint nr_files) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    int const *files = (int const *)(uintptr_t)filesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_files(ring, files, (unsigned)nr_files);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1files_1tags__JJJI(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong filesAddress, jlong tagsAddress, jint nr) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    int const *files = (int const *)(uintptr_t)filesAddress;
    __u64 const *tags = (__u64 const *)(uintptr_t)tagsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_files_tags(ring, files, tags, (unsigned)nr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1files_1update_1tag__JIJJI(JNIEnv *__env, jclass clazz, jlong ringAddress, jint off, jlong filesAddress, jlong tagsAddress, jint nr_files) {
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

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1files_1update__JIJI(JNIEnv *__env, jclass clazz, jlong ringAddress, jint off, jlong filesAddress, jint nr_files) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    int *files = (int *)(uintptr_t)filesAddress;
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

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1iowq_1max_1workers__JJ(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong valuesAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    unsigned int *values = (unsigned int *)(uintptr_t)valuesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_register_iowq_max_workers(ring, values);
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

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1read_1fixed(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong bufAddress, jint nbytes, jint offset, jint buf_index) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    void *buf = (void *)(uintptr_t)bufAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_read_fixed(sqe, fd, buf, (unsigned int)nbytes, offset, buf_index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1writev(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong iovecsAddress, jint nr_vecs, jint offset) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct iovec const *iovecs = (struct iovec const *)(uintptr_t)iovecsAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_writev(sqe, fd, iovecs, (unsigned int)nr_vecs, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1writev2(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong iovecsAddress, jint nr_vecs, jint offset, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct iovec const *iovecs = (struct iovec const *)(uintptr_t)iovecsAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_writev2(sqe, fd, iovecs, (unsigned int)nr_vecs, offset, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1write_1fixed(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong bufAddress, jint nbytes, jint offset, jint buf_index) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    void const *buf = (void const *)(uintptr_t)bufAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_write_fixed(sqe, fd, buf, (unsigned int)nbytes, offset, buf_index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1recvmsg(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong msgAddress, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct msghdr *msg = (struct msghdr *)(uintptr_t)msgAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_recvmsg(sqe, fd, msg, (unsigned int)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1sendmsg(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong msgAddress, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct msghdr const *msg = (struct msghdr const *)(uintptr_t)msgAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_sendmsg(sqe, fd, msg, (unsigned int)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1poll_1add(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jint poll_mask) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_poll_add(sqe, fd, (unsigned int)poll_mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1poll_1multishot(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jint poll_mask) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_poll_multishot(sqe, fd, (unsigned int)poll_mask);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1poll_1remove(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong user_data) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_poll_remove(sqe, (__u64)user_data);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1poll_1update(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong old_user_data, jlong new_user_data, jint poll_mask, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_poll_update(sqe, (__u64)old_user_data, (__u64)new_user_data, (unsigned int)poll_mask, (unsigned int)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1fsync(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jint fsync_flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_fsync(sqe, fd, (unsigned int)fsync_flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1nop(JNIEnv *__env, jclass clazz, jlong sqeAddress) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_nop(sqe);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1timeout(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong tsAddress, jint count, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct __kernel_timespec *ts = (struct __kernel_timespec *)(uintptr_t)tsAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_timeout(sqe, ts, (unsigned int)count, (unsigned int)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1timeout_1remove(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong user_data, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_timeout_remove(sqe, (__u64)user_data, (unsigned int)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1timeout_1update(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong tsAddress, jlong user_data, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct __kernel_timespec *ts = (struct __kernel_timespec *)(uintptr_t)tsAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_timeout_update(sqe, ts, (__u64)user_data, (unsigned int)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1accept__JIJJI(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong addrAddress, jlong addrlenAddress, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct sockaddr *addr = (struct sockaddr *)(uintptr_t)addrAddress;
    socklen_t *addrlen = (socklen_t *)(uintptr_t)addrlenAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_accept(sqe, fd, addr, addrlen, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1accept_1direct__JIJJII(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong addrAddress, jlong addrlenAddress, jint flags, jint file_index) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct sockaddr *addr = (struct sockaddr *)(uintptr_t)addrAddress;
    socklen_t *addrlen = (socklen_t *)(uintptr_t)addrlenAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_accept_direct(sqe, fd, addr, addrlen, flags, (unsigned int)file_index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1cancel(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong user_data, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_cancel(sqe, (__u64)user_data, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1link_1timeout(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong tsAddress, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct __kernel_timespec *ts = (struct __kernel_timespec *)(uintptr_t)tsAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_link_timeout(sqe, ts, (unsigned int)flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1connect(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong addrAddress, jint addrlen) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct sockaddr const *addr = (struct sockaddr const *)(uintptr_t)addrAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_connect(sqe, fd, addr, (socklen_t)addrlen);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1files_1update__JJII(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong fdsAddress, jint nr_fds, jint offset) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    int *fds = (int *)(uintptr_t)fdsAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_files_update(sqe, fds, (unsigned int)nr_fds, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1fallocate(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jint mode, jlong offset, jlong len) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_fallocate(sqe, fd, mode, (off_t)offset, (off_t)len);
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

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1read(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong bufAddress, jint nbytes, jint offset) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    void *buf = (void *)(uintptr_t)bufAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_read(sqe, fd, buf, (unsigned int)nbytes, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1write(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong bufAddress, jint nbytes, jint offset) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    void const *buf = (void const *)(uintptr_t)bufAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_write(sqe, fd, buf, (unsigned int)nbytes, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1statx(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint dfd, jlong pathAddress, jint flags, jint mask, jlong statxbufAddress) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    char const *path = (char const *)(uintptr_t)pathAddress;
    struct statx *statxbuf = (struct statx *)(uintptr_t)statxbufAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_statx(sqe, dfd, path, flags, (unsigned int)mask, statxbuf);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1fadvise(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jint offset, jlong len, jint advice) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_fadvise(sqe, fd, offset, (off_t)len, advice);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1madvise(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong addrAddress, jlong length, jint advice) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    void *addr = (void *)(uintptr_t)addrAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_madvise(sqe, addr, (off_t)length, advice);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1send(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint sockfd, jlong bufAddress, jlong len, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    void const *buf = (void const *)(uintptr_t)bufAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_send(sqe, sockfd, buf, (size_t)len, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1recv(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint sockfd, jlong bufAddress, jlong len, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    void *buf = (void *)(uintptr_t)bufAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_recv(sqe, sockfd, buf, (size_t)len, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1openat2(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint dfd, jlong pathAddress, jlong howAddress) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    char const *path = (char const *)(uintptr_t)pathAddress;
    struct open_how *how = (struct open_how *)(uintptr_t)howAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_openat2(sqe, dfd, path, how);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1openat2_1direct(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint dfd, jlong pathAddress, jlong howAddress, jint file_index) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    char const *path = (char const *)(uintptr_t)pathAddress;
    struct open_how *how = (struct open_how *)(uintptr_t)howAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_openat2_direct(sqe, dfd, path, how, (unsigned int)file_index);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1epoll_1ctl(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint epfd, jint fd, jint op, jlong evAddress) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct epoll_event *ev = (struct epoll_event *)(uintptr_t)evAddress;
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

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1renameat(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint olddfd, jlong oldpathAddress, jint newdfd, jlong newpathAddress, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    char const *oldpath = (char const *)(uintptr_t)oldpathAddress;
    char const *newpath = (char const *)(uintptr_t)newpathAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_renameat(sqe, olddfd, oldpath, newdfd, newpath, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1sync_1file_1range(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jint len, jint offset, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_sync_file_range(sqe, fd, (unsigned int)len, offset, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1mkdirat(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint dfd, jlong pathAddress, jint mode) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    char const *path = (char const *)(uintptr_t)pathAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_mkdirat(sqe, dfd, path, mode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1symlinkat(JNIEnv *__env, jclass clazz, jlong sqeAddress, jlong targetAddress, jint newdirfd, jlong linkpathAddress) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    char const *target = (char const *)(uintptr_t)targetAddress;
    char const *linkpath = (char const *)(uintptr_t)linkpathAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_symlinkat(sqe, target, newdirfd, linkpath);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1linkat(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint olddfd, jlong oldpathAddress, jint newdfd, jlong newpathAddress, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    char const *oldpath = (char const *)(uintptr_t)oldpathAddress;
    char const *newpath = (char const *)(uintptr_t)newpathAddress;
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_linkat(sqe, olddfd, oldpath, newdfd, newpath, flags);
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

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_io_1uring_1mlock_1size(JNIEnv *__env, jclass clazz, jint entries, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_mlock_size((unsigned)entries, (unsigned)flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1mlock_1size_1params(JNIEnv *__env, jclass clazz, jint entries, jlong pAddress) {
    struct io_uring_params *p = (struct io_uring_params *)(uintptr_t)pAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)io_uring_mlock_size_params((unsigned)entries, p);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1buffers_1tags__JJ_3JI(JNIEnv *__env, jclass clazz, jlong ringAddress, jlong iovecsAddress, jlongArray tagsAddress, jint nr) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct iovec const *iovecs = (struct iovec const *)(uintptr_t)iovecsAddress;
    jint __result;
    jlong *tags = (*__env)->GetLongArrayElements(__env, tagsAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)io_uring_register_buffers_tags(ring, iovecs, (__u64 const *)tags, (unsigned)nr);
    (*__env)->ReleaseLongArrayElements(__env, tagsAddress, tags, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1buffers_1update_1tag__JIJ_3JI(JNIEnv *__env, jclass clazz, jlong ringAddress, jint off, jlong iovecsAddress, jlongArray tagsAddress, jint nr) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    struct iovec const *iovecs = (struct iovec const *)(uintptr_t)iovecsAddress;
    jint __result;
    jlong *tags = (*__env)->GetLongArrayElements(__env, tagsAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)io_uring_register_buffers_update_tag(ring, (unsigned)off, iovecs, (__u64 const *)tags, (unsigned)nr);
    (*__env)->ReleaseLongArrayElements(__env, tagsAddress, tags, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1files__J_3II(JNIEnv *__env, jclass clazz, jlong ringAddress, jintArray filesAddress, jint nr_files) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    jint __result;
    jint *files = (*__env)->GetIntArrayElements(__env, filesAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)io_uring_register_files(ring, (int const *)files, (unsigned)nr_files);
    (*__env)->ReleaseIntArrayElements(__env, filesAddress, files, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1files_1tags__J_3I_3JI(JNIEnv *__env, jclass clazz, jlong ringAddress, jintArray filesAddress, jlongArray tagsAddress, jint nr) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    jint __result;
    jint *files = (*__env)->GetIntArrayElements(__env, filesAddress, NULL);
    jlong *tags = (*__env)->GetLongArrayElements(__env, tagsAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)io_uring_register_files_tags(ring, (int const *)files, (__u64 const *)tags, (unsigned)nr);
    (*__env)->ReleaseLongArrayElements(__env, tagsAddress, tags, 0);
    (*__env)->ReleaseIntArrayElements(__env, filesAddress, files, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1files_1update_1tag__JI_3I_3JI(JNIEnv *__env, jclass clazz, jlong ringAddress, jint off, jintArray filesAddress, jlongArray tagsAddress, jint nr_files) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    jint __result;
    jint *files = (*__env)->GetIntArrayElements(__env, filesAddress, NULL);
    jlong *tags = (*__env)->GetLongArrayElements(__env, tagsAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)io_uring_register_files_update_tag(ring, (unsigned)off, (int const *)files, (__u64 const *)tags, (unsigned)nr_files);
    (*__env)->ReleaseLongArrayElements(__env, tagsAddress, tags, 0);
    (*__env)->ReleaseIntArrayElements(__env, filesAddress, files, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1files_1update__JI_3II(JNIEnv *__env, jclass clazz, jlong ringAddress, jint off, jintArray filesAddress, jint nr_files) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    jint __result;
    jint *files = (*__env)->GetIntArrayElements(__env, filesAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)io_uring_register_files_update(ring, (unsigned)off, (int *)files, (unsigned)nr_files);
    (*__env)->ReleaseIntArrayElements(__env, filesAddress, files, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1register_1iowq_1max_1workers__J_3I(JNIEnv *__env, jclass clazz, jlong ringAddress, jintArray valuesAddress) {
    struct io_uring *ring = (struct io_uring *)(uintptr_t)ringAddress;
    jint __result;
    jint *values = (*__env)->GetIntArrayElements(__env, valuesAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)io_uring_register_iowq_max_workers(ring, (unsigned int *)values);
    (*__env)->ReleaseIntArrayElements(__env, valuesAddress, values, 0);
    return __result;
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1accept__JIJ_3II(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong addrAddress, jintArray addrlenAddress, jint flags) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct sockaddr *addr = (struct sockaddr *)(uintptr_t)addrAddress;
    jint *addrlen = (*__env)->GetIntArrayElements(__env, addrlenAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_accept(sqe, fd, addr, (socklen_t *)addrlen, flags);
    (*__env)->ReleaseIntArrayElements(__env, addrlenAddress, addrlen, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1accept_1direct__JIJ_3III(JNIEnv *__env, jclass clazz, jlong sqeAddress, jint fd, jlong addrAddress, jintArray addrlenAddress, jint flags, jint file_index) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    struct sockaddr *addr = (struct sockaddr *)(uintptr_t)addrAddress;
    jint *addrlen = (*__env)->GetIntArrayElements(__env, addrlenAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_accept_direct(sqe, fd, addr, (socklen_t *)addrlen, flags, (unsigned int)file_index);
    (*__env)->ReleaseIntArrayElements(__env, addrlenAddress, addrlen, 0);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_liburing_LibURing_nio_1uring_1prep_1files_1update__J_3III(JNIEnv *__env, jclass clazz, jlong sqeAddress, jintArray fdsAddress, jint nr_fds, jint offset) {
    struct io_uring_sqe *sqe = (struct io_uring_sqe *)(uintptr_t)sqeAddress;
    jint *fds = (*__env)->GetIntArrayElements(__env, fdsAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    io_uring_prep_files_update(sqe, (int *)fds, (unsigned int)nr_fds, offset);
    (*__env)->ReleaseIntArrayElements(__env, fdsAddress, fds, 0);
}

EXTERN_C_EXIT
