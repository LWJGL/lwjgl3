/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux.liburing;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.system.linux.*;

public class LibURing {

    static { Library.initialize(); }

    public static final long LIBURING_UDATA_TIMEOUT = -1L;

    protected LibURing() {
        throw new UnsupportedOperationException();
    }

    // --- [ io_uring_get_probe_ring ] ---

    /** {@code struct io_uring_probe * io_uring_get_probe_ring(struct io_uring * ring)} */
    public static native long nio_uring_get_probe_ring(long ring);

    /** {@code struct io_uring_probe * io_uring_get_probe_ring(struct io_uring * ring)} */
    @NativeType("struct io_uring_probe *")
    public static @Nullable IOURingProbe io_uring_get_probe_ring(@NativeType("struct io_uring *") IOURing ring) {
        long __result = nio_uring_get_probe_ring(ring.address());
        return IOURingProbe.createSafe(__result);
    }

    // --- [ io_uring_get_probe ] ---

    /** {@code struct io_uring_probe * io_uring_get_probe(void)} */
    public static native long nio_uring_get_probe();

    /** {@code struct io_uring_probe * io_uring_get_probe(void)} */
    @NativeType("struct io_uring_probe *")
    public static @Nullable IOURingProbe io_uring_get_probe() {
        long __result = nio_uring_get_probe();
        return IOURingProbe.createSafe(__result);
    }

    // --- [ io_uring_free_probe ] ---

    /** {@code void io_uring_free_probe(struct io_uring_probe * probe)} */
    public static native void nio_uring_free_probe(long probe);

    /** {@code void io_uring_free_probe(struct io_uring_probe * probe)} */
    public static void io_uring_free_probe(@NativeType("struct io_uring_probe *") IOURingProbe probe) {
        nio_uring_free_probe(probe.address());
    }

    // --- [ io_uring_opcode_supported ] ---

    /** {@code int io_uring_opcode_supported(struct io_uring_probe const * p, int op)} */
    public static native int nio_uring_opcode_supported(long p, int op);

    /** {@code int io_uring_opcode_supported(struct io_uring_probe const * p, int op)} */
    public static int io_uring_opcode_supported(@NativeType("struct io_uring_probe const *") IOURingProbe p, int op) {
        return nio_uring_opcode_supported(p.address(), op);
    }

    // --- [ io_uring_queue_init_mem ] ---

    /** {@code int io_uring_queue_init_mem(unsigned entries, struct io_uring * ring, struct io_uring_params * p, void * buf, size_t buf_size)} */
    public static native int nio_uring_queue_init_mem(int entries, long ring, long p, long buf, long buf_size);

    /** {@code int io_uring_queue_init_mem(unsigned entries, struct io_uring * ring, struct io_uring_params * p, void * buf, size_t buf_size)} */
    public static int io_uring_queue_init_mem(@NativeType("unsigned") int entries, @NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_params *") IOURingParams p, @NativeType("void *") ByteBuffer buf) {
        return nio_uring_queue_init_mem(entries, ring.address(), p.address(), memAddress(buf), buf.remaining());
    }

    // --- [ io_uring_queue_init_params ] ---

    /** {@code int io_uring_queue_init_params(unsigned entries, struct io_uring * ring, struct io_uring_params * p)} */
    public static native int nio_uring_queue_init_params(int entries, long ring, long p);

    /** {@code int io_uring_queue_init_params(unsigned entries, struct io_uring * ring, struct io_uring_params * p)} */
    public static int io_uring_queue_init_params(@NativeType("unsigned") int entries, @NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_params *") IOURingParams p) {
        return nio_uring_queue_init_params(entries, ring.address(), p.address());
    }

    // --- [ io_uring_queue_init ] ---

    /** {@code int io_uring_queue_init(unsigned entries, struct io_uring * ring, unsigned flags)} */
    public static native int nio_uring_queue_init(int entries, long ring, int flags);

    /** {@code int io_uring_queue_init(unsigned entries, struct io_uring * ring, unsigned flags)} */
    public static int io_uring_queue_init(@NativeType("unsigned") int entries, @NativeType("struct io_uring *") IOURing ring, @NativeType("unsigned") int flags) {
        return nio_uring_queue_init(entries, ring.address(), flags);
    }

    // --- [ io_uring_queue_mmap ] ---

    /** {@code int io_uring_queue_mmap(int fd, struct io_uring_params * p, struct io_uring * ring)} */
    public static native int nio_uring_queue_mmap(int fd, long p, long ring);

    /** {@code int io_uring_queue_mmap(int fd, struct io_uring_params * p, struct io_uring * ring)} */
    public static int io_uring_queue_mmap(int fd, @NativeType("struct io_uring_params *") IOURingParams p, @NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_queue_mmap(fd, p.address(), ring.address());
    }

    // --- [ io_uring_ring_dontfork ] ---

    /** {@code int io_uring_ring_dontfork(struct io_uring * ring)} */
    public static native int nio_uring_ring_dontfork(long ring);

    /** {@code int io_uring_ring_dontfork(struct io_uring * ring)} */
    public static int io_uring_ring_dontfork(@NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_ring_dontfork(ring.address());
    }

    // --- [ io_uring_queue_exit ] ---

    /** {@code void io_uring_queue_exit(struct io_uring * ring)} */
    public static native void nio_uring_queue_exit(long ring);

    /** {@code void io_uring_queue_exit(struct io_uring * ring)} */
    public static void io_uring_queue_exit(@NativeType("struct io_uring *") IOURing ring) {
        nio_uring_queue_exit(ring.address());
    }

    // --- [ io_uring_peek_batch_cqe ] ---

    /** {@code unsigned io_uring_peek_batch_cqe(struct io_uring * ring, struct io_uring_cqe ** cqes, unsigned count)} */
    public static native int nio_uring_peek_batch_cqe(long ring, long cqes, int count);

    /** {@code unsigned io_uring_peek_batch_cqe(struct io_uring * ring, struct io_uring_cqe ** cqes, unsigned count)} */
    @NativeType("unsigned")
    public static int io_uring_peek_batch_cqe(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_cqe **") PointerBuffer cqes) {
        return nio_uring_peek_batch_cqe(ring.address(), memAddress(cqes), cqes.remaining());
    }

    // --- [ io_uring_wait_cqes ] ---

    /** {@code int io_uring_wait_cqes(struct io_uring * ring, struct io_uring_cqe ** cqe_ptr, unsigned wait_nr, struct __kernel_timespec * ts, sigset_t * sigmask)} */
    public static native int nio_uring_wait_cqes(long ring, long cqe_ptr, int wait_nr, long ts, long sigmask);

    /** {@code int io_uring_wait_cqes(struct io_uring * ring, struct io_uring_cqe ** cqe_ptr, unsigned wait_nr, struct __kernel_timespec * ts, sigset_t * sigmask)} */
    public static int io_uring_wait_cqes(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_cqe **") PointerBuffer cqe_ptr, @NativeType("struct __kernel_timespec *") @Nullable KernelTimespec ts, @NativeType("sigset_t *") long sigmask) {
        return nio_uring_wait_cqes(ring.address(), memAddress(cqe_ptr), cqe_ptr.remaining(), memAddressSafe(ts), sigmask);
    }

    // --- [ io_uring_wait_cqes_min_timeout ] ---

    /** {@code int io_uring_wait_cqes_min_timeout(struct io_uring * ring, struct io_uring_cqe ** cqe_ptr, unsigned wait_nr, struct __kernel_timespec * ts, unsigned int min_ts_usec, sigset_t * sigmask)} */
    public static native int nio_uring_wait_cqes_min_timeout(long ring, long cqe_ptr, int wait_nr, long ts, int min_ts_usec, long sigmask);

    /** {@code int io_uring_wait_cqes_min_timeout(struct io_uring * ring, struct io_uring_cqe ** cqe_ptr, unsigned wait_nr, struct __kernel_timespec * ts, unsigned int min_ts_usec, sigset_t * sigmask)} */
    public static int io_uring_wait_cqes_min_timeout(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_cqe **") PointerBuffer cqe_ptr, @NativeType("struct __kernel_timespec *") @Nullable KernelTimespec ts, @NativeType("unsigned int") int min_ts_usec, @NativeType("sigset_t *") long sigmask) {
        return nio_uring_wait_cqes_min_timeout(ring.address(), memAddress(cqe_ptr), cqe_ptr.remaining(), memAddressSafe(ts), min_ts_usec, sigmask);
    }

    // --- [ io_uring_wait_cqe_timeout ] ---

    /** {@code int io_uring_wait_cqe_timeout(struct io_uring * ring, struct io_uring_cqe ** cqe_ptr, struct __kernel_timespec * ts)} */
    public static native int nio_uring_wait_cqe_timeout(long ring, long cqe_ptr, long ts);

    /** {@code int io_uring_wait_cqe_timeout(struct io_uring * ring, struct io_uring_cqe ** cqe_ptr, struct __kernel_timespec * ts)} */
    public static int io_uring_wait_cqe_timeout(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_cqe **") PointerBuffer cqe_ptr, @NativeType("struct __kernel_timespec *") @Nullable KernelTimespec ts) {
        if (CHECKS) {
            check(cqe_ptr, 1);
        }
        return nio_uring_wait_cqe_timeout(ring.address(), memAddress(cqe_ptr), memAddressSafe(ts));
    }

    // --- [ io_uring_submit ] ---

    /** {@code int io_uring_submit(struct io_uring * ring)} */
    public static native int nio_uring_submit(long ring);

    /** {@code int io_uring_submit(struct io_uring * ring)} */
    public static int io_uring_submit(@NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_submit(ring.address());
    }

    // --- [ io_uring_submit_and_wait ] ---

    /** {@code int io_uring_submit_and_wait(struct io_uring * ring, unsigned wait_nr)} */
    public static native int nio_uring_submit_and_wait(long ring, int wait_nr);

    /** {@code int io_uring_submit_and_wait(struct io_uring * ring, unsigned wait_nr)} */
    public static int io_uring_submit_and_wait(@NativeType("struct io_uring *") IOURing ring, @NativeType("unsigned") int wait_nr) {
        return nio_uring_submit_and_wait(ring.address(), wait_nr);
    }

    // --- [ io_uring_submit_and_wait_timeout ] ---

    /** {@code int io_uring_submit_and_wait_timeout(struct io_uring * ring, struct io_uring_cqe ** cqe_ptr, unsigned wait_nr, struct __kernel_timespec * ts, sigset_t * sigmask)} */
    public static native int nio_uring_submit_and_wait_timeout(long ring, long cqe_ptr, int wait_nr, long ts, long sigmask);

    /** {@code int io_uring_submit_and_wait_timeout(struct io_uring * ring, struct io_uring_cqe ** cqe_ptr, unsigned wait_nr, struct __kernel_timespec * ts, sigset_t * sigmask)} */
    public static int io_uring_submit_and_wait_timeout(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_cqe **") PointerBuffer cqe_ptr, @NativeType("struct __kernel_timespec *") @Nullable KernelTimespec ts, @NativeType("sigset_t *") long sigmask) {
        return nio_uring_submit_and_wait_timeout(ring.address(), memAddress(cqe_ptr), cqe_ptr.remaining(), memAddressSafe(ts), sigmask);
    }

    // --- [ io_uring_submit_and_wait_min_timeout ] ---

    /** {@code int io_uring_submit_and_wait_min_timeout(struct io_uring * ring, struct io_uring_cqe ** cqe_ptr, unsigned wait_nr, struct __kernel_timespec * ts, unsigned min_wait, sigset_t * sigmask)} */
    public static native int nio_uring_submit_and_wait_min_timeout(long ring, long cqe_ptr, int wait_nr, long ts, int min_wait, long sigmask);

    /** {@code int io_uring_submit_and_wait_min_timeout(struct io_uring * ring, struct io_uring_cqe ** cqe_ptr, unsigned wait_nr, struct __kernel_timespec * ts, unsigned min_wait, sigset_t * sigmask)} */
    public static int io_uring_submit_and_wait_min_timeout(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_cqe **") PointerBuffer cqe_ptr, @NativeType("struct __kernel_timespec *") @Nullable KernelTimespec ts, @NativeType("unsigned") int min_wait, @NativeType("sigset_t *") long sigmask) {
        return nio_uring_submit_and_wait_min_timeout(ring.address(), memAddress(cqe_ptr), cqe_ptr.remaining(), memAddressSafe(ts), min_wait, sigmask);
    }

    // --- [ io_uring_submit_and_wait_reg ] ---

    /** {@code int io_uring_submit_and_wait_reg(struct io_uring * ring, struct io_uring_cqe ** cqe_ptr, unsigned wait_nr, int reg_index)} */
    public static native int nio_uring_submit_and_wait_reg(long ring, long cqe_ptr, int wait_nr, int reg_index);

    /** {@code int io_uring_submit_and_wait_reg(struct io_uring * ring, struct io_uring_cqe ** cqe_ptr, unsigned wait_nr, int reg_index)} */
    public static int io_uring_submit_and_wait_reg(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_cqe **") PointerBuffer cqe_ptr, int reg_index) {
        return nio_uring_submit_and_wait_reg(ring.address(), memAddress(cqe_ptr), cqe_ptr.remaining(), reg_index);
    }

    // --- [ io_uring_register_wait_reg ] ---

    /** {@code int io_uring_register_wait_reg(struct io_uring * ring, struct io_uring_reg_wait * reg, int nr)} */
    public static native int nio_uring_register_wait_reg(long ring, long reg, int nr);

    /** {@code int io_uring_register_wait_reg(struct io_uring * ring, struct io_uring_reg_wait * reg, int nr)} */
    public static int io_uring_register_wait_reg(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_reg_wait *") IOURingRegWait reg, int nr) {
        return nio_uring_register_wait_reg(ring.address(), reg.address(), nr);
    }

    // --- [ io_uring_resize_rings ] ---

    /** {@code int io_uring_resize_rings(struct io_uring * ring, struct io_uring_params * p)} */
    public static native int nio_uring_resize_rings(long ring, long p);

    /** {@code int io_uring_resize_rings(struct io_uring * ring, struct io_uring_params * p)} */
    public static int io_uring_resize_rings(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_params *") IOURingParams p) {
        return nio_uring_resize_rings(ring.address(), p.address());
    }

    // --- [ io_uring_clone_buffers_offset ] ---

    /** {@code int io_uring_clone_buffers_offset(struct io_uring * dst, struct io_uring * src, unsigned dst_off, unsigned src_off, unsigned nr, unsigned flags)} */
    public static native int nio_uring_clone_buffers_offset(long dst, long src, int dst_off, int src_off, int nr, int flags);

    /** {@code int io_uring_clone_buffers_offset(struct io_uring * dst, struct io_uring * src, unsigned dst_off, unsigned src_off, unsigned nr, unsigned flags)} */
    public static int io_uring_clone_buffers_offset(@NativeType("struct io_uring *") IOURing dst, @NativeType("struct io_uring *") IOURing src, @NativeType("unsigned") int dst_off, @NativeType("unsigned") int src_off, @NativeType("unsigned") int nr, @NativeType("unsigned") int flags) {
        return nio_uring_clone_buffers_offset(dst.address(), src.address(), dst_off, src_off, nr, flags);
    }

    // --- [ io_uring_clone_buffers ] ---

    /** {@code int io_uring_clone_buffers(struct io_uring * dst, struct io_uring * src)} */
    public static native int nio_uring_clone_buffers(long dst, long src);

    /** {@code int io_uring_clone_buffers(struct io_uring * dst, struct io_uring * src)} */
    public static int io_uring_clone_buffers(@NativeType("struct io_uring *") IOURing dst, @NativeType("struct io_uring *") IOURing src) {
        return nio_uring_clone_buffers(dst.address(), src.address());
    }

    // --- [ io_uring_register_buffers ] ---

    /** {@code int io_uring_register_buffers(struct io_uring * ring, struct iovec const * iovecs, unsigned nr_iovecs)} */
    public static native int nio_uring_register_buffers(long ring, long iovecs, int nr_iovecs);

    /** {@code int io_uring_register_buffers(struct io_uring * ring, struct iovec const * iovecs, unsigned nr_iovecs)} */
    public static int io_uring_register_buffers(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct iovec const *") IOVec.Buffer iovecs) {
        return nio_uring_register_buffers(ring.address(), iovecs.address(), iovecs.remaining());
    }

    // --- [ io_uring_register_buffers_tags ] ---

    /** {@code int io_uring_register_buffers_tags(struct io_uring * ring, struct iovec const * iovecs, __u64 const * tags, unsigned nr)} */
    public static native int nio_uring_register_buffers_tags(long ring, long iovecs, long tags, int nr);

    /** {@code int io_uring_register_buffers_tags(struct io_uring * ring, struct iovec const * iovecs, __u64 const * tags, unsigned nr)} */
    public static int io_uring_register_buffers_tags(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct iovec const *") IOVec.Buffer iovecs, @NativeType("__u64 const *") LongBuffer tags) {
        if (CHECKS) {
            check(tags, iovecs.remaining());
        }
        return nio_uring_register_buffers_tags(ring.address(), iovecs.address(), memAddress(tags), iovecs.remaining());
    }

    // --- [ io_uring_register_buffers_sparse ] ---

    /** {@code int io_uring_register_buffers_sparse(struct io_uring * ring, unsigned nr_iovecs)} */
    public static native int nio_uring_register_buffers_sparse(long ring, int nr_iovecs);

    /** {@code int io_uring_register_buffers_sparse(struct io_uring * ring, unsigned nr_iovecs)} */
    public static int io_uring_register_buffers_sparse(@NativeType("struct io_uring *") IOURing ring, @NativeType("unsigned") int nr_iovecs) {
        return nio_uring_register_buffers_sparse(ring.address(), nr_iovecs);
    }

    // --- [ io_uring_register_buffers_update_tag ] ---

    /** {@code int io_uring_register_buffers_update_tag(struct io_uring * ring, unsigned off, struct iovec const * iovecs, __u64 const * tags, unsigned nr)} */
    public static native int nio_uring_register_buffers_update_tag(long ring, int off, long iovecs, long tags, int nr);

    /** {@code int io_uring_register_buffers_update_tag(struct io_uring * ring, unsigned off, struct iovec const * iovecs, __u64 const * tags, unsigned nr)} */
    public static int io_uring_register_buffers_update_tag(@NativeType("struct io_uring *") IOURing ring, @NativeType("unsigned") int off, @NativeType("struct iovec const *") IOVec.Buffer iovecs, @NativeType("__u64 const *") LongBuffer tags) {
        if (CHECKS) {
            check(tags, iovecs.remaining());
        }
        return nio_uring_register_buffers_update_tag(ring.address(), off, iovecs.address(), memAddress(tags), iovecs.remaining());
    }

    // --- [ io_uring_unregister_buffers ] ---

    /** {@code int io_uring_unregister_buffers(struct io_uring * ring)} */
    public static native int nio_uring_unregister_buffers(long ring);

    /** {@code int io_uring_unregister_buffers(struct io_uring * ring)} */
    public static int io_uring_unregister_buffers(@NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_unregister_buffers(ring.address());
    }

    // --- [ io_uring_register_files ] ---

    /** {@code int io_uring_register_files(struct io_uring * ring, int const * files, unsigned nr_files)} */
    public static native int nio_uring_register_files(long ring, long files, int nr_files);

    /** {@code int io_uring_register_files(struct io_uring * ring, int const * files, unsigned nr_files)} */
    public static int io_uring_register_files(@NativeType("struct io_uring *") IOURing ring, @NativeType("int const *") IntBuffer files) {
        return nio_uring_register_files(ring.address(), memAddress(files), files.remaining());
    }

    // --- [ io_uring_register_files_tags ] ---

    /** {@code int io_uring_register_files_tags(struct io_uring * ring, int const * files, __u64 const * tags, unsigned nr)} */
    public static native int nio_uring_register_files_tags(long ring, long files, long tags, int nr);

    /** {@code int io_uring_register_files_tags(struct io_uring * ring, int const * files, __u64 const * tags, unsigned nr)} */
    public static int io_uring_register_files_tags(@NativeType("struct io_uring *") IOURing ring, @NativeType("int const *") IntBuffer files, @NativeType("__u64 const *") LongBuffer tags) {
        if (CHECKS) {
            check(tags, files.remaining());
        }
        return nio_uring_register_files_tags(ring.address(), memAddress(files), memAddress(tags), files.remaining());
    }

    // --- [ io_uring_register_files_sparse ] ---

    /** {@code int io_uring_register_files_sparse(struct io_uring * ring, unsigned nr_files)} */
    public static native int nio_uring_register_files_sparse(long ring, int nr_files);

    /** {@code int io_uring_register_files_sparse(struct io_uring * ring, unsigned nr_files)} */
    public static int io_uring_register_files_sparse(@NativeType("struct io_uring *") IOURing ring, @NativeType("unsigned") int nr_files) {
        return nio_uring_register_files_sparse(ring.address(), nr_files);
    }

    // --- [ io_uring_register_files_update_tag ] ---

    /** {@code int io_uring_register_files_update_tag(struct io_uring * ring, unsigned off, int const * files, __u64 const * tags, unsigned nr_files)} */
    public static native int nio_uring_register_files_update_tag(long ring, int off, long files, long tags, int nr_files);

    /** {@code int io_uring_register_files_update_tag(struct io_uring * ring, unsigned off, int const * files, __u64 const * tags, unsigned nr_files)} */
    public static int io_uring_register_files_update_tag(@NativeType("struct io_uring *") IOURing ring, @NativeType("unsigned") int off, @NativeType("int const *") IntBuffer files, @NativeType("__u64 const *") LongBuffer tags) {
        if (CHECKS) {
            check(tags, files.remaining());
        }
        return nio_uring_register_files_update_tag(ring.address(), off, memAddress(files), memAddress(tags), files.remaining());
    }

    // --- [ io_uring_unregister_files ] ---

    /** {@code int io_uring_unregister_files(struct io_uring * ring)} */
    public static native int nio_uring_unregister_files(long ring);

    /** {@code int io_uring_unregister_files(struct io_uring * ring)} */
    public static int io_uring_unregister_files(@NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_unregister_files(ring.address());
    }

    // --- [ io_uring_register_files_update ] ---

    /** {@code int io_uring_register_files_update(struct io_uring * ring, unsigned off, int const * files, unsigned nr_files)} */
    public static native int nio_uring_register_files_update(long ring, int off, long files, int nr_files);

    /** {@code int io_uring_register_files_update(struct io_uring * ring, unsigned off, int const * files, unsigned nr_files)} */
    public static int io_uring_register_files_update(@NativeType("struct io_uring *") IOURing ring, @NativeType("unsigned") int off, @NativeType("int const *") IntBuffer files) {
        return nio_uring_register_files_update(ring.address(), off, memAddress(files), files.remaining());
    }

    // --- [ io_uring_register_eventfd ] ---

    /** {@code int io_uring_register_eventfd(struct io_uring * ring, int fd)} */
    public static native int nio_uring_register_eventfd(long ring, int fd);

    /** {@code int io_uring_register_eventfd(struct io_uring * ring, int fd)} */
    public static int io_uring_register_eventfd(@NativeType("struct io_uring *") IOURing ring, int fd) {
        return nio_uring_register_eventfd(ring.address(), fd);
    }

    // --- [ io_uring_register_eventfd_async ] ---

    /** {@code int io_uring_register_eventfd_async(struct io_uring * ring, int fd)} */
    public static native int nio_uring_register_eventfd_async(long ring, int fd);

    /** {@code int io_uring_register_eventfd_async(struct io_uring * ring, int fd)} */
    public static int io_uring_register_eventfd_async(@NativeType("struct io_uring *") IOURing ring, int fd) {
        return nio_uring_register_eventfd_async(ring.address(), fd);
    }

    // --- [ io_uring_unregister_eventfd ] ---

    /** {@code int io_uring_unregister_eventfd(struct io_uring * ring)} */
    public static native int nio_uring_unregister_eventfd(long ring);

    /** {@code int io_uring_unregister_eventfd(struct io_uring * ring)} */
    public static int io_uring_unregister_eventfd(@NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_unregister_eventfd(ring.address());
    }

    // --- [ io_uring_register_probe ] ---

    /** {@code int io_uring_register_probe(struct io_uring * ring, struct io_uring_probe * p, unsigned nr)} */
    public static native int nio_uring_register_probe(long ring, long p, int nr);

    /** {@code int io_uring_register_probe(struct io_uring * ring, struct io_uring_probe * p, unsigned nr)} */
    public static int io_uring_register_probe(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_probe *") IOURingProbe p, @NativeType("unsigned") int nr) {
        return nio_uring_register_probe(ring.address(), p.address(), nr);
    }

    // --- [ io_uring_register_personality ] ---

    /** {@code int io_uring_register_personality(struct io_uring * ring)} */
    public static native int nio_uring_register_personality(long ring);

    /** {@code int io_uring_register_personality(struct io_uring * ring)} */
    public static int io_uring_register_personality(@NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_register_personality(ring.address());
    }

    // --- [ io_uring_unregister_personality ] ---

    /** {@code int io_uring_unregister_personality(struct io_uring * ring, int id)} */
    public static native int nio_uring_unregister_personality(long ring, int id);

    /** {@code int io_uring_unregister_personality(struct io_uring * ring, int id)} */
    public static int io_uring_unregister_personality(@NativeType("struct io_uring *") IOURing ring, int id) {
        return nio_uring_unregister_personality(ring.address(), id);
    }

    // --- [ io_uring_register_restrictions ] ---

    /** {@code int io_uring_register_restrictions(struct io_uring * ring, struct io_uring_restriction * res, unsigned nr_res)} */
    public static native int nio_uring_register_restrictions(long ring, long res, int nr_res);

    /** {@code int io_uring_register_restrictions(struct io_uring * ring, struct io_uring_restriction * res, unsigned nr_res)} */
    public static int io_uring_register_restrictions(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_restriction *") IOURingRestriction.Buffer res) {
        return nio_uring_register_restrictions(ring.address(), res.address(), res.remaining());
    }

    // --- [ io_uring_enable_rings ] ---

    /** {@code int io_uring_enable_rings(struct io_uring * ring)} */
    public static native int nio_uring_enable_rings(long ring);

    /** {@code int io_uring_enable_rings(struct io_uring * ring)} */
    public static int io_uring_enable_rings(@NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_enable_rings(ring.address());
    }

    // --- [ __io_uring_sqring_wait ] ---

    /** {@code int __io_uring_sqring_wait(struct io_uring * ring)} */
    public static native int n__io_uring_sqring_wait(long ring);

    /** {@code int __io_uring_sqring_wait(struct io_uring * ring)} */
    public static int __io_uring_sqring_wait(@NativeType("struct io_uring *") IOURing ring) {
        return n__io_uring_sqring_wait(ring.address());
    }

    // --- [ io_uring_register_iowq_aff ] ---

    /** {@code int io_uring_register_iowq_aff(struct io_uring * ring, size_t cpusz, cpu_set_t const * mask)} */
    public static native int nio_uring_register_iowq_aff(long ring, long cpusz, long mask);

    /** {@code int io_uring_register_iowq_aff(struct io_uring * ring, size_t cpusz, cpu_set_t const * mask)} */
    public static int io_uring_register_iowq_aff(@NativeType("struct io_uring *") IOURing ring, @NativeType("size_t") long cpusz, @NativeType("cpu_set_t const *") long mask) {
        if (CHECKS) {
            check(mask);
        }
        return nio_uring_register_iowq_aff(ring.address(), cpusz, mask);
    }

    // --- [ io_uring_unregister_iowq_aff ] ---

    /** {@code int io_uring_unregister_iowq_aff(struct io_uring * ring)} */
    public static native int nio_uring_unregister_iowq_aff(long ring);

    /** {@code int io_uring_unregister_iowq_aff(struct io_uring * ring)} */
    public static int io_uring_unregister_iowq_aff(@NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_unregister_iowq_aff(ring.address());
    }

    // --- [ io_uring_register_iowq_max_workers ] ---

    /** {@code int io_uring_register_iowq_max_workers(struct io_uring * ring, unsigned int * values)} */
    public static native int nio_uring_register_iowq_max_workers(long ring, long values);

    /** {@code int io_uring_register_iowq_max_workers(struct io_uring * ring, unsigned int * values)} */
    public static int io_uring_register_iowq_max_workers(@NativeType("struct io_uring *") IOURing ring, @NativeType("unsigned int *") IntBuffer values) {
        if (CHECKS) {
            check(values, 2);
        }
        return nio_uring_register_iowq_max_workers(ring.address(), memAddress(values));
    }

    // --- [ io_uring_register_ring_fd ] ---

    /** {@code int io_uring_register_ring_fd(struct io_uring * ring)} */
    public static native int nio_uring_register_ring_fd(long ring);

    /** {@code int io_uring_register_ring_fd(struct io_uring * ring)} */
    public static int io_uring_register_ring_fd(@NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_register_ring_fd(ring.address());
    }

    // --- [ io_uring_unregister_ring_fd ] ---

    /** {@code int io_uring_unregister_ring_fd(struct io_uring * ring)} */
    public static native int nio_uring_unregister_ring_fd(long ring);

    /** {@code int io_uring_unregister_ring_fd(struct io_uring * ring)} */
    public static int io_uring_unregister_ring_fd(@NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_unregister_ring_fd(ring.address());
    }

    // --- [ io_uring_close_ring_fd ] ---

    /** {@code int io_uring_close_ring_fd(struct io_uring * ring)} */
    public static native int nio_uring_close_ring_fd(long ring);

    /** {@code int io_uring_close_ring_fd(struct io_uring * ring)} */
    public static int io_uring_close_ring_fd(@NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_close_ring_fd(ring.address());
    }

    // --- [ io_uring_register_buf_ring ] ---

    /** {@code int io_uring_register_buf_ring(struct io_uring * ring, struct io_uring_buf_reg * reg, unsigned int flags)} */
    public static native int nio_uring_register_buf_ring(long ring, long reg, int flags);

    /** {@code int io_uring_register_buf_ring(struct io_uring * ring, struct io_uring_buf_reg * reg, unsigned int flags)} */
    public static int io_uring_register_buf_ring(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_buf_reg *") IOURingBufReg reg, @NativeType("unsigned int") int flags) {
        return nio_uring_register_buf_ring(ring.address(), reg.address(), flags);
    }

    // --- [ io_uring_unregister_buf_ring ] ---

    /** {@code int io_uring_unregister_buf_ring(struct io_uring * ring, int bgid)} */
    public static native int nio_uring_unregister_buf_ring(long ring, int bgid);

    /** {@code int io_uring_unregister_buf_ring(struct io_uring * ring, int bgid)} */
    public static int io_uring_unregister_buf_ring(@NativeType("struct io_uring *") IOURing ring, int bgid) {
        return nio_uring_unregister_buf_ring(ring.address(), bgid);
    }

    // --- [ io_uring_buf_ring_head ] ---

    /** {@code int io_uring_buf_ring_head(struct io_uring * ring, int buf_group, unsigned short * head)} */
    public static native int nio_uring_buf_ring_head(long ring, int buf_group, long head);

    /** {@code int io_uring_buf_ring_head(struct io_uring * ring, int buf_group, unsigned short * head)} */
    public static int io_uring_buf_ring_head(@NativeType("struct io_uring *") IOURing ring, int buf_group, @NativeType("unsigned short *") ShortBuffer head) {
        if (CHECKS) {
            check(head, 1);
        }
        return nio_uring_buf_ring_head(ring.address(), buf_group, memAddress(head));
    }

    // --- [ io_uring_register_sync_cancel ] ---

    /** {@code int io_uring_register_sync_cancel(struct io_uring * ring, struct io_uring_sync_cancel_reg * reg)} */
    public static native int nio_uring_register_sync_cancel(long ring, long reg);

    /** {@code int io_uring_register_sync_cancel(struct io_uring * ring, struct io_uring_sync_cancel_reg * reg)} */
    public static int io_uring_register_sync_cancel(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_sync_cancel_reg *") IOURingSyncCancelReg reg) {
        return nio_uring_register_sync_cancel(ring.address(), reg.address());
    }

    // --- [ io_uring_register_file_alloc_range ] ---

    /** {@code int io_uring_register_file_alloc_range(struct io_uring * ring, unsigned off, unsigned len)} */
    public static native int nio_uring_register_file_alloc_range(long ring, int off, int len);

    /** {@code int io_uring_register_file_alloc_range(struct io_uring * ring, unsigned off, unsigned len)} */
    public static int io_uring_register_file_alloc_range(@NativeType("struct io_uring *") IOURing ring, @NativeType("unsigned") int off, @NativeType("unsigned") int len) {
        return nio_uring_register_file_alloc_range(ring.address(), off, len);
    }

    // --- [ io_uring_register_napi ] ---

    /** {@code int io_uring_register_napi(struct io_uring * ring, struct io_uring_napi * napi)} */
    public static native int nio_uring_register_napi(long ring, long napi);

    /** {@code int io_uring_register_napi(struct io_uring * ring, struct io_uring_napi * napi)} */
    public static int io_uring_register_napi(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_napi *") IOURingNAPI napi) {
        return nio_uring_register_napi(ring.address(), napi.address());
    }

    // --- [ io_uring_unregister_napi ] ---

    /** {@code int io_uring_unregister_napi(struct io_uring * ring, struct io_uring_napi * napi)} */
    public static native int nio_uring_unregister_napi(long ring, long napi);

    /** {@code int io_uring_unregister_napi(struct io_uring * ring, struct io_uring_napi * napi)} */
    public static int io_uring_unregister_napi(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_napi *") IOURingNAPI napi) {
        return nio_uring_unregister_napi(ring.address(), napi.address());
    }

    // --- [ io_uring_register_ifq ] ---

    /** {@code int io_uring_register_ifq(struct io_uring * ring, struct io_uring_zcrx_ifq_reg * reg)} */
    public static native int nio_uring_register_ifq(long ring, long reg);

    /** {@code int io_uring_register_ifq(struct io_uring * ring, struct io_uring_zcrx_ifq_reg * reg)} */
    public static int io_uring_register_ifq(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_zcrx_ifq_reg *") IOURingZCRXIfqReg reg) {
        return nio_uring_register_ifq(ring.address(), reg.address());
    }

    // --- [ io_uring_register_clock ] ---

    /** {@code int io_uring_register_clock(struct io_uring * ring, struct io_uring_clock_register * arg)} */
    public static native int nio_uring_register_clock(long ring, long arg);

    /** {@code int io_uring_register_clock(struct io_uring * ring, struct io_uring_clock_register * arg)} */
    public static int io_uring_register_clock(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_clock_register *") IOURingClockRegister arg) {
        return nio_uring_register_clock(ring.address(), arg.address());
    }

    // --- [ io_uring_get_events ] ---

    /** {@code int io_uring_get_events(struct io_uring * ring)} */
    public static native int nio_uring_get_events(long ring);

    /** {@code int io_uring_get_events(struct io_uring * ring)} */
    public static int io_uring_get_events(@NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_get_events(ring.address());
    }

    // --- [ io_uring_submit_and_get_events ] ---

    /** {@code int io_uring_submit_and_get_events(struct io_uring * ring)} */
    public static native int nio_uring_submit_and_get_events(long ring);

    /** {@code int io_uring_submit_and_get_events(struct io_uring * ring)} */
    public static int io_uring_submit_and_get_events(@NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_submit_and_get_events(ring.address());
    }

    // --- [ io_uring_enter ] ---

    /** {@code int io_uring_enter(unsigned int fd, unsigned int to_submit, unsigned int min_complete, unsigned int flags, sigset_t * sig)} */
    public static native int nio_uring_enter(int fd, int to_submit, int min_complete, int flags, long sig);

    /** {@code int io_uring_enter(unsigned int fd, unsigned int to_submit, unsigned int min_complete, unsigned int flags, sigset_t * sig)} */
    public static int io_uring_enter(@NativeType("unsigned int") int fd, @NativeType("unsigned int") int to_submit, @NativeType("unsigned int") int min_complete, @NativeType("unsigned int") int flags, @NativeType("sigset_t *") long sig) {
        if (CHECKS) {
            check(sig);
        }
        return nio_uring_enter(fd, to_submit, min_complete, flags, sig);
    }

    // --- [ io_uring_enter2 ] ---

    /** {@code int io_uring_enter2(unsigned int fd, unsigned int to_submit, unsigned int min_complete, unsigned int flags, void * arg, size_t sz)} */
    public static native int nio_uring_enter2(int fd, int to_submit, int min_complete, int flags, long arg, long sz);

    /** {@code int io_uring_enter2(unsigned int fd, unsigned int to_submit, unsigned int min_complete, unsigned int flags, void * arg, size_t sz)} */
    public static int io_uring_enter2(@NativeType("unsigned int") int fd, @NativeType("unsigned int") int to_submit, @NativeType("unsigned int") int min_complete, @NativeType("unsigned int") int flags, @NativeType("void *") ByteBuffer arg) {
        return nio_uring_enter2(fd, to_submit, min_complete, flags, memAddress(arg), arg.remaining());
    }

    // --- [ io_uring_setup ] ---

    /** {@code int io_uring_setup(unsigned int entries, struct io_uring_params * p)} */
    public static native int nio_uring_setup(int entries, long p);

    /** {@code int io_uring_setup(unsigned int entries, struct io_uring_params * p)} */
    public static int io_uring_setup(@NativeType("unsigned int") int entries, @NativeType("struct io_uring_params *") IOURingParams p) {
        return nio_uring_setup(entries, p.address());
    }

    // --- [ io_uring_register ] ---

    /** {@code int io_uring_register(unsigned int fd, unsigned int opcode, void * arg, unsigned int nr_args)} */
    public static native int io_uring_register(@NativeType("unsigned int") int fd, @NativeType("unsigned int") int opcode, @NativeType("void *") long arg, @NativeType("unsigned int") int nr_args);

    // --- [ io_uring_register_region ] ---

    /** {@code int io_uring_register_region(struct io_uring * ring, struct io_uring_mem_region_reg * reg)} */
    public static native int nio_uring_register_region(long ring, long reg);

    /** {@code int io_uring_register_region(struct io_uring * ring, struct io_uring_mem_region_reg * reg)} */
    public static int io_uring_register_region(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_mem_region_reg *") IOURingMemRegionReg reg) {
        return nio_uring_register_region(ring.address(), reg.address());
    }

    // --- [ io_uring_setup_buf_ring ] ---

    /** {@code struct io_uring_buf_ring * io_uring_setup_buf_ring(struct io_uring * ring, unsigned int nentries, int bgid, unsigned int flags, int * err)} */
    public static native long nio_uring_setup_buf_ring(long ring, int nentries, int bgid, int flags, long err);

    /** {@code struct io_uring_buf_ring * io_uring_setup_buf_ring(struct io_uring * ring, unsigned int nentries, int bgid, unsigned int flags, int * err)} */
    @NativeType("struct io_uring_buf_ring *")
    public static @Nullable IOURingBufRing io_uring_setup_buf_ring(@NativeType("struct io_uring *") IOURing ring, @NativeType("unsigned int") int nentries, int bgid, @NativeType("unsigned int") int flags, @NativeType("int *") IntBuffer err) {
        if (CHECKS) {
            check(err, 1);
        }
        long __result = nio_uring_setup_buf_ring(ring.address(), nentries, bgid, flags, memAddress(err));
        return IOURingBufRing.createSafe(__result);
    }

    // --- [ io_uring_free_buf_ring ] ---

    /** {@code int io_uring_free_buf_ring(struct io_uring * ring, struct io_uring_buf_ring * br, unsigned int nentries, int bgid)} */
    public static native int nio_uring_free_buf_ring(long ring, long br, int nentries, int bgid);

    /** {@code int io_uring_free_buf_ring(struct io_uring * ring, struct io_uring_buf_ring * br, unsigned int nentries, int bgid)} */
    public static int io_uring_free_buf_ring(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_buf_ring *") IOURingBufRing br, @NativeType("unsigned int") int nentries, int bgid) {
        return nio_uring_free_buf_ring(ring.address(), br.address(), nentries, bgid);
    }

    // --- [ io_uring_set_iowait ] ---

    /** {@code int io_uring_set_iowait(struct io_uring * ring, bool enable_iowait)} */
    public static native int nio_uring_set_iowait(long ring, boolean enable_iowait);

    /** {@code int io_uring_set_iowait(struct io_uring * ring, bool enable_iowait)} */
    public static int io_uring_set_iowait(@NativeType("struct io_uring *") IOURing ring, @NativeType("bool") boolean enable_iowait) {
        return nio_uring_set_iowait(ring.address(), enable_iowait);
    }

    // --- [ io_uring_cqe_shift_from_flags ] ---

    /** {@code unsigned io_uring_cqe_shift_from_flags(unsigned flags)} */
    @NativeType("unsigned")
    public static native int io_uring_cqe_shift_from_flags(@NativeType("unsigned") int flags);

    // --- [ io_uring_cqe_shift ] ---

    /** {@code unsigned io_uring_cqe_shift(struct io_uring const * ring)} */
    public static native int nio_uring_cqe_shift(long ring);

    /** {@code unsigned io_uring_cqe_shift(struct io_uring const * ring)} */
    @NativeType("unsigned")
    public static int io_uring_cqe_shift(@NativeType("struct io_uring const *") IOURing ring) {
        if (CHECKS) {
            IOURing.validate(ring.address());
        }
        return nio_uring_cqe_shift(ring.address());
    }

    // --- [ io_uring_cqe_nr ] ---

    /** {@code unsigned io_uring_cqe_nr(struct io_uring_cqe const * cqe)} */
    public static native int nio_uring_cqe_nr(long cqe);

    /** {@code unsigned io_uring_cqe_nr(struct io_uring_cqe const * cqe)} */
    @NativeType("unsigned")
    public static int io_uring_cqe_nr(@NativeType("struct io_uring_cqe const *") IOURingCQE cqe) {
        return nio_uring_cqe_nr(cqe.address());
    }

    // --- [ io_uring_cq_advance ] ---

    /** {@code void io_uring_cq_advance(struct io_uring * ring, unsigned nr)} */
    public static native void nio_uring_cq_advance(long ring, int nr);

    /** {@code void io_uring_cq_advance(struct io_uring * ring, unsigned nr)} */
    public static void io_uring_cq_advance(@NativeType("struct io_uring *") IOURing ring, @NativeType("unsigned") int nr) {
        nio_uring_cq_advance(ring.address(), nr);
    }

    // --- [ io_uring_cqe_seen ] ---

    /** {@code void io_uring_cqe_seen(struct io_uring * ring, struct io_uring_cqe * cqe)} */
    public static native void nio_uring_cqe_seen(long ring, long cqe);

    /** {@code void io_uring_cqe_seen(struct io_uring * ring, struct io_uring_cqe * cqe)} */
    public static void io_uring_cqe_seen(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_cqe *") IOURingCQE cqe) {
        nio_uring_cqe_seen(ring.address(), cqe.address());
    }

    // --- [ io_uring_sqe_set_data ] ---

    /** {@code void io_uring_sqe_set_data(struct io_uring_sqe * sqe, void * data)} */
    public static native void nio_uring_sqe_set_data(long sqe, long data);

    /** {@code void io_uring_sqe_set_data(struct io_uring_sqe * sqe, void * data)} */
    public static void io_uring_sqe_set_data(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("void *") long data) {
        if (CHECKS) {
            check(data);
        }
        nio_uring_sqe_set_data(sqe.address(), data);
    }

    // --- [ io_uring_cqe_get_data ] ---

    /** {@code void * io_uring_cqe_get_data(struct io_uring_cqe const * cqe)} */
    public static native long nio_uring_cqe_get_data(long cqe);

    /** {@code void * io_uring_cqe_get_data(struct io_uring_cqe const * cqe)} */
    @NativeType("void *")
    public static long io_uring_cqe_get_data(@NativeType("struct io_uring_cqe const *") IOURingCQE cqe) {
        return nio_uring_cqe_get_data(cqe.address());
    }

    // --- [ io_uring_sqe_set_data64 ] ---

    /** {@code void io_uring_sqe_set_data64(struct io_uring_sqe * sqe, __u64 data)} */
    public static native void nio_uring_sqe_set_data64(long sqe, long data);

    /** {@code void io_uring_sqe_set_data64(struct io_uring_sqe * sqe, __u64 data)} */
    public static void io_uring_sqe_set_data64(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("__u64") long data) {
        nio_uring_sqe_set_data64(sqe.address(), data);
    }

    // --- [ io_uring_cqe_get_data64 ] ---

    /** {@code __u64 io_uring_cqe_get_data64(struct io_uring_cqe const * cqe)} */
    public static native long nio_uring_cqe_get_data64(long cqe);

    /** {@code __u64 io_uring_cqe_get_data64(struct io_uring_cqe const * cqe)} */
    @NativeType("__u64")
    public static long io_uring_cqe_get_data64(@NativeType("struct io_uring_cqe const *") IOURingCQE cqe) {
        return nio_uring_cqe_get_data64(cqe.address());
    }

    // --- [ io_uring_sqe_set_flags ] ---

    /** {@code void io_uring_sqe_set_flags(struct io_uring_sqe * sqe, unsigned int flags)} */
    public static native void nio_uring_sqe_set_flags(long sqe, int flags);

    /** {@code void io_uring_sqe_set_flags(struct io_uring_sqe * sqe, unsigned int flags)} */
    public static void io_uring_sqe_set_flags(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("unsigned int") int flags) {
        nio_uring_sqe_set_flags(sqe.address(), flags);
    }

    // --- [ io_uring_sqe_set_buf_group ] ---

    /** {@code void io_uring_sqe_set_buf_group(struct io_uring_sqe * sqe, int bgid)} */
    public static native void nio_uring_sqe_set_buf_group(long sqe, int bgid);

    /** {@code void io_uring_sqe_set_buf_group(struct io_uring_sqe * sqe, int bgid)} */
    public static void io_uring_sqe_set_buf_group(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int bgid) {
        nio_uring_sqe_set_buf_group(sqe.address(), bgid);
    }

    // --- [ io_uring_initialize_sqe ] ---

    /** {@code void io_uring_initialize_sqe(struct io_uring_sqe * sqe)} */
    public static native void nio_uring_initialize_sqe(long sqe);

    /** {@code void io_uring_initialize_sqe(struct io_uring_sqe * sqe)} */
    public static void io_uring_initialize_sqe(@NativeType("struct io_uring_sqe *") IOURingSQE sqe) {
        nio_uring_initialize_sqe(sqe.address());
    }

    // --- [ io_uring_prep_splice ] ---

    /** {@code void io_uring_prep_splice(struct io_uring_sqe * sqe, int fd_in, int64_t off_in, int fd_out, int64_t off_out, unsigned int nbytes, unsigned int splice_flags)} */
    public static native void nio_uring_prep_splice(long sqe, int fd_in, long off_in, int fd_out, long off_out, int nbytes, int splice_flags);

    /** {@code void io_uring_prep_splice(struct io_uring_sqe * sqe, int fd_in, int64_t off_in, int fd_out, int64_t off_out, unsigned int nbytes, unsigned int splice_flags)} */
    public static void io_uring_prep_splice(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd_in, @NativeType("int64_t") long off_in, int fd_out, @NativeType("int64_t") long off_out, @NativeType("unsigned int") int nbytes, @NativeType("unsigned int") int splice_flags) {
        nio_uring_prep_splice(sqe.address(), fd_in, off_in, fd_out, off_out, nbytes, splice_flags);
    }

    // --- [ io_uring_prep_tee ] ---

    /** {@code void io_uring_prep_tee(struct io_uring_sqe * sqe, int fd_in, int fd_out, unsigned int nbytes, unsigned int splice_flags)} */
    public static native void nio_uring_prep_tee(long sqe, int fd_in, int fd_out, int nbytes, int splice_flags);

    /** {@code void io_uring_prep_tee(struct io_uring_sqe * sqe, int fd_in, int fd_out, unsigned int nbytes, unsigned int splice_flags)} */
    public static void io_uring_prep_tee(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd_in, int fd_out, @NativeType("unsigned int") int nbytes, @NativeType("unsigned int") int splice_flags) {
        nio_uring_prep_tee(sqe.address(), fd_in, fd_out, nbytes, splice_flags);
    }

    // --- [ io_uring_prep_readv ] ---

    /** {@code void io_uring_prep_readv(struct io_uring_sqe * sqe, int fd, struct iovec const * iovecs, unsigned int nr_vecs, int offset)} */
    public static native void nio_uring_prep_readv(long sqe, int fd, long iovecs, int nr_vecs, int offset);

    /** {@code void io_uring_prep_readv(struct io_uring_sqe * sqe, int fd, struct iovec const * iovecs, unsigned int nr_vecs, int offset)} */
    public static void io_uring_prep_readv(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct iovec const *") IOVec.Buffer iovecs, int offset) {
        nio_uring_prep_readv(sqe.address(), fd, iovecs.address(), iovecs.remaining(), offset);
    }

    // --- [ io_uring_prep_readv2 ] ---

    /** {@code void io_uring_prep_readv2(struct io_uring_sqe * sqe, int fd, struct iovec const * iovecs, unsigned int nr_vecs, int offset, int flags)} */
    public static native void nio_uring_prep_readv2(long sqe, int fd, long iovecs, int nr_vecs, int offset, int flags);

    /** {@code void io_uring_prep_readv2(struct io_uring_sqe * sqe, int fd, struct iovec const * iovecs, unsigned int nr_vecs, int offset, int flags)} */
    public static void io_uring_prep_readv2(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct iovec const *") IOVec.Buffer iovecs, int offset, int flags) {
        nio_uring_prep_readv2(sqe.address(), fd, iovecs.address(), iovecs.remaining(), offset, flags);
    }

    // --- [ io_uring_prep_read_fixed ] ---

    /** {@code void io_uring_prep_read_fixed(struct io_uring_sqe * sqe, int fd, void * buf, unsigned int nbytes, __u64 offset, int buf_index)} */
    public static native void nio_uring_prep_read_fixed(long sqe, int fd, long buf, int nbytes, long offset, int buf_index);

    /** {@code void io_uring_prep_read_fixed(struct io_uring_sqe * sqe, int fd, void * buf, unsigned int nbytes, __u64 offset, int buf_index)} */
    public static void io_uring_prep_read_fixed(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("void *") ByteBuffer buf, @NativeType("__u64") long offset, int buf_index) {
        nio_uring_prep_read_fixed(sqe.address(), fd, memAddress(buf), buf.remaining(), offset, buf_index);
    }

    // --- [ io_uring_prep_readv_fixed ] ---

    /** {@code void io_uring_prep_readv_fixed(struct io_uring_sqe * sqe, int fd, struct iovec const * iovecs, unsigned int nr_vecs, __u64 offset, int flags, int buf_index)} */
    public static native void nio_uring_prep_readv_fixed(long sqe, int fd, long iovecs, int nr_vecs, long offset, int flags, int buf_index);

    /** {@code void io_uring_prep_readv_fixed(struct io_uring_sqe * sqe, int fd, struct iovec const * iovecs, unsigned int nr_vecs, __u64 offset, int flags, int buf_index)} */
    public static void io_uring_prep_readv_fixed(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct iovec const *") IOVec.Buffer iovecs, @NativeType("__u64") long offset, int flags, int buf_index) {
        nio_uring_prep_readv_fixed(sqe.address(), fd, iovecs.address(), iovecs.remaining(), offset, flags, buf_index);
    }

    // --- [ io_uring_prep_writev ] ---

    /** {@code void io_uring_prep_writev(struct io_uring_sqe * sqe, int fd, struct iovec const * iovecs, unsigned int nr_vecs, __u64 offset)} */
    public static native void nio_uring_prep_writev(long sqe, int fd, long iovecs, int nr_vecs, long offset);

    /** {@code void io_uring_prep_writev(struct io_uring_sqe * sqe, int fd, struct iovec const * iovecs, unsigned int nr_vecs, __u64 offset)} */
    public static void io_uring_prep_writev(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct iovec const *") IOVec.Buffer iovecs, @NativeType("__u64") long offset) {
        nio_uring_prep_writev(sqe.address(), fd, iovecs.address(), iovecs.remaining(), offset);
    }

    // --- [ io_uring_prep_writev2 ] ---

    /** {@code void io_uring_prep_writev2(struct io_uring_sqe * sqe, int fd, struct iovec const * iovecs, unsigned int nr_vecs, __u64 offset, int flags)} */
    public static native void nio_uring_prep_writev2(long sqe, int fd, long iovecs, int nr_vecs, long offset, int flags);

    /** {@code void io_uring_prep_writev2(struct io_uring_sqe * sqe, int fd, struct iovec const * iovecs, unsigned int nr_vecs, __u64 offset, int flags)} */
    public static void io_uring_prep_writev2(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct iovec const *") IOVec.Buffer iovecs, @NativeType("__u64") long offset, int flags) {
        nio_uring_prep_writev2(sqe.address(), fd, iovecs.address(), iovecs.remaining(), offset, flags);
    }

    // --- [ io_uring_prep_write_fixed ] ---

    /** {@code void io_uring_prep_write_fixed(struct io_uring_sqe * sqe, int fd, void const * buf, unsigned int nbytes, __u64 offset, int buf_index)} */
    public static native void nio_uring_prep_write_fixed(long sqe, int fd, long buf, int nbytes, long offset, int buf_index);

    /** {@code void io_uring_prep_write_fixed(struct io_uring_sqe * sqe, int fd, void const * buf, unsigned int nbytes, __u64 offset, int buf_index)} */
    public static void io_uring_prep_write_fixed(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("void const *") ByteBuffer buf, @NativeType("__u64") long offset, int buf_index) {
        nio_uring_prep_write_fixed(sqe.address(), fd, memAddress(buf), buf.remaining(), offset, buf_index);
    }

    // --- [ io_uring_prep_writev_fixed ] ---

    /** {@code void io_uring_prep_writev_fixed(struct io_uring_sqe * sqe, int fd, struct iovec const * iovecs, unsigned int nr_vecs, __u64 offset, int flags, int buf_index)} */
    public static native void nio_uring_prep_writev_fixed(long sqe, int fd, long iovecs, int nr_vecs, long offset, int flags, int buf_index);

    /** {@code void io_uring_prep_writev_fixed(struct io_uring_sqe * sqe, int fd, struct iovec const * iovecs, unsigned int nr_vecs, __u64 offset, int flags, int buf_index)} */
    public static void io_uring_prep_writev_fixed(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct iovec const *") IOVec.Buffer iovecs, @NativeType("__u64") long offset, int flags, int buf_index) {
        nio_uring_prep_writev_fixed(sqe.address(), fd, iovecs.address(), iovecs.remaining(), offset, flags, buf_index);
    }

    // --- [ io_uring_prep_recvmsg ] ---

    /** {@code void io_uring_prep_recvmsg(struct io_uring_sqe * sqe, int fd, struct msghdr * msg, unsigned flags)} */
    public static native void nio_uring_prep_recvmsg(long sqe, int fd, long msg, int flags);

    /** {@code void io_uring_prep_recvmsg(struct io_uring_sqe * sqe, int fd, struct msghdr * msg, unsigned flags)} */
    public static void io_uring_prep_recvmsg(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct msghdr *") Msghdr msg, @NativeType("unsigned") int flags) {
        nio_uring_prep_recvmsg(sqe.address(), fd, msg.address(), flags);
    }

    // --- [ io_uring_prep_recvmsg_multishot ] ---

    /** {@code void io_uring_prep_recvmsg_multishot(struct io_uring_sqe * sqe, int fd, struct msghdr * msg, unsigned flags)} */
    public static native void nio_uring_prep_recvmsg_multishot(long sqe, int fd, long msg, int flags);

    /** {@code void io_uring_prep_recvmsg_multishot(struct io_uring_sqe * sqe, int fd, struct msghdr * msg, unsigned flags)} */
    public static void io_uring_prep_recvmsg_multishot(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct msghdr *") Msghdr msg, @NativeType("unsigned") int flags) {
        nio_uring_prep_recvmsg_multishot(sqe.address(), fd, msg.address(), flags);
    }

    // --- [ io_uring_prep_sendmsg ] ---

    /** {@code void io_uring_prep_sendmsg(struct io_uring_sqe * sqe, int fd, struct msghdr const * msg, unsigned flags)} */
    public static native void nio_uring_prep_sendmsg(long sqe, int fd, long msg, int flags);

    /** {@code void io_uring_prep_sendmsg(struct io_uring_sqe * sqe, int fd, struct msghdr const * msg, unsigned flags)} */
    public static void io_uring_prep_sendmsg(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct msghdr const *") Msghdr msg, @NativeType("unsigned") int flags) {
        if (CHECKS) {
            Msghdr.validate(msg.address());
        }
        nio_uring_prep_sendmsg(sqe.address(), fd, msg.address(), flags);
    }

    // --- [ io_uring_prep_poll_add ] ---

    /** {@code void io_uring_prep_poll_add(struct io_uring_sqe * sqe, int fd, unsigned poll_mask)} */
    public static native void nio_uring_prep_poll_add(long sqe, int fd, int poll_mask);

    /** {@code void io_uring_prep_poll_add(struct io_uring_sqe * sqe, int fd, unsigned poll_mask)} */
    public static void io_uring_prep_poll_add(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("unsigned") int poll_mask) {
        nio_uring_prep_poll_add(sqe.address(), fd, poll_mask);
    }

    // --- [ io_uring_prep_poll_multishot ] ---

    /** {@code void io_uring_prep_poll_multishot(struct io_uring_sqe * sqe, int fd, unsigned poll_mask)} */
    public static native void nio_uring_prep_poll_multishot(long sqe, int fd, int poll_mask);

    /** {@code void io_uring_prep_poll_multishot(struct io_uring_sqe * sqe, int fd, unsigned poll_mask)} */
    public static void io_uring_prep_poll_multishot(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("unsigned") int poll_mask) {
        nio_uring_prep_poll_multishot(sqe.address(), fd, poll_mask);
    }

    // --- [ io_uring_prep_poll_remove ] ---

    /** {@code void io_uring_prep_poll_remove(struct io_uring_sqe * sqe, __u64 user_data)} */
    public static native void nio_uring_prep_poll_remove(long sqe, long user_data);

    /** {@code void io_uring_prep_poll_remove(struct io_uring_sqe * sqe, __u64 user_data)} */
    public static void io_uring_prep_poll_remove(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("__u64") long user_data) {
        nio_uring_prep_poll_remove(sqe.address(), user_data);
    }

    // --- [ io_uring_prep_poll_update ] ---

    /** {@code void io_uring_prep_poll_update(struct io_uring_sqe * sqe, __u64 old_user_data, __u64 new_user_data, unsigned poll_mask, unsigned flags)} */
    public static native void nio_uring_prep_poll_update(long sqe, long old_user_data, long new_user_data, int poll_mask, int flags);

    /** {@code void io_uring_prep_poll_update(struct io_uring_sqe * sqe, __u64 old_user_data, __u64 new_user_data, unsigned poll_mask, unsigned flags)} */
    public static void io_uring_prep_poll_update(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("__u64") long old_user_data, @NativeType("__u64") long new_user_data, @NativeType("unsigned") int poll_mask, @NativeType("unsigned") int flags) {
        nio_uring_prep_poll_update(sqe.address(), old_user_data, new_user_data, poll_mask, flags);
    }

    // --- [ io_uring_prep_fsync ] ---

    /** {@code void io_uring_prep_fsync(struct io_uring_sqe * sqe, int fd, unsigned fsync_flags)} */
    public static native void nio_uring_prep_fsync(long sqe, int fd, int fsync_flags);

    /** {@code void io_uring_prep_fsync(struct io_uring_sqe * sqe, int fd, unsigned fsync_flags)} */
    public static void io_uring_prep_fsync(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("unsigned") int fsync_flags) {
        nio_uring_prep_fsync(sqe.address(), fd, fsync_flags);
    }

    // --- [ io_uring_prep_nop ] ---

    /** {@code void io_uring_prep_nop(struct io_uring_sqe * sqe)} */
    public static native void nio_uring_prep_nop(long sqe);

    /** {@code void io_uring_prep_nop(struct io_uring_sqe * sqe)} */
    public static void io_uring_prep_nop(@NativeType("struct io_uring_sqe *") IOURingSQE sqe) {
        nio_uring_prep_nop(sqe.address());
    }

    // --- [ io_uring_prep_nop128 ] ---

    /** {@code void io_uring_prep_nop128(struct io_uring_sqe * sqe)} */
    public static native void nio_uring_prep_nop128(long sqe);

    /** {@code void io_uring_prep_nop128(struct io_uring_sqe * sqe)} */
    public static void io_uring_prep_nop128(@NativeType("struct io_uring_sqe *") IOURingSQE sqe) {
        nio_uring_prep_nop128(sqe.address());
    }

    // --- [ io_uring_prep_timeout ] ---

    /** {@code void io_uring_prep_timeout(struct io_uring_sqe * sqe, struct __kernel_timespec const * ts, unsigned count, unsigned flags)} */
    public static native void nio_uring_prep_timeout(long sqe, long ts, int count, int flags);

    /** {@code void io_uring_prep_timeout(struct io_uring_sqe * sqe, struct __kernel_timespec const * ts, unsigned count, unsigned flags)} */
    public static void io_uring_prep_timeout(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("struct __kernel_timespec const *") KernelTimespec ts, @NativeType("unsigned") int count, @NativeType("unsigned") int flags) {
        nio_uring_prep_timeout(sqe.address(), ts.address(), count, flags);
    }

    // --- [ io_uring_prep_timeout_remove ] ---

    /** {@code void io_uring_prep_timeout_remove(struct io_uring_sqe * sqe, __u64 user_data, unsigned flags)} */
    public static native void nio_uring_prep_timeout_remove(long sqe, long user_data, int flags);

    /** {@code void io_uring_prep_timeout_remove(struct io_uring_sqe * sqe, __u64 user_data, unsigned flags)} */
    public static void io_uring_prep_timeout_remove(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("__u64") long user_data, @NativeType("unsigned") int flags) {
        nio_uring_prep_timeout_remove(sqe.address(), user_data, flags);
    }

    // --- [ io_uring_prep_timeout_update ] ---

    /** {@code void io_uring_prep_timeout_update(struct io_uring_sqe * sqe, struct __kernel_timespec const * ts, __u64 user_data, unsigned flags)} */
    public static native void nio_uring_prep_timeout_update(long sqe, long ts, long user_data, int flags);

    /** {@code void io_uring_prep_timeout_update(struct io_uring_sqe * sqe, struct __kernel_timespec const * ts, __u64 user_data, unsigned flags)} */
    public static void io_uring_prep_timeout_update(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("struct __kernel_timespec const *") KernelTimespec ts, @NativeType("__u64") long user_data, @NativeType("unsigned") int flags) {
        nio_uring_prep_timeout_update(sqe.address(), ts.address(), user_data, flags);
    }

    // --- [ io_uring_prep_accept ] ---

    /** {@code void io_uring_prep_accept(struct io_uring_sqe * sqe, int fd, struct sockaddr * addr, socklen_t * addrlen, int flags)} */
    public static native void nio_uring_prep_accept(long sqe, int fd, long addr, long addrlen, int flags);

    /** {@code void io_uring_prep_accept(struct io_uring_sqe * sqe, int fd, struct sockaddr * addr, socklen_t * addrlen, int flags)} */
    public static void io_uring_prep_accept(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct sockaddr *") Sockaddr addr, @NativeType("socklen_t *") IntBuffer addrlen, int flags) {
        if (CHECKS) {
            check(addrlen, 1);
        }
        nio_uring_prep_accept(sqe.address(), fd, addr.address(), memAddress(addrlen), flags);
    }

    // --- [ io_uring_prep_accept_direct ] ---

    /** {@code void io_uring_prep_accept_direct(struct io_uring_sqe * sqe, int fd, struct sockaddr * addr, socklen_t * addrlen, int flags, unsigned int file_index)} */
    public static native void nio_uring_prep_accept_direct(long sqe, int fd, long addr, long addrlen, int flags, int file_index);

    /** {@code void io_uring_prep_accept_direct(struct io_uring_sqe * sqe, int fd, struct sockaddr * addr, socklen_t * addrlen, int flags, unsigned int file_index)} */
    public static void io_uring_prep_accept_direct(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct sockaddr *") Sockaddr addr, @NativeType("socklen_t *") IntBuffer addrlen, int flags, @NativeType("unsigned int") int file_index) {
        if (CHECKS) {
            check(addrlen, 1);
        }
        nio_uring_prep_accept_direct(sqe.address(), fd, addr.address(), memAddress(addrlen), flags, file_index);
    }

    // --- [ io_uring_prep_multishot_accept ] ---

    /** {@code void io_uring_prep_multishot_accept(struct io_uring_sqe * sqe, int fd, struct sockaddr * addr, socklen_t * addrlen, int flags)} */
    public static native void nio_uring_prep_multishot_accept(long sqe, int fd, long addr, long addrlen, int flags);

    /** {@code void io_uring_prep_multishot_accept(struct io_uring_sqe * sqe, int fd, struct sockaddr * addr, socklen_t * addrlen, int flags)} */
    public static void io_uring_prep_multishot_accept(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct sockaddr *") Sockaddr addr, @NativeType("socklen_t *") IntBuffer addrlen, int flags) {
        if (CHECKS) {
            check(addrlen, 1);
        }
        nio_uring_prep_multishot_accept(sqe.address(), fd, addr.address(), memAddress(addrlen), flags);
    }

    // --- [ io_uring_prep_multishot_accept_direct ] ---

    /** {@code void io_uring_prep_multishot_accept_direct(struct io_uring_sqe * sqe, int fd, struct sockaddr * addr, socklen_t * addrlen, int flags)} */
    public static native void nio_uring_prep_multishot_accept_direct(long sqe, int fd, long addr, long addrlen, int flags);

    /** {@code void io_uring_prep_multishot_accept_direct(struct io_uring_sqe * sqe, int fd, struct sockaddr * addr, socklen_t * addrlen, int flags)} */
    public static void io_uring_prep_multishot_accept_direct(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct sockaddr *") Sockaddr addr, @NativeType("socklen_t *") IntBuffer addrlen, int flags) {
        if (CHECKS) {
            check(addrlen, 1);
        }
        nio_uring_prep_multishot_accept_direct(sqe.address(), fd, addr.address(), memAddress(addrlen), flags);
    }

    // --- [ io_uring_prep_cancel64 ] ---

    /** {@code void io_uring_prep_cancel64(struct io_uring_sqe * sqe, __u64 user_data, int flags)} */
    public static native void nio_uring_prep_cancel64(long sqe, long user_data, int flags);

    /** {@code void io_uring_prep_cancel64(struct io_uring_sqe * sqe, __u64 user_data, int flags)} */
    public static void io_uring_prep_cancel64(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("__u64") long user_data, int flags) {
        nio_uring_prep_cancel64(sqe.address(), user_data, flags);
    }

    // --- [ io_uring_prep_cancel ] ---

    /** {@code void io_uring_prep_cancel(struct io_uring_sqe * sqe, void * user_data, int flags)} */
    public static native void nio_uring_prep_cancel(long sqe, long user_data, int flags);

    /** {@code void io_uring_prep_cancel(struct io_uring_sqe * sqe, void * user_data, int flags)} */
    public static void io_uring_prep_cancel(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("void *") long user_data, int flags) {
        nio_uring_prep_cancel(sqe.address(), user_data, flags);
    }

    // --- [ io_uring_prep_cancel_fd ] ---

    /** {@code void io_uring_prep_cancel_fd(struct io_uring_sqe * sqe, int fd, unsigned int flags)} */
    public static native void nio_uring_prep_cancel_fd(long sqe, int fd, int flags);

    /** {@code void io_uring_prep_cancel_fd(struct io_uring_sqe * sqe, int fd, unsigned int flags)} */
    public static void io_uring_prep_cancel_fd(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("unsigned int") int flags) {
        nio_uring_prep_cancel_fd(sqe.address(), fd, flags);
    }

    // --- [ io_uring_prep_link_timeout ] ---

    /** {@code void io_uring_prep_link_timeout(struct io_uring_sqe * sqe, struct __kernel_timespec const * ts, unsigned flags)} */
    public static native void nio_uring_prep_link_timeout(long sqe, long ts, int flags);

    /** {@code void io_uring_prep_link_timeout(struct io_uring_sqe * sqe, struct __kernel_timespec const * ts, unsigned flags)} */
    public static void io_uring_prep_link_timeout(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("struct __kernel_timespec const *") KernelTimespec ts, @NativeType("unsigned") int flags) {
        nio_uring_prep_link_timeout(sqe.address(), ts.address(), flags);
    }

    // --- [ io_uring_prep_connect ] ---

    /** {@code void io_uring_prep_connect(struct io_uring_sqe * sqe, int fd, struct sockaddr const * addr, socklen_t addrlen)} */
    public static native void nio_uring_prep_connect(long sqe, int fd, long addr, int addrlen);

    /** {@code void io_uring_prep_connect(struct io_uring_sqe * sqe, int fd, struct sockaddr const * addr, socklen_t addrlen)} */
    public static void io_uring_prep_connect(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct sockaddr const *") Sockaddr addr, @NativeType("socklen_t") int addrlen) {
        nio_uring_prep_connect(sqe.address(), fd, addr.address(), addrlen);
    }

    // --- [ io_uring_prep_bind ] ---

    /** {@code void io_uring_prep_bind(struct io_uring_sqe * sqe, int fd, struct sockaddr const * addr, socklen_t addrlen)} */
    public static native void nio_uring_prep_bind(long sqe, int fd, long addr, int addrlen);

    /** {@code void io_uring_prep_bind(struct io_uring_sqe * sqe, int fd, struct sockaddr const * addr, socklen_t addrlen)} */
    public static void io_uring_prep_bind(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct sockaddr const *") Sockaddr addr, @NativeType("socklen_t") int addrlen) {
        nio_uring_prep_bind(sqe.address(), fd, addr.address(), addrlen);
    }

    // --- [ io_uring_prep_listen ] ---

    /** {@code void io_uring_prep_listen(struct io_uring_sqe * sqe, int fd, int backlog)} */
    public static native void nio_uring_prep_listen(long sqe, int fd, int backlog);

    /** {@code void io_uring_prep_listen(struct io_uring_sqe * sqe, int fd, int backlog)} */
    public static void io_uring_prep_listen(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, int backlog) {
        nio_uring_prep_listen(sqe.address(), fd, backlog);
    }

    // --- [ io_uring_prep_epoll_wait ] ---

    /** {@code void io_uring_prep_epoll_wait(struct io_uring_sqe * sqe, int fd, struct epoll_event * events, unsigned int maxevents, unsigned flags)} */
    public static native void nio_uring_prep_epoll_wait(long sqe, int fd, long events, int maxevents, int flags);

    /** {@code void io_uring_prep_epoll_wait(struct io_uring_sqe * sqe, int fd, struct epoll_event * events, unsigned int maxevents, unsigned flags)} */
    public static void io_uring_prep_epoll_wait(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct epoll_event *") EpollEvent.Buffer events, @NativeType("unsigned") int flags) {
        nio_uring_prep_epoll_wait(sqe.address(), fd, events.address(), events.remaining(), flags);
    }

    // --- [ io_uring_prep_files_update ] ---

    /** {@code void io_uring_prep_files_update(struct io_uring_sqe * sqe, int * fds, unsigned nr_fds, int offset)} */
    public static native void nio_uring_prep_files_update(long sqe, long fds, int nr_fds, int offset);

    /** {@code void io_uring_prep_files_update(struct io_uring_sqe * sqe, int * fds, unsigned nr_fds, int offset)} */
    public static void io_uring_prep_files_update(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("int *") IntBuffer fds, int offset) {
        nio_uring_prep_files_update(sqe.address(), memAddress(fds), fds.remaining(), offset);
    }

    // --- [ io_uring_prep_fallocate ] ---

    /** {@code void io_uring_prep_fallocate(struct io_uring_sqe * sqe, int fd, int mode, __u64 offset, __u64 len)} */
    public static native void nio_uring_prep_fallocate(long sqe, int fd, int mode, long offset, long len);

    /** {@code void io_uring_prep_fallocate(struct io_uring_sqe * sqe, int fd, int mode, __u64 offset, __u64 len)} */
    public static void io_uring_prep_fallocate(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, int mode, @NativeType("__u64") long offset, @NativeType("__u64") long len) {
        nio_uring_prep_fallocate(sqe.address(), fd, mode, offset, len);
    }

    // --- [ io_uring_prep_openat ] ---

    /** {@code void io_uring_prep_openat(struct io_uring_sqe * sqe, int dfd, char const * path, int flags, int mode)} */
    public static native void nio_uring_prep_openat(long sqe, int dfd, long path, int flags, int mode);

    /** {@code void io_uring_prep_openat(struct io_uring_sqe * sqe, int dfd, char const * path, int flags, int mode)} */
    public static void io_uring_prep_openat(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int dfd, @NativeType("char const *") ByteBuffer path, int flags, int mode) {
        if (CHECKS) {
            checkNT1(path);
        }
        nio_uring_prep_openat(sqe.address(), dfd, memAddress(path), flags, mode);
    }

    /** {@code void io_uring_prep_openat(struct io_uring_sqe * sqe, int dfd, char const * path, int flags, int mode)} */
    public static void io_uring_prep_openat(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int dfd, @NativeType("char const *") CharSequence path, int flags, int mode) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            nio_uring_prep_openat(sqe.address(), dfd, pathEncoded, flags, mode);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ io_uring_prep_openat_direct ] ---

    /** {@code void io_uring_prep_openat_direct(struct io_uring_sqe * sqe, int dfd, char const * path, int flags, int mode, unsigned int file_index)} */
    public static native void nio_uring_prep_openat_direct(long sqe, int dfd, long path, int flags, int mode, int file_index);

    /** {@code void io_uring_prep_openat_direct(struct io_uring_sqe * sqe, int dfd, char const * path, int flags, int mode, unsigned int file_index)} */
    public static void io_uring_prep_openat_direct(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int dfd, @NativeType("char const *") ByteBuffer path, int flags, int mode, @NativeType("unsigned int") int file_index) {
        if (CHECKS) {
            checkNT1(path);
        }
        nio_uring_prep_openat_direct(sqe.address(), dfd, memAddress(path), flags, mode, file_index);
    }

    /** {@code void io_uring_prep_openat_direct(struct io_uring_sqe * sqe, int dfd, char const * path, int flags, int mode, unsigned int file_index)} */
    public static void io_uring_prep_openat_direct(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int dfd, @NativeType("char const *") CharSequence path, int flags, int mode, @NativeType("unsigned int") int file_index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            nio_uring_prep_openat_direct(sqe.address(), dfd, pathEncoded, flags, mode, file_index);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ io_uring_prep_open ] ---

    /** {@code void io_uring_prep_open(struct io_uring_sqe * sqe, char const * path, int flags, mode_t mode)} */
    public static native void nio_uring_prep_open(long sqe, long path, int flags, int mode);

    /** {@code void io_uring_prep_open(struct io_uring_sqe * sqe, char const * path, int flags, mode_t mode)} */
    public static void io_uring_prep_open(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") ByteBuffer path, int flags, @NativeType("mode_t") int mode) {
        if (CHECKS) {
            checkNT1(path);
        }
        nio_uring_prep_open(sqe.address(), memAddress(path), flags, mode);
    }

    /** {@code void io_uring_prep_open(struct io_uring_sqe * sqe, char const * path, int flags, mode_t mode)} */
    public static void io_uring_prep_open(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") CharSequence path, int flags, @NativeType("mode_t") int mode) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            nio_uring_prep_open(sqe.address(), pathEncoded, flags, mode);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ io_uring_prep_open_direct ] ---

    /** {@code void io_uring_prep_open_direct(struct io_uring_sqe * sqe, char const * path, int flags, mode_t mode, unsigned file_index)} */
    public static native void nio_uring_prep_open_direct(long sqe, long path, int flags, int mode, int file_index);

    /** {@code void io_uring_prep_open_direct(struct io_uring_sqe * sqe, char const * path, int flags, mode_t mode, unsigned file_index)} */
    public static void io_uring_prep_open_direct(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") ByteBuffer path, int flags, @NativeType("mode_t") int mode, @NativeType("unsigned") int file_index) {
        if (CHECKS) {
            checkNT1(path);
        }
        nio_uring_prep_open_direct(sqe.address(), memAddress(path), flags, mode, file_index);
    }

    /** {@code void io_uring_prep_open_direct(struct io_uring_sqe * sqe, char const * path, int flags, mode_t mode, unsigned file_index)} */
    public static void io_uring_prep_open_direct(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") CharSequence path, int flags, @NativeType("mode_t") int mode, @NativeType("unsigned") int file_index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            nio_uring_prep_open_direct(sqe.address(), pathEncoded, flags, mode, file_index);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ io_uring_prep_close ] ---

    /** {@code void io_uring_prep_close(struct io_uring_sqe * sqe, int fd)} */
    public static native void nio_uring_prep_close(long sqe, int fd);

    /** {@code void io_uring_prep_close(struct io_uring_sqe * sqe, int fd)} */
    public static void io_uring_prep_close(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd) {
        nio_uring_prep_close(sqe.address(), fd);
    }

    // --- [ io_uring_prep_close_direct ] ---

    /** {@code void io_uring_prep_close_direct(struct io_uring_sqe * sqe, unsigned int file_index)} */
    public static native void nio_uring_prep_close_direct(long sqe, int file_index);

    /** {@code void io_uring_prep_close_direct(struct io_uring_sqe * sqe, unsigned int file_index)} */
    public static void io_uring_prep_close_direct(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("unsigned int") int file_index) {
        nio_uring_prep_close_direct(sqe.address(), file_index);
    }

    // --- [ io_uring_prep_read ] ---

    /** {@code void io_uring_prep_read(struct io_uring_sqe * sqe, int fd, void * buf, unsigned int nbytes, __u64 offset)} */
    public static native void nio_uring_prep_read(long sqe, int fd, long buf, int nbytes, long offset);

    /** {@code void io_uring_prep_read(struct io_uring_sqe * sqe, int fd, void * buf, unsigned int nbytes, __u64 offset)} */
    public static void io_uring_prep_read(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("void *") ByteBuffer buf, @NativeType("__u64") long offset) {
        nio_uring_prep_read(sqe.address(), fd, memAddress(buf), buf.remaining(), offset);
    }

    // --- [ io_uring_prep_read_multishot ] ---

    /** {@code void io_uring_prep_read_multishot(struct io_uring_sqe * sqe, int fd, unsigned int nbytes, __u64 offset, int buf_group)} */
    public static native void nio_uring_prep_read_multishot(long sqe, int fd, int nbytes, long offset, int buf_group);

    /** {@code void io_uring_prep_read_multishot(struct io_uring_sqe * sqe, int fd, unsigned int nbytes, __u64 offset, int buf_group)} */
    public static void io_uring_prep_read_multishot(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("unsigned int") int nbytes, @NativeType("__u64") long offset, int buf_group) {
        nio_uring_prep_read_multishot(sqe.address(), fd, nbytes, offset, buf_group);
    }

    // --- [ io_uring_prep_write ] ---

    /** {@code void io_uring_prep_write(struct io_uring_sqe * sqe, int fd, void const * buf, unsigned int nbytes, __u64 offset)} */
    public static native void nio_uring_prep_write(long sqe, int fd, long buf, int nbytes, long offset);

    /** {@code void io_uring_prep_write(struct io_uring_sqe * sqe, int fd, void const * buf, unsigned int nbytes, __u64 offset)} */
    public static void io_uring_prep_write(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("void const *") ByteBuffer buf, @NativeType("__u64") long offset) {
        nio_uring_prep_write(sqe.address(), fd, memAddress(buf), buf.remaining(), offset);
    }

    // --- [ io_uring_prep_statx ] ---

    /** {@code void io_uring_prep_statx(struct io_uring_sqe * sqe, int dfd, char const * path, int flags, unsigned mask, struct statx * statxbuf)} */
    public static native void nio_uring_prep_statx(long sqe, int dfd, long path, int flags, int mask, long statxbuf);

    /** {@code void io_uring_prep_statx(struct io_uring_sqe * sqe, int dfd, char const * path, int flags, unsigned mask, struct statx * statxbuf)} */
    public static void io_uring_prep_statx(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int dfd, @NativeType("char const *") ByteBuffer path, int flags, @NativeType("unsigned") int mask, @NativeType("struct statx *") Statx statxbuf) {
        if (CHECKS) {
            checkNT1(path);
        }
        nio_uring_prep_statx(sqe.address(), dfd, memAddress(path), flags, mask, statxbuf.address());
    }

    /** {@code void io_uring_prep_statx(struct io_uring_sqe * sqe, int dfd, char const * path, int flags, unsigned mask, struct statx * statxbuf)} */
    public static void io_uring_prep_statx(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int dfd, @NativeType("char const *") CharSequence path, int flags, @NativeType("unsigned") int mask, @NativeType("struct statx *") Statx statxbuf) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            nio_uring_prep_statx(sqe.address(), dfd, pathEncoded, flags, mask, statxbuf.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ io_uring_prep_fadvise ] ---

    /** {@code void io_uring_prep_fadvise(struct io_uring_sqe * sqe, int fd, __u64 offset, __u32 len, int advice)} */
    public static native void nio_uring_prep_fadvise(long sqe, int fd, long offset, int len, int advice);

    /** {@code void io_uring_prep_fadvise(struct io_uring_sqe * sqe, int fd, __u64 offset, __u32 len, int advice)} */
    public static void io_uring_prep_fadvise(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("__u64") long offset, @NativeType("__u32") int len, int advice) {
        nio_uring_prep_fadvise(sqe.address(), fd, offset, len, advice);
    }

    // --- [ io_uring_prep_madvise ] ---

    /** {@code void io_uring_prep_madvise(struct io_uring_sqe * sqe, void * addr, __u32 length, int advice)} */
    public static native void nio_uring_prep_madvise(long sqe, long addr, int length, int advice);

    /** {@code void io_uring_prep_madvise(struct io_uring_sqe * sqe, void * addr, __u32 length, int advice)} */
    public static void io_uring_prep_madvise(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("void *") ByteBuffer addr, int advice) {
        nio_uring_prep_madvise(sqe.address(), memAddress(addr), addr.remaining(), advice);
    }

    // --- [ io_uring_prep_fadvise64 ] ---

    /** {@code void io_uring_prep_fadvise64(struct io_uring_sqe * sqe, int fd, __u64 offset, off_t len, int advice)} */
    public static native void nio_uring_prep_fadvise64(long sqe, int fd, long offset, long len, int advice);

    /** {@code void io_uring_prep_fadvise64(struct io_uring_sqe * sqe, int fd, __u64 offset, off_t len, int advice)} */
    public static void io_uring_prep_fadvise64(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("__u64") long offset, @NativeType("off_t") long len, int advice) {
        nio_uring_prep_fadvise64(sqe.address(), fd, offset, len, advice);
    }

    // --- [ io_uring_prep_madvise64 ] ---

    /** {@code void io_uring_prep_madvise64(struct io_uring_sqe * sqe, void * addr, off_t length, int advice)} */
    public static native void nio_uring_prep_madvise64(long sqe, long addr, long length, int advice);

    /** {@code void io_uring_prep_madvise64(struct io_uring_sqe * sqe, void * addr, off_t length, int advice)} */
    public static void io_uring_prep_madvise64(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("void *") ByteBuffer addr, int advice) {
        nio_uring_prep_madvise64(sqe.address(), memAddress(addr), addr.remaining(), advice);
    }

    // --- [ io_uring_prep_send ] ---

    /** {@code void io_uring_prep_send(struct io_uring_sqe * sqe, int sockfd, void const * buf, size_t len, int flags)} */
    public static native void nio_uring_prep_send(long sqe, int sockfd, long buf, long len, int flags);

    /** {@code void io_uring_prep_send(struct io_uring_sqe * sqe, int sockfd, void const * buf, size_t len, int flags)} */
    public static void io_uring_prep_send(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int sockfd, @NativeType("void const *") ByteBuffer buf, int flags) {
        nio_uring_prep_send(sqe.address(), sockfd, memAddress(buf), buf.remaining(), flags);
    }

    // --- [ io_uring_prep_send_bundle ] ---

    /** {@code void io_uring_prep_send_bundle(struct io_uring_sqe * sqe, int sockfd, size_t len, int flags)} */
    public static native void nio_uring_prep_send_bundle(long sqe, int sockfd, long len, int flags);

    /** {@code void io_uring_prep_send_bundle(struct io_uring_sqe * sqe, int sockfd, size_t len, int flags)} */
    public static void io_uring_prep_send_bundle(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int sockfd, @NativeType("size_t") long len, int flags) {
        nio_uring_prep_send_bundle(sqe.address(), sockfd, len, flags);
    }

    // --- [ io_uring_prep_send_set_addr ] ---

    /** {@code void io_uring_prep_send_set_addr(struct io_uring_sqe * sqe, struct sockaddr const * dest_addr, __u16 addr_len)} */
    public static native void nio_uring_prep_send_set_addr(long sqe, long dest_addr, short addr_len);

    /** {@code void io_uring_prep_send_set_addr(struct io_uring_sqe * sqe, struct sockaddr const * dest_addr, __u16 addr_len)} */
    public static void io_uring_prep_send_set_addr(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("struct sockaddr const *") Sockaddr dest_addr, @NativeType("__u16") short addr_len) {
        nio_uring_prep_send_set_addr(sqe.address(), dest_addr.address(), addr_len);
    }

    // --- [ io_uring_prep_sendto ] ---

    /** {@code void io_uring_prep_sendto(struct io_uring_sqe * sqe, int sockfd, void const * buf, size_t len, int flags, struct sockaddr const * addr, socklen_t addrlen)} */
    public static native void nio_uring_prep_sendto(long sqe, int sockfd, long buf, long len, int flags, long addr, int addrlen);

    /** {@code void io_uring_prep_sendto(struct io_uring_sqe * sqe, int sockfd, void const * buf, size_t len, int flags, struct sockaddr const * addr, socklen_t addrlen)} */
    public static void io_uring_prep_sendto(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int sockfd, @NativeType("void const *") ByteBuffer buf, int flags, @NativeType("struct sockaddr const *") Sockaddr addr, @NativeType("socklen_t") int addrlen) {
        nio_uring_prep_sendto(sqe.address(), sockfd, memAddress(buf), buf.remaining(), flags, addr.address(), addrlen);
    }

    // --- [ io_uring_prep_send_zc ] ---

    /** {@code void io_uring_prep_send_zc(struct io_uring_sqe * sqe, int sockfd, void const * buf, size_t len, int flags, unsigned zc_flags)} */
    public static native void nio_uring_prep_send_zc(long sqe, int sockfd, long buf, long len, int flags, int zc_flags);

    /** {@code void io_uring_prep_send_zc(struct io_uring_sqe * sqe, int sockfd, void const * buf, size_t len, int flags, unsigned zc_flags)} */
    public static void io_uring_prep_send_zc(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int sockfd, @NativeType("void const *") ByteBuffer buf, int flags, @NativeType("unsigned") int zc_flags) {
        nio_uring_prep_send_zc(sqe.address(), sockfd, memAddress(buf), buf.remaining(), flags, zc_flags);
    }

    // --- [ io_uring_prep_send_zc_fixed ] ---

    /** {@code void io_uring_prep_send_zc_fixed(struct io_uring_sqe * sqe, int sockfd, void const * buf, size_t len, int flags, unsigned zc_flags, unsigned buf_index)} */
    public static native void nio_uring_prep_send_zc_fixed(long sqe, int sockfd, long buf, long len, int flags, int zc_flags, int buf_index);

    /** {@code void io_uring_prep_send_zc_fixed(struct io_uring_sqe * sqe, int sockfd, void const * buf, size_t len, int flags, unsigned zc_flags, unsigned buf_index)} */
    public static void io_uring_prep_send_zc_fixed(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int sockfd, @NativeType("void const *") ByteBuffer buf, int flags, @NativeType("unsigned") int zc_flags, @NativeType("unsigned") int buf_index) {
        nio_uring_prep_send_zc_fixed(sqe.address(), sockfd, memAddress(buf), buf.remaining(), flags, zc_flags, buf_index);
    }

    // --- [ io_uring_prep_sendmsg_zc ] ---

    /** {@code void io_uring_prep_sendmsg_zc(struct io_uring_sqe * sqe, int fd, struct msghdr const * msg, unsigned flags)} */
    public static native void nio_uring_prep_sendmsg_zc(long sqe, int fd, long msg, int flags);

    /** {@code void io_uring_prep_sendmsg_zc(struct io_uring_sqe * sqe, int fd, struct msghdr const * msg, unsigned flags)} */
    public static void io_uring_prep_sendmsg_zc(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct msghdr const *") Msghdr msg, @NativeType("unsigned") int flags) {
        if (CHECKS) {
            Msghdr.validate(msg.address());
        }
        nio_uring_prep_sendmsg_zc(sqe.address(), fd, msg.address(), flags);
    }

    // --- [ io_uring_prep_sendmsg_zc_fixed ] ---

    /** {@code void io_uring_prep_sendmsg_zc_fixed(struct io_uring_sqe * sqe, int fd, struct msghdr const * msg, unsigned flags, unsigned buf_index)} */
    public static native void nio_uring_prep_sendmsg_zc_fixed(long sqe, int fd, long msg, int flags, int buf_index);

    /** {@code void io_uring_prep_sendmsg_zc_fixed(struct io_uring_sqe * sqe, int fd, struct msghdr const * msg, unsigned flags, unsigned buf_index)} */
    public static void io_uring_prep_sendmsg_zc_fixed(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct msghdr const *") Msghdr msg, @NativeType("unsigned") int flags, @NativeType("unsigned") int buf_index) {
        if (CHECKS) {
            Msghdr.validate(msg.address());
        }
        nio_uring_prep_sendmsg_zc_fixed(sqe.address(), fd, msg.address(), flags, buf_index);
    }

    // --- [ io_uring_prep_recv ] ---

    /** {@code void io_uring_prep_recv(struct io_uring_sqe * sqe, int sockfd, void * buf, size_t len, int flags)} */
    public static native void nio_uring_prep_recv(long sqe, int sockfd, long buf, long len, int flags);

    /** {@code void io_uring_prep_recv(struct io_uring_sqe * sqe, int sockfd, void * buf, size_t len, int flags)} */
    public static void io_uring_prep_recv(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int sockfd, @NativeType("void *") ByteBuffer buf, int flags) {
        nio_uring_prep_recv(sqe.address(), sockfd, memAddress(buf), buf.remaining(), flags);
    }

    // --- [ io_uring_prep_recv_multishot ] ---

    /** {@code void io_uring_prep_recv_multishot(struct io_uring_sqe * sqe, int sockfd, void * buf, size_t len, int flags)} */
    public static native void nio_uring_prep_recv_multishot(long sqe, int sockfd, long buf, long len, int flags);

    /** {@code void io_uring_prep_recv_multishot(struct io_uring_sqe * sqe, int sockfd, void * buf, size_t len, int flags)} */
    public static void io_uring_prep_recv_multishot(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int sockfd, @NativeType("void *") ByteBuffer buf, int flags) {
        nio_uring_prep_recv_multishot(sqe.address(), sockfd, memAddress(buf), buf.remaining(), flags);
    }

    // --- [ io_uring_recvmsg_validate ] ---

    /** {@code struct io_uring_recvmsg_out * io_uring_recvmsg_validate(void * buf, int buf_len, struct msghdr * msgh)} */
    public static native long nio_uring_recvmsg_validate(long buf, int buf_len, long msgh);

    /** {@code struct io_uring_recvmsg_out * io_uring_recvmsg_validate(void * buf, int buf_len, struct msghdr * msgh)} */
    @NativeType("struct io_uring_recvmsg_out *")
    public static @Nullable IOURingRecvmsgOut io_uring_recvmsg_validate(@NativeType("void *") ByteBuffer buf, @NativeType("struct msghdr *") Msghdr msgh) {
        long __result = nio_uring_recvmsg_validate(memAddress(buf), buf.remaining(), msgh.address());
        return IOURingRecvmsgOut.createSafe(__result);
    }

    // --- [ io_uring_recvmsg_name ] ---

    /** {@code void * io_uring_recvmsg_name(struct io_uring_recvmsg_out * o)} */
    public static native long nio_uring_recvmsg_name(long o);

    /** {@code void * io_uring_recvmsg_name(struct io_uring_recvmsg_out * o)} */
    @NativeType("void *")
    public static long io_uring_recvmsg_name(@NativeType("struct io_uring_recvmsg_out *") IOURingRecvmsgOut o) {
        return nio_uring_recvmsg_name(o.address());
    }

    // --- [ io_uring_recvmsg_cmsg_firsthdr ] ---

    /** {@code struct cmsghdr * io_uring_recvmsg_cmsg_firsthdr(struct io_uring_recvmsg_out * o, struct msghdr * msgh)} */
    public static native long nio_uring_recvmsg_cmsg_firsthdr(long o, long msgh);

    /** {@code struct cmsghdr * io_uring_recvmsg_cmsg_firsthdr(struct io_uring_recvmsg_out * o, struct msghdr * msgh)} */
    @NativeType("struct cmsghdr *")
    public static @Nullable CMsghdr io_uring_recvmsg_cmsg_firsthdr(@NativeType("struct io_uring_recvmsg_out *") IOURingRecvmsgOut o, @NativeType("struct msghdr *") Msghdr msgh) {
        long __result = nio_uring_recvmsg_cmsg_firsthdr(o.address(), msgh.address());
        return CMsghdr.createSafe(__result);
    }

    // --- [ io_uring_recvmsg_cmsg_nexthdr ] ---

    /** {@code struct cmsghdr * io_uring_recvmsg_cmsg_nexthdr(struct io_uring_recvmsg_out * o, struct msghdr * msgh, struct cmsghdr * cmsg)} */
    public static native long nio_uring_recvmsg_cmsg_nexthdr(long o, long msgh, long cmsg);

    /** {@code struct cmsghdr * io_uring_recvmsg_cmsg_nexthdr(struct io_uring_recvmsg_out * o, struct msghdr * msgh, struct cmsghdr * cmsg)} */
    @NativeType("struct cmsghdr *")
    public static @Nullable CMsghdr io_uring_recvmsg_cmsg_nexthdr(@NativeType("struct io_uring_recvmsg_out *") IOURingRecvmsgOut o, @NativeType("struct msghdr *") Msghdr msgh, @NativeType("struct cmsghdr *") CMsghdr cmsg) {
        long __result = nio_uring_recvmsg_cmsg_nexthdr(o.address(), msgh.address(), cmsg.address());
        return CMsghdr.createSafe(__result);
    }

    // --- [ io_uring_recvmsg_payload ] ---

    /** {@code void * io_uring_recvmsg_payload(struct io_uring_recvmsg_out * o, struct msghdr * msgh)} */
    public static native long nio_uring_recvmsg_payload(long o, long msgh);

    /** {@code void * io_uring_recvmsg_payload(struct io_uring_recvmsg_out * o, struct msghdr * msgh)} */
    @NativeType("void *")
    public static long io_uring_recvmsg_payload(@NativeType("struct io_uring_recvmsg_out *") IOURingRecvmsgOut o, @NativeType("struct msghdr *") Msghdr msgh) {
        return nio_uring_recvmsg_payload(o.address(), msgh.address());
    }

    // --- [ io_uring_recvmsg_payload_length ] ---

    /** {@code unsigned int io_uring_recvmsg_payload_length(struct io_uring_recvmsg_out * o, int buf_len, struct msghdr * msgh)} */
    public static native int nio_uring_recvmsg_payload_length(long o, int buf_len, long msgh);

    /** {@code unsigned int io_uring_recvmsg_payload_length(struct io_uring_recvmsg_out * o, int buf_len, struct msghdr * msgh)} */
    @NativeType("unsigned int")
    public static int io_uring_recvmsg_payload_length(@NativeType("struct io_uring_recvmsg_out *") IOURingRecvmsgOut o, int buf_len, @NativeType("struct msghdr *") Msghdr msgh) {
        return nio_uring_recvmsg_payload_length(o.address(), buf_len, msgh.address());
    }

    // --- [ io_uring_prep_openat2 ] ---

    /** {@code void io_uring_prep_openat2(struct io_uring_sqe * sqe, int dfd, char const * path, struct open_how const * how)} */
    public static native void nio_uring_prep_openat2(long sqe, int dfd, long path, long how);

    /** {@code void io_uring_prep_openat2(struct io_uring_sqe * sqe, int dfd, char const * path, struct open_how const * how)} */
    public static void io_uring_prep_openat2(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int dfd, @NativeType("char const *") ByteBuffer path, @NativeType("struct open_how const *") OpenHow how) {
        if (CHECKS) {
            checkNT1(path);
        }
        nio_uring_prep_openat2(sqe.address(), dfd, memAddress(path), how.address());
    }

    /** {@code void io_uring_prep_openat2(struct io_uring_sqe * sqe, int dfd, char const * path, struct open_how const * how)} */
    public static void io_uring_prep_openat2(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int dfd, @NativeType("char const *") CharSequence path, @NativeType("struct open_how const *") OpenHow how) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            nio_uring_prep_openat2(sqe.address(), dfd, pathEncoded, how.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ io_uring_prep_openat2_direct ] ---

    /** {@code void io_uring_prep_openat2_direct(struct io_uring_sqe * sqe, int dfd, char const * path, struct open_how const * how, unsigned file_index)} */
    public static native void nio_uring_prep_openat2_direct(long sqe, int dfd, long path, long how, int file_index);

    /** {@code void io_uring_prep_openat2_direct(struct io_uring_sqe * sqe, int dfd, char const * path, struct open_how const * how, unsigned file_index)} */
    public static void io_uring_prep_openat2_direct(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int dfd, @NativeType("char const *") ByteBuffer path, @NativeType("struct open_how const *") OpenHow how, @NativeType("unsigned") int file_index) {
        if (CHECKS) {
            checkNT1(path);
        }
        nio_uring_prep_openat2_direct(sqe.address(), dfd, memAddress(path), how.address(), file_index);
    }

    /** {@code void io_uring_prep_openat2_direct(struct io_uring_sqe * sqe, int dfd, char const * path, struct open_how const * how, unsigned file_index)} */
    public static void io_uring_prep_openat2_direct(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int dfd, @NativeType("char const *") CharSequence path, @NativeType("struct open_how const *") OpenHow how, @NativeType("unsigned") int file_index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            nio_uring_prep_openat2_direct(sqe.address(), dfd, pathEncoded, how.address(), file_index);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ io_uring_prep_epoll_ctl ] ---

    /** {@code void io_uring_prep_epoll_ctl(struct io_uring_sqe * sqe, int epfd, int fd, int op, struct epoll_event const * ev)} */
    public static native void nio_uring_prep_epoll_ctl(long sqe, int epfd, int fd, int op, long ev);

    /** {@code void io_uring_prep_epoll_ctl(struct io_uring_sqe * sqe, int epfd, int fd, int op, struct epoll_event const * ev)} */
    public static void io_uring_prep_epoll_ctl(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int epfd, int fd, int op, @NativeType("struct epoll_event const *") EpollEvent ev) {
        nio_uring_prep_epoll_ctl(sqe.address(), epfd, fd, op, ev.address());
    }

    // --- [ io_uring_prep_provide_buffers ] ---

    /** {@code void io_uring_prep_provide_buffers(struct io_uring_sqe * sqe, void * addr, int len, int nr, int bgid, int bid)} */
    public static native void nio_uring_prep_provide_buffers(long sqe, long addr, int len, int nr, int bgid, int bid);

    /** {@code void io_uring_prep_provide_buffers(struct io_uring_sqe * sqe, void * addr, int len, int nr, int bgid, int bid)} */
    public static void io_uring_prep_provide_buffers(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("void *") ByteBuffer addr, int nr, int bgid, int bid) {
        nio_uring_prep_provide_buffers(sqe.address(), memAddress(addr), addr.remaining(), nr, bgid, bid);
    }

    // --- [ io_uring_prep_remove_buffers ] ---

    /** {@code void io_uring_prep_remove_buffers(struct io_uring_sqe * sqe, int nr, int bgid)} */
    public static native void nio_uring_prep_remove_buffers(long sqe, int nr, int bgid);

    /** {@code void io_uring_prep_remove_buffers(struct io_uring_sqe * sqe, int nr, int bgid)} */
    public static void io_uring_prep_remove_buffers(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int nr, int bgid) {
        nio_uring_prep_remove_buffers(sqe.address(), nr, bgid);
    }

    // --- [ io_uring_prep_shutdown ] ---

    /** {@code void io_uring_prep_shutdown(struct io_uring_sqe * sqe, int fd, int how)} */
    public static native void nio_uring_prep_shutdown(long sqe, int fd, int how);

    /** {@code void io_uring_prep_shutdown(struct io_uring_sqe * sqe, int fd, int how)} */
    public static void io_uring_prep_shutdown(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, int how) {
        nio_uring_prep_shutdown(sqe.address(), fd, how);
    }

    // --- [ io_uring_prep_unlinkat ] ---

    /** {@code void io_uring_prep_unlinkat(struct io_uring_sqe * sqe, int dfd, char const * path, int flags)} */
    public static native void nio_uring_prep_unlinkat(long sqe, int dfd, long path, int flags);

    /** {@code void io_uring_prep_unlinkat(struct io_uring_sqe * sqe, int dfd, char const * path, int flags)} */
    public static void io_uring_prep_unlinkat(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int dfd, @NativeType("char const *") ByteBuffer path, int flags) {
        if (CHECKS) {
            checkNT1(path);
        }
        nio_uring_prep_unlinkat(sqe.address(), dfd, memAddress(path), flags);
    }

    /** {@code void io_uring_prep_unlinkat(struct io_uring_sqe * sqe, int dfd, char const * path, int flags)} */
    public static void io_uring_prep_unlinkat(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int dfd, @NativeType("char const *") CharSequence path, int flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            nio_uring_prep_unlinkat(sqe.address(), dfd, pathEncoded, flags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ io_uring_prep_unlink ] ---

    /** {@code void io_uring_prep_unlink(struct io_uring_sqe * sqe, char const * path, int flags)} */
    public static native void nio_uring_prep_unlink(long sqe, long path, int flags);

    /** {@code void io_uring_prep_unlink(struct io_uring_sqe * sqe, char const * path, int flags)} */
    public static void io_uring_prep_unlink(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") ByteBuffer path, int flags) {
        if (CHECKS) {
            checkNT1(path);
        }
        nio_uring_prep_unlink(sqe.address(), memAddress(path), flags);
    }

    /** {@code void io_uring_prep_unlink(struct io_uring_sqe * sqe, char const * path, int flags)} */
    public static void io_uring_prep_unlink(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") CharSequence path, int flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            nio_uring_prep_unlink(sqe.address(), pathEncoded, flags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ io_uring_prep_renameat ] ---

    /** {@code void io_uring_prep_renameat(struct io_uring_sqe * sqe, int olddfd, char const * oldpath, int newdfd, char const * newpath, unsigned int flags)} */
    public static native void nio_uring_prep_renameat(long sqe, int olddfd, long oldpath, int newdfd, long newpath, int flags);

    /** {@code void io_uring_prep_renameat(struct io_uring_sqe * sqe, int olddfd, char const * oldpath, int newdfd, char const * newpath, unsigned int flags)} */
    public static void io_uring_prep_renameat(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int olddfd, @NativeType("char const *") ByteBuffer oldpath, int newdfd, @NativeType("char const *") ByteBuffer newpath, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            checkNT1(oldpath);
            checkNT1(newpath);
        }
        nio_uring_prep_renameat(sqe.address(), olddfd, memAddress(oldpath), newdfd, memAddress(newpath), flags);
    }

    /** {@code void io_uring_prep_renameat(struct io_uring_sqe * sqe, int olddfd, char const * oldpath, int newdfd, char const * newpath, unsigned int flags)} */
    public static void io_uring_prep_renameat(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int olddfd, @NativeType("char const *") CharSequence oldpath, int newdfd, @NativeType("char const *") CharSequence newpath, @NativeType("unsigned int") int flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(oldpath, true);
            long oldpathEncoded = stack.getPointerAddress();
            stack.nUTF8(newpath, true);
            long newpathEncoded = stack.getPointerAddress();
            nio_uring_prep_renameat(sqe.address(), olddfd, oldpathEncoded, newdfd, newpathEncoded, flags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ io_uring_prep_rename ] ---

    /** {@code void io_uring_prep_rename(struct io_uring_sqe * sqe, char const * oldpath, char const * newpath)} */
    public static native void nio_uring_prep_rename(long sqe, long oldpath, long newpath);

    /** {@code void io_uring_prep_rename(struct io_uring_sqe * sqe, char const * oldpath, char const * newpath)} */
    public static void io_uring_prep_rename(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") ByteBuffer oldpath, @NativeType("char const *") ByteBuffer newpath) {
        if (CHECKS) {
            checkNT1(oldpath);
            checkNT1(newpath);
        }
        nio_uring_prep_rename(sqe.address(), memAddress(oldpath), memAddress(newpath));
    }

    /** {@code void io_uring_prep_rename(struct io_uring_sqe * sqe, char const * oldpath, char const * newpath)} */
    public static void io_uring_prep_rename(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") CharSequence oldpath, @NativeType("char const *") CharSequence newpath) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(oldpath, true);
            long oldpathEncoded = stack.getPointerAddress();
            stack.nUTF8(newpath, true);
            long newpathEncoded = stack.getPointerAddress();
            nio_uring_prep_rename(sqe.address(), oldpathEncoded, newpathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ io_uring_prep_sync_file_range ] ---

    /** {@code void io_uring_prep_sync_file_range(struct io_uring_sqe * sqe, int fd, unsigned len, __u64 offset, int flags)} */
    public static native void nio_uring_prep_sync_file_range(long sqe, int fd, int len, long offset, int flags);

    /** {@code void io_uring_prep_sync_file_range(struct io_uring_sqe * sqe, int fd, unsigned len, __u64 offset, int flags)} */
    public static void io_uring_prep_sync_file_range(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("unsigned") int len, @NativeType("__u64") long offset, int flags) {
        nio_uring_prep_sync_file_range(sqe.address(), fd, len, offset, flags);
    }

    // --- [ io_uring_prep_mkdirat ] ---

    /** {@code void io_uring_prep_mkdirat(struct io_uring_sqe * sqe, int dfd, char const * path, int mode)} */
    public static native void nio_uring_prep_mkdirat(long sqe, int dfd, long path, int mode);

    /** {@code void io_uring_prep_mkdirat(struct io_uring_sqe * sqe, int dfd, char const * path, int mode)} */
    public static void io_uring_prep_mkdirat(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int dfd, @NativeType("char const *") ByteBuffer path, int mode) {
        if (CHECKS) {
            checkNT1(path);
        }
        nio_uring_prep_mkdirat(sqe.address(), dfd, memAddress(path), mode);
    }

    /** {@code void io_uring_prep_mkdirat(struct io_uring_sqe * sqe, int dfd, char const * path, int mode)} */
    public static void io_uring_prep_mkdirat(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int dfd, @NativeType("char const *") CharSequence path, int mode) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            nio_uring_prep_mkdirat(sqe.address(), dfd, pathEncoded, mode);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ io_uring_prep_mkdir ] ---

    /** {@code void io_uring_prep_mkdir(struct io_uring_sqe * sqe, char const * path, int mode)} */
    public static native void nio_uring_prep_mkdir(long sqe, long path, int mode);

    /** {@code void io_uring_prep_mkdir(struct io_uring_sqe * sqe, char const * path, int mode)} */
    public static void io_uring_prep_mkdir(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") ByteBuffer path, int mode) {
        if (CHECKS) {
            checkNT1(path);
        }
        nio_uring_prep_mkdir(sqe.address(), memAddress(path), mode);
    }

    /** {@code void io_uring_prep_mkdir(struct io_uring_sqe * sqe, char const * path, int mode)} */
    public static void io_uring_prep_mkdir(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") CharSequence path, int mode) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            nio_uring_prep_mkdir(sqe.address(), pathEncoded, mode);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ io_uring_prep_symlinkat ] ---

    /** {@code void io_uring_prep_symlinkat(struct io_uring_sqe * sqe, char const * target, int newdirfd, char const * linkpath)} */
    public static native void nio_uring_prep_symlinkat(long sqe, long target, int newdirfd, long linkpath);

    /** {@code void io_uring_prep_symlinkat(struct io_uring_sqe * sqe, char const * target, int newdirfd, char const * linkpath)} */
    public static void io_uring_prep_symlinkat(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") ByteBuffer target, int newdirfd, @NativeType("char const *") ByteBuffer linkpath) {
        if (CHECKS) {
            checkNT1(target);
            checkNT1(linkpath);
        }
        nio_uring_prep_symlinkat(sqe.address(), memAddress(target), newdirfd, memAddress(linkpath));
    }

    /** {@code void io_uring_prep_symlinkat(struct io_uring_sqe * sqe, char const * target, int newdirfd, char const * linkpath)} */
    public static void io_uring_prep_symlinkat(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") CharSequence target, int newdirfd, @NativeType("char const *") CharSequence linkpath) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(target, true);
            long targetEncoded = stack.getPointerAddress();
            stack.nUTF8(linkpath, true);
            long linkpathEncoded = stack.getPointerAddress();
            nio_uring_prep_symlinkat(sqe.address(), targetEncoded, newdirfd, linkpathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ io_uring_prep_symlink ] ---

    /** {@code void io_uring_prep_symlink(struct io_uring_sqe * sqe, char const * target, char const * linkpath)} */
    public static native void nio_uring_prep_symlink(long sqe, long target, long linkpath);

    /** {@code void io_uring_prep_symlink(struct io_uring_sqe * sqe, char const * target, char const * linkpath)} */
    public static void io_uring_prep_symlink(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") ByteBuffer target, @NativeType("char const *") ByteBuffer linkpath) {
        if (CHECKS) {
            checkNT1(target);
            checkNT1(linkpath);
        }
        nio_uring_prep_symlink(sqe.address(), memAddress(target), memAddress(linkpath));
    }

    /** {@code void io_uring_prep_symlink(struct io_uring_sqe * sqe, char const * target, char const * linkpath)} */
    public static void io_uring_prep_symlink(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") CharSequence target, @NativeType("char const *") CharSequence linkpath) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(target, true);
            long targetEncoded = stack.getPointerAddress();
            stack.nUTF8(linkpath, true);
            long linkpathEncoded = stack.getPointerAddress();
            nio_uring_prep_symlink(sqe.address(), targetEncoded, linkpathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ io_uring_prep_linkat ] ---

    /** {@code void io_uring_prep_linkat(struct io_uring_sqe * sqe, int olddfd, char const * oldpath, int newdfd, char const * newpath, int flags)} */
    public static native void nio_uring_prep_linkat(long sqe, int olddfd, long oldpath, int newdfd, long newpath, int flags);

    /** {@code void io_uring_prep_linkat(struct io_uring_sqe * sqe, int olddfd, char const * oldpath, int newdfd, char const * newpath, int flags)} */
    public static void io_uring_prep_linkat(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int olddfd, @NativeType("char const *") ByteBuffer oldpath, int newdfd, @NativeType("char const *") ByteBuffer newpath, int flags) {
        if (CHECKS) {
            checkNT1(oldpath);
            checkNT1(newpath);
        }
        nio_uring_prep_linkat(sqe.address(), olddfd, memAddress(oldpath), newdfd, memAddress(newpath), flags);
    }

    /** {@code void io_uring_prep_linkat(struct io_uring_sqe * sqe, int olddfd, char const * oldpath, int newdfd, char const * newpath, int flags)} */
    public static void io_uring_prep_linkat(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int olddfd, @NativeType("char const *") CharSequence oldpath, int newdfd, @NativeType("char const *") CharSequence newpath, int flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(oldpath, true);
            long oldpathEncoded = stack.getPointerAddress();
            stack.nUTF8(newpath, true);
            long newpathEncoded = stack.getPointerAddress();
            nio_uring_prep_linkat(sqe.address(), olddfd, oldpathEncoded, newdfd, newpathEncoded, flags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ io_uring_prep_link ] ---

    /** {@code void io_uring_prep_link(struct io_uring_sqe * sqe, char const * oldpath, char const * newpath, int flags)} */
    public static native void nio_uring_prep_link(long sqe, long oldpath, long newpath, int flags);

    /** {@code void io_uring_prep_link(struct io_uring_sqe * sqe, char const * oldpath, char const * newpath, int flags)} */
    public static void io_uring_prep_link(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") ByteBuffer oldpath, @NativeType("char const *") ByteBuffer newpath, int flags) {
        if (CHECKS) {
            checkNT1(oldpath);
            checkNT1(newpath);
        }
        nio_uring_prep_link(sqe.address(), memAddress(oldpath), memAddress(newpath), flags);
    }

    /** {@code void io_uring_prep_link(struct io_uring_sqe * sqe, char const * oldpath, char const * newpath, int flags)} */
    public static void io_uring_prep_link(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") CharSequence oldpath, @NativeType("char const *") CharSequence newpath, int flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(oldpath, true);
            long oldpathEncoded = stack.getPointerAddress();
            stack.nUTF8(newpath, true);
            long newpathEncoded = stack.getPointerAddress();
            nio_uring_prep_link(sqe.address(), oldpathEncoded, newpathEncoded, flags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ io_uring_prep_msg_ring_cqe_flags ] ---

    /** {@code void io_uring_prep_msg_ring_cqe_flags(struct io_uring_sqe * sqe, int fd, unsigned int len, __u64 data, unsigned int flags, unsigned int cqe_flags)} */
    public static native void nio_uring_prep_msg_ring_cqe_flags(long sqe, int fd, int len, long data, int flags, int cqe_flags);

    /** {@code void io_uring_prep_msg_ring_cqe_flags(struct io_uring_sqe * sqe, int fd, unsigned int len, __u64 data, unsigned int flags, unsigned int cqe_flags)} */
    public static void io_uring_prep_msg_ring_cqe_flags(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("unsigned int") int len, @NativeType("__u64") long data, @NativeType("unsigned int") int flags, @NativeType("unsigned int") int cqe_flags) {
        nio_uring_prep_msg_ring_cqe_flags(sqe.address(), fd, len, data, flags, cqe_flags);
    }

    // --- [ io_uring_prep_msg_ring ] ---

    /** {@code void io_uring_prep_msg_ring(struct io_uring_sqe * sqe, int fd, unsigned int len, __u64 data, unsigned int flags)} */
    public static native void nio_uring_prep_msg_ring(long sqe, int fd, int len, long data, int flags);

    /** {@code void io_uring_prep_msg_ring(struct io_uring_sqe * sqe, int fd, unsigned int len, __u64 data, unsigned int flags)} */
    public static void io_uring_prep_msg_ring(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("unsigned int") int len, @NativeType("__u64") long data, @NativeType("unsigned int") int flags) {
        nio_uring_prep_msg_ring(sqe.address(), fd, len, data, flags);
    }

    // --- [ io_uring_prep_msg_ring_fd ] ---

    /** {@code void io_uring_prep_msg_ring_fd(struct io_uring_sqe * sqe, int fd, int source_fd, int target_fd, __u64 data, unsigned int flags)} */
    public static native void nio_uring_prep_msg_ring_fd(long sqe, int fd, int source_fd, int target_fd, long data, int flags);

    /** {@code void io_uring_prep_msg_ring_fd(struct io_uring_sqe * sqe, int fd, int source_fd, int target_fd, __u64 data, unsigned int flags)} */
    public static void io_uring_prep_msg_ring_fd(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, int source_fd, int target_fd, @NativeType("__u64") long data, @NativeType("unsigned int") int flags) {
        nio_uring_prep_msg_ring_fd(sqe.address(), fd, source_fd, target_fd, data, flags);
    }

    // --- [ io_uring_prep_msg_ring_fd_alloc ] ---

    /** {@code void io_uring_prep_msg_ring_fd_alloc(struct io_uring_sqe * sqe, int fd, int source_fd, __u64 data, unsigned int flags)} */
    public static native void nio_uring_prep_msg_ring_fd_alloc(long sqe, int fd, int source_fd, long data, int flags);

    /** {@code void io_uring_prep_msg_ring_fd_alloc(struct io_uring_sqe * sqe, int fd, int source_fd, __u64 data, unsigned int flags)} */
    public static void io_uring_prep_msg_ring_fd_alloc(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, int source_fd, @NativeType("__u64") long data, @NativeType("unsigned int") int flags) {
        nio_uring_prep_msg_ring_fd_alloc(sqe.address(), fd, source_fd, data, flags);
    }

    // --- [ io_uring_prep_getxattr ] ---

    /** {@code void io_uring_prep_getxattr(struct io_uring_sqe * sqe, char const * name, char * value, char const * path, unsigned int len)} */
    public static native void nio_uring_prep_getxattr(long sqe, long name, long value, long path, int len);

    /** {@code void io_uring_prep_getxattr(struct io_uring_sqe * sqe, char const * name, char * value, char const * path, unsigned int len)} */
    public static void io_uring_prep_getxattr(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") ByteBuffer name, @NativeType("char *") ByteBuffer value, @NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(name);
            checkNT1(path);
        }
        nio_uring_prep_getxattr(sqe.address(), memAddress(name), memAddress(value), memAddress(path), value.remaining());
    }

    /** {@code void io_uring_prep_getxattr(struct io_uring_sqe * sqe, char const * name, char * value, char const * path, unsigned int len)} */
    public static void io_uring_prep_getxattr(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") CharSequence name, @NativeType("char *") ByteBuffer value, @NativeType("char const *") CharSequence path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            nio_uring_prep_getxattr(sqe.address(), nameEncoded, memAddress(value), pathEncoded, value.remaining());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ io_uring_prep_setxattr ] ---

    /** {@code void io_uring_prep_setxattr(struct io_uring_sqe * sqe, char const * name, char const * value, char const * path, int flags, unsigned int len)} */
    public static native void nio_uring_prep_setxattr(long sqe, long name, long value, long path, int flags, int len);

    /** {@code void io_uring_prep_setxattr(struct io_uring_sqe * sqe, char const * name, char const * value, char const * path, int flags, unsigned int len)} */
    public static void io_uring_prep_setxattr(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer value, @NativeType("char const *") ByteBuffer path, int flags) {
        if (CHECKS) {
            checkNT1(name);
            checkNT1(path);
        }
        nio_uring_prep_setxattr(sqe.address(), memAddress(name), memAddress(value), memAddress(path), flags, value.remaining());
    }

    /** {@code void io_uring_prep_setxattr(struct io_uring_sqe * sqe, char const * name, char const * value, char const * path, int flags, unsigned int len)} */
    public static void io_uring_prep_setxattr(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") CharSequence name, @NativeType("char const *") ByteBuffer value, @NativeType("char const *") CharSequence path, int flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            nio_uring_prep_setxattr(sqe.address(), nameEncoded, memAddress(value), pathEncoded, flags, value.remaining());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ io_uring_prep_fgetxattr ] ---

    /** {@code void io_uring_prep_fgetxattr(struct io_uring_sqe * sqe, int fd, char const * name, char * value, unsigned int len)} */
    public static native void nio_uring_prep_fgetxattr(long sqe, int fd, long name, long value, int len);

    /** {@code void io_uring_prep_fgetxattr(struct io_uring_sqe * sqe, int fd, char const * name, char * value, unsigned int len)} */
    public static void io_uring_prep_fgetxattr(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("char const *") ByteBuffer name, @NativeType("char *") ByteBuffer value) {
        if (CHECKS) {
            checkNT1(name);
        }
        nio_uring_prep_fgetxattr(sqe.address(), fd, memAddress(name), memAddress(value), value.remaining());
    }

    /** {@code void io_uring_prep_fgetxattr(struct io_uring_sqe * sqe, int fd, char const * name, char * value, unsigned int len)} */
    public static void io_uring_prep_fgetxattr(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("char const *") CharSequence name, @NativeType("char *") ByteBuffer value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nio_uring_prep_fgetxattr(sqe.address(), fd, nameEncoded, memAddress(value), value.remaining());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ io_uring_prep_fsetxattr ] ---

    /** {@code void io_uring_prep_fsetxattr(struct io_uring_sqe * sqe, int fd, char const * name, char const * value, int flags, unsigned int len)} */
    public static native void nio_uring_prep_fsetxattr(long sqe, int fd, long name, long value, int flags, int len);

    /** {@code void io_uring_prep_fsetxattr(struct io_uring_sqe * sqe, int fd, char const * name, char const * value, int flags, unsigned int len)} */
    public static void io_uring_prep_fsetxattr(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer value, int flags) {
        if (CHECKS) {
            checkNT1(name);
        }
        nio_uring_prep_fsetxattr(sqe.address(), fd, memAddress(name), memAddress(value), flags, value.remaining());
    }

    /** {@code void io_uring_prep_fsetxattr(struct io_uring_sqe * sqe, int fd, char const * name, char const * value, int flags, unsigned int len)} */
    public static void io_uring_prep_fsetxattr(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("char const *") CharSequence name, @NativeType("char const *") ByteBuffer value, int flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nio_uring_prep_fsetxattr(sqe.address(), fd, nameEncoded, memAddress(value), flags, value.remaining());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ io_uring_prep_socket ] ---

    /** {@code void io_uring_prep_socket(struct io_uring_sqe * sqe, int domain, int type, int protocol, unsigned int flags)} */
    public static native void nio_uring_prep_socket(long sqe, int domain, int type, int protocol, int flags);

    /** {@code void io_uring_prep_socket(struct io_uring_sqe * sqe, int domain, int type, int protocol, unsigned int flags)} */
    public static void io_uring_prep_socket(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int domain, int type, int protocol, @NativeType("unsigned int") int flags) {
        nio_uring_prep_socket(sqe.address(), domain, type, protocol, flags);
    }

    // --- [ io_uring_prep_socket_direct ] ---

    /** {@code void io_uring_prep_socket_direct(struct io_uring_sqe * sqe, int domain, int type, int protocol, unsigned file_index, unsigned int flags)} */
    public static native void nio_uring_prep_socket_direct(long sqe, int domain, int type, int protocol, int file_index, int flags);

    /** {@code void io_uring_prep_socket_direct(struct io_uring_sqe * sqe, int domain, int type, int protocol, unsigned file_index, unsigned int flags)} */
    public static void io_uring_prep_socket_direct(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int domain, int type, int protocol, @NativeType("unsigned") int file_index, @NativeType("unsigned int") int flags) {
        nio_uring_prep_socket_direct(sqe.address(), domain, type, protocol, file_index, flags);
    }

    // --- [ io_uring_prep_socket_direct_alloc ] ---

    /** {@code void io_uring_prep_socket_direct_alloc(struct io_uring_sqe * sqe, int domain, int type, int protocol, unsigned int flags)} */
    public static native void nio_uring_prep_socket_direct_alloc(long sqe, int domain, int type, int protocol, int flags);

    /** {@code void io_uring_prep_socket_direct_alloc(struct io_uring_sqe * sqe, int domain, int type, int protocol, unsigned int flags)} */
    public static void io_uring_prep_socket_direct_alloc(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int domain, int type, int protocol, @NativeType("unsigned int") int flags) {
        nio_uring_prep_socket_direct_alloc(sqe.address(), domain, type, protocol, flags);
    }

    // --- [ io_uring_prep_uring_cmd ] ---

    /** {@code void io_uring_prep_uring_cmd(struct io_uring_sqe * sqe, int cmd_op, int fd)} */
    public static native void nio_uring_prep_uring_cmd(long sqe, int cmd_op, int fd);

    /** {@code void io_uring_prep_uring_cmd(struct io_uring_sqe * sqe, int cmd_op, int fd)} */
    public static void io_uring_prep_uring_cmd(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int cmd_op, int fd) {
        nio_uring_prep_uring_cmd(sqe.address(), cmd_op, fd);
    }

    // --- [ io_uring_prep_uring_cmd128 ] ---

    /** {@code void io_uring_prep_uring_cmd128(struct io_uring_sqe * sqe, int cmd_op, int fd)} */
    public static native void nio_uring_prep_uring_cmd128(long sqe, int cmd_op, int fd);

    /** {@code void io_uring_prep_uring_cmd128(struct io_uring_sqe * sqe, int cmd_op, int fd)} */
    public static void io_uring_prep_uring_cmd128(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int cmd_op, int fd) {
        nio_uring_prep_uring_cmd128(sqe.address(), cmd_op, fd);
    }

    // --- [ io_uring_prep_cmd_sock ] ---

    /** {@code void io_uring_prep_cmd_sock(struct io_uring_sqe * sqe, int cmd_op, int fd, int level, int optname, void * optval, int optlen)} */
    public static native void nio_uring_prep_cmd_sock(long sqe, int cmd_op, int fd, int level, int optname, long optval, int optlen);

    /** {@code void io_uring_prep_cmd_sock(struct io_uring_sqe * sqe, int cmd_op, int fd, int level, int optname, void * optval, int optlen)} */
    public static void io_uring_prep_cmd_sock(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int cmd_op, int fd, int level, int optname, @NativeType("void *") ByteBuffer optval) {
        nio_uring_prep_cmd_sock(sqe.address(), cmd_op, fd, level, optname, memAddress(optval), optval.remaining());
    }

    // --- [ io_uring_prep_cmd_getsockname ] ---

    /** {@code void io_uring_prep_cmd_getsockname(struct io_uring_sqe * sqe, int fd, struct sockaddr * sockaddr, socklen_t * sockaddr_len, int peer)} */
    public static native void nio_uring_prep_cmd_getsockname(long sqe, int fd, long sockaddr, long sockaddr_len, int peer);

    /** {@code void io_uring_prep_cmd_getsockname(struct io_uring_sqe * sqe, int fd, struct sockaddr * sockaddr, socklen_t * sockaddr_len, int peer)} */
    public static void io_uring_prep_cmd_getsockname(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct sockaddr *") Sockaddr sockaddr, @NativeType("socklen_t *") IntBuffer sockaddr_len, int peer) {
        if (CHECKS) {
            check(sockaddr_len, 1);
        }
        nio_uring_prep_cmd_getsockname(sqe.address(), fd, sockaddr.address(), memAddress(sockaddr_len), peer);
    }

    // --- [ io_uring_prep_waitid ] ---

    /** {@code void io_uring_prep_waitid(struct io_uring_sqe * sqe, idtype_t idtype, id_t id, siginfo_t * infop, int options, unsigned int flags)} */
    public static native void nio_uring_prep_waitid(long sqe, int idtype, int id, long infop, int options, int flags);

    /** {@code void io_uring_prep_waitid(struct io_uring_sqe * sqe, idtype_t idtype, id_t id, siginfo_t * infop, int options, unsigned int flags)} */
    public static void io_uring_prep_waitid(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("idtype_t") int idtype, @NativeType("id_t") int id, @NativeType("siginfo_t *") long infop, int options, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(infop);
        }
        nio_uring_prep_waitid(sqe.address(), idtype, id, infop, options, flags);
    }

    // --- [ io_uring_prep_futex_wake ] ---

    /** {@code void io_uring_prep_futex_wake(struct io_uring_sqe * sqe, uint32_t const * futex, uint64_t val, uint64_t mask, uint32_t futex_flags, unsigned int flags)} */
    public static native void nio_uring_prep_futex_wake(long sqe, long futex, long val, long mask, int futex_flags, int flags);

    /** {@code void io_uring_prep_futex_wake(struct io_uring_sqe * sqe, uint32_t const * futex, uint64_t val, uint64_t mask, uint32_t futex_flags, unsigned int flags)} */
    public static void io_uring_prep_futex_wake(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("uint32_t const *") IntBuffer futex, @NativeType("uint64_t") long val, @NativeType("uint64_t") long mask, @NativeType("uint32_t") int futex_flags, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(futex, 1);
        }
        nio_uring_prep_futex_wake(sqe.address(), memAddress(futex), val, mask, futex_flags, flags);
    }

    // --- [ io_uring_prep_futex_wait ] ---

    /** {@code void io_uring_prep_futex_wait(struct io_uring_sqe * sqe, uint32_t const * futex, uint64_t val, uint64_t mask, uint32_t futex_flags, unsigned int flags)} */
    public static native void nio_uring_prep_futex_wait(long sqe, long futex, long val, long mask, int futex_flags, int flags);

    /** {@code void io_uring_prep_futex_wait(struct io_uring_sqe * sqe, uint32_t const * futex, uint64_t val, uint64_t mask, uint32_t futex_flags, unsigned int flags)} */
    public static void io_uring_prep_futex_wait(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("uint32_t const *") IntBuffer futex, @NativeType("uint64_t") long val, @NativeType("uint64_t") long mask, @NativeType("uint32_t") int futex_flags, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(futex, 1);
        }
        nio_uring_prep_futex_wait(sqe.address(), memAddress(futex), val, mask, futex_flags, flags);
    }

    // --- [ io_uring_prep_futex_waitv ] ---

    /** {@code void io_uring_prep_futex_waitv(struct io_uring_sqe * sqe, struct futex_waitv const * futex, unsigned int nr_futex, unsigned int flags)} */
    public static native void nio_uring_prep_futex_waitv(long sqe, long futex, int nr_futex, int flags);

    /** {@code void io_uring_prep_futex_waitv(struct io_uring_sqe * sqe, struct futex_waitv const * futex, unsigned int nr_futex, unsigned int flags)} */
    public static void io_uring_prep_futex_waitv(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("struct futex_waitv const *") PointerBuffer futex, @NativeType("unsigned int") int flags) {
        nio_uring_prep_futex_waitv(sqe.address(), memAddress(futex), futex.remaining(), flags);
    }

    // --- [ io_uring_prep_fixed_fd_install ] ---

    /** {@code void io_uring_prep_fixed_fd_install(struct io_uring_sqe * sqe, int fd, unsigned int flags)} */
    public static native void nio_uring_prep_fixed_fd_install(long sqe, int fd, int flags);

    /** {@code void io_uring_prep_fixed_fd_install(struct io_uring_sqe * sqe, int fd, unsigned int flags)} */
    public static void io_uring_prep_fixed_fd_install(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("unsigned int") int flags) {
        nio_uring_prep_fixed_fd_install(sqe.address(), fd, flags);
    }

    // --- [ io_uring_prep_ftruncate ] ---

    /** {@code void io_uring_prep_ftruncate(struct io_uring_sqe * sqe, int fd, loff_t len)} */
    public static native void nio_uring_prep_ftruncate(long sqe, int fd, long len);

    /** {@code void io_uring_prep_ftruncate(struct io_uring_sqe * sqe, int fd, loff_t len)} */
    public static void io_uring_prep_ftruncate(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("loff_t") long len) {
        nio_uring_prep_ftruncate(sqe.address(), fd, len);
    }

    // --- [ io_uring_prep_cmd_discard ] ---

    /** {@code void io_uring_prep_cmd_discard(struct io_uring_sqe * sqe, int fd, uint64_t offset, uint64_t nbytes)} */
    public static native void nio_uring_prep_cmd_discard(long sqe, int fd, long offset, long nbytes);

    /** {@code void io_uring_prep_cmd_discard(struct io_uring_sqe * sqe, int fd, uint64_t offset, uint64_t nbytes)} */
    public static void io_uring_prep_cmd_discard(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("uint64_t") long offset, @NativeType("uint64_t") long nbytes) {
        nio_uring_prep_cmd_discard(sqe.address(), fd, offset, nbytes);
    }

    // --- [ io_uring_prep_pipe ] ---

    /** {@code void io_uring_prep_pipe(struct io_uring_sqe * sqe, int * fds, int pipe_flags)} */
    public static native void nio_uring_prep_pipe(long sqe, long fds, int pipe_flags);

    /** {@code void io_uring_prep_pipe(struct io_uring_sqe * sqe, int * fds, int pipe_flags)} */
    public static void io_uring_prep_pipe(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("int *") IntBuffer fds, int pipe_flags) {
        if (CHECKS) {
            check(fds, 2);
        }
        nio_uring_prep_pipe(sqe.address(), memAddress(fds), pipe_flags);
    }

    // --- [ io_uring_prep_pipe_direct ] ---

    /** {@code void io_uring_prep_pipe_direct(struct io_uring_sqe * sqe, int * fds, int pipe_flags, unsigned int file_index)} */
    public static native void nio_uring_prep_pipe_direct(long sqe, long fds, int pipe_flags, int file_index);

    /** {@code void io_uring_prep_pipe_direct(struct io_uring_sqe * sqe, int * fds, int pipe_flags, unsigned int file_index)} */
    public static void io_uring_prep_pipe_direct(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("int *") IntBuffer fds, int pipe_flags, @NativeType("unsigned int") int file_index) {
        if (CHECKS) {
            check(fds, 2);
        }
        nio_uring_prep_pipe_direct(sqe.address(), memAddress(fds), pipe_flags, file_index);
    }

    // --- [ io_uring_load_sq_head ] ---

    /** {@code unsigned io_uring_load_sq_head(struct io_uring const * ring)} */
    public static native int nio_uring_load_sq_head(long ring);

    /** {@code unsigned io_uring_load_sq_head(struct io_uring const * ring)} */
    @NativeType("unsigned")
    public static int io_uring_load_sq_head(@NativeType("struct io_uring const *") IOURing ring) {
        if (CHECKS) {
            IOURing.validate(ring.address());
        }
        return nio_uring_load_sq_head(ring.address());
    }

    // --- [ io_uring_sq_ready ] ---

    /** {@code unsigned int io_uring_sq_ready(struct io_uring const * ring)} */
    public static native int nio_uring_sq_ready(long ring);

    /** {@code unsigned int io_uring_sq_ready(struct io_uring const * ring)} */
    @NativeType("unsigned int")
    public static int io_uring_sq_ready(@NativeType("struct io_uring const *") IOURing ring) {
        if (CHECKS) {
            IOURing.validate(ring.address());
        }
        return nio_uring_sq_ready(ring.address());
    }

    // --- [ io_uring_sq_space_left ] ---

    /** {@code unsigned int io_uring_sq_space_left(struct io_uring const * ring)} */
    public static native int nio_uring_sq_space_left(long ring);

    /** {@code unsigned int io_uring_sq_space_left(struct io_uring const * ring)} */
    @NativeType("unsigned int")
    public static int io_uring_sq_space_left(@NativeType("struct io_uring const *") IOURing ring) {
        if (CHECKS) {
            IOURing.validate(ring.address());
        }
        return nio_uring_sq_space_left(ring.address());
    }

    // --- [ io_uring_sqe_shift_from_flags ] ---

    /** {@code unsigned io_uring_sqe_shift_from_flags(unsigned flags)} */
    @NativeType("unsigned")
    public static native int io_uring_sqe_shift_from_flags(@NativeType("unsigned") int flags);

    // --- [ io_uring_sqe_shift ] ---

    /** {@code unsigned io_uring_sqe_shift(struct io_uring const * ring)} */
    public static native int nio_uring_sqe_shift(long ring);

    /** {@code unsigned io_uring_sqe_shift(struct io_uring const * ring)} */
    @NativeType("unsigned")
    public static int io_uring_sqe_shift(@NativeType("struct io_uring const *") IOURing ring) {
        if (CHECKS) {
            IOURing.validate(ring.address());
        }
        return nio_uring_sqe_shift(ring.address());
    }

    // --- [ io_uring_sqring_wait ] ---

    /** {@code int io_uring_sqring_wait(struct io_uring * ring)} */
    public static native int nio_uring_sqring_wait(long ring);

    /** {@code int io_uring_sqring_wait(struct io_uring * ring)} */
    public static int io_uring_sqring_wait(@NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_sqring_wait(ring.address());
    }

    // --- [ io_uring_cq_ready ] ---

    /** {@code unsigned int io_uring_cq_ready(struct io_uring const * ring)} */
    public static native int nio_uring_cq_ready(long ring);

    /** {@code unsigned int io_uring_cq_ready(struct io_uring const * ring)} */
    @NativeType("unsigned int")
    public static int io_uring_cq_ready(@NativeType("struct io_uring const *") IOURing ring) {
        if (CHECKS) {
            IOURing.validate(ring.address());
        }
        return nio_uring_cq_ready(ring.address());
    }

    // --- [ io_uring_cq_has_overflow ] ---

    /** {@code bool io_uring_cq_has_overflow(struct io_uring const * ring)} */
    public static native boolean nio_uring_cq_has_overflow(long ring);

    /** {@code bool io_uring_cq_has_overflow(struct io_uring const * ring)} */
    @NativeType("bool")
    public static boolean io_uring_cq_has_overflow(@NativeType("struct io_uring const *") IOURing ring) {
        if (CHECKS) {
            IOURing.validate(ring.address());
        }
        return nio_uring_cq_has_overflow(ring.address());
    }

    // --- [ io_uring_cq_eventfd_enabled ] ---

    /** {@code bool io_uring_cq_eventfd_enabled(struct io_uring const * ring)} */
    public static native boolean nio_uring_cq_eventfd_enabled(long ring);

    /** {@code bool io_uring_cq_eventfd_enabled(struct io_uring const * ring)} */
    @NativeType("bool")
    public static boolean io_uring_cq_eventfd_enabled(@NativeType("struct io_uring const *") IOURing ring) {
        if (CHECKS) {
            IOURing.validate(ring.address());
        }
        return nio_uring_cq_eventfd_enabled(ring.address());
    }

    // --- [ io_uring_cq_eventfd_toggle ] ---

    /** {@code int io_uring_cq_eventfd_toggle(struct io_uring * ring, bool enabled)} */
    public static native int nio_uring_cq_eventfd_toggle(long ring, boolean enabled);

    /** {@code int io_uring_cq_eventfd_toggle(struct io_uring * ring, bool enabled)} */
    public static int io_uring_cq_eventfd_toggle(@NativeType("struct io_uring *") IOURing ring, @NativeType("bool") boolean enabled) {
        return nio_uring_cq_eventfd_toggle(ring.address(), enabled);
    }

    // --- [ io_uring_wait_cqe_nr ] ---

    /** {@code int io_uring_wait_cqe_nr(struct io_uring * ring, struct io_uring_cqe ** cqe_ptr, unsigned int wait_nr)} */
    public static native int nio_uring_wait_cqe_nr(long ring, long cqe_ptr, int wait_nr);

    /** {@code int io_uring_wait_cqe_nr(struct io_uring * ring, struct io_uring_cqe ** cqe_ptr, unsigned int wait_nr)} */
    public static int io_uring_wait_cqe_nr(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_cqe **") PointerBuffer cqe_ptr) {
        return nio_uring_wait_cqe_nr(ring.address(), memAddress(cqe_ptr), cqe_ptr.remaining());
    }

    // --- [ io_uring_peek_cqe ] ---

    /** {@code int io_uring_peek_cqe(struct io_uring * ring, struct io_uring_cqe ** cqe_ptr)} */
    public static native int nio_uring_peek_cqe(long ring, long cqe_ptr);

    /** {@code int io_uring_peek_cqe(struct io_uring * ring, struct io_uring_cqe ** cqe_ptr)} */
    public static int io_uring_peek_cqe(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_cqe **") PointerBuffer cqe_ptr) {
        if (CHECKS) {
            check(cqe_ptr, 1);
        }
        return nio_uring_peek_cqe(ring.address(), memAddress(cqe_ptr));
    }

    // --- [ io_uring_wait_cqe ] ---

    /** {@code int io_uring_wait_cqe(struct io_uring * ring, struct io_uring_cqe ** cqe_ptr)} */
    public static native int nio_uring_wait_cqe(long ring, long cqe_ptr);

    /** {@code int io_uring_wait_cqe(struct io_uring * ring, struct io_uring_cqe ** cqe_ptr)} */
    public static int io_uring_wait_cqe(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_cqe **") PointerBuffer cqe_ptr) {
        if (CHECKS) {
            check(cqe_ptr, 1);
        }
        return nio_uring_wait_cqe(ring.address(), memAddress(cqe_ptr));
    }

    // --- [ io_uring_buf_ring_advance ] ---

    /** {@code void io_uring_buf_ring_advance(struct io_uring_buf_ring * br, int count)} */
    public static native void nio_uring_buf_ring_advance(long br, int count);

    /** {@code void io_uring_buf_ring_advance(struct io_uring_buf_ring * br, int count)} */
    public static void io_uring_buf_ring_advance(@NativeType("struct io_uring_buf_ring *") IOURingBufRing br, int count) {
        nio_uring_buf_ring_advance(br.address(), count);
    }

    // --- [ io_uring_buf_ring_cq_advance ] ---

    /** {@code void io_uring_buf_ring_cq_advance(struct io_uring * ring, struct io_uring_buf_ring * br, int count)} */
    public static native void nio_uring_buf_ring_cq_advance(long ring, long br, int count);

    /** {@code void io_uring_buf_ring_cq_advance(struct io_uring * ring, struct io_uring_buf_ring * br, int count)} */
    public static void io_uring_buf_ring_cq_advance(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_buf_ring *") IOURingBufRing br, int count) {
        nio_uring_buf_ring_cq_advance(ring.address(), br.address(), count);
    }

    // --- [ io_uring_buf_ring_available ] ---

    /** {@code int io_uring_buf_ring_available(struct io_uring * ring, struct io_uring_buf_ring * br, unsigned short bgid)} */
    public static native int nio_uring_buf_ring_available(long ring, long br, short bgid);

    /** {@code int io_uring_buf_ring_available(struct io_uring * ring, struct io_uring_buf_ring * br, unsigned short bgid)} */
    public static int io_uring_buf_ring_available(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_buf_ring *") IOURingBufRing br, @NativeType("unsigned short") short bgid) {
        return nio_uring_buf_ring_available(ring.address(), br.address(), bgid);
    }

    // --- [ io_uring_get_sqe ] ---

    /** {@code struct io_uring_sqe * io_uring_get_sqe(struct io_uring * ring)} */
    public static native long nio_uring_get_sqe(long ring);

    /** {@code struct io_uring_sqe * io_uring_get_sqe(struct io_uring * ring)} */
    @NativeType("struct io_uring_sqe *")
    public static @Nullable IOURingSQE io_uring_get_sqe(@NativeType("struct io_uring *") IOURing ring) {
        long __result = nio_uring_get_sqe(ring.address());
        return IOURingSQE.createSafe(__result);
    }

    // --- [ io_uring_get_sqe128 ] ---

    /** {@code struct io_uring_sqe * io_uring_get_sqe128(struct io_uring * ring)} */
    public static native long nio_uring_get_sqe128(long ring);

    /** {@code struct io_uring_sqe * io_uring_get_sqe128(struct io_uring * ring)} */
    @NativeType("struct io_uring_sqe *")
    public static @Nullable IOURingSQE io_uring_get_sqe128(@NativeType("struct io_uring *") IOURing ring) {
        long __result = nio_uring_get_sqe128(ring.address());
        return IOURingSQE.createSafe(__result);
    }

    // --- [ io_uring_mlock_size ] ---

    /** {@code int io_uring_mlock_size(unsigned entries, unsigned flags)} */
    public static native int io_uring_mlock_size(@NativeType("unsigned") int entries, @NativeType("unsigned") int flags);

    // --- [ io_uring_mlock_size_params ] ---

    /** {@code int io_uring_mlock_size_params(unsigned entries, struct io_uring_params * p)} */
    public static native int nio_uring_mlock_size_params(int entries, long p);

    /** {@code int io_uring_mlock_size_params(unsigned entries, struct io_uring_params * p)} */
    public static int io_uring_mlock_size_params(@NativeType("unsigned") int entries, @NativeType("struct io_uring_params *") IOURingParams p) {
        return nio_uring_mlock_size_params(entries, p.address());
    }

    // --- [ io_uring_memory_size ] ---

    /** {@code ssize_t io_uring_memory_size(unsigned entries, unsigned flags)} */
    @NativeType("ssize_t")
    public static native long io_uring_memory_size(@NativeType("unsigned") int entries, @NativeType("unsigned") int flags);

    // --- [ io_uring_memory_size_params ] ---

    /** {@code ssize_t io_uring_memory_size_params(unsigned entries, struct io_uring_params * p)} */
    public static native long nio_uring_memory_size_params(int entries, long p);

    /** {@code ssize_t io_uring_memory_size_params(unsigned entries, struct io_uring_params * p)} */
    @NativeType("ssize_t")
    public static long io_uring_memory_size_params(@NativeType("unsigned") int entries, @NativeType("struct io_uring_params *") IOURingParams p) {
        return nio_uring_memory_size_params(entries, p.address());
    }

    // --- [ io_uring_major_version ] ---

    /** {@code int io_uring_major_version(void)} */
    public static native int io_uring_major_version();

    // --- [ io_uring_minor_version ] ---

    /** {@code int io_uring_minor_version(void)} */
    public static native int io_uring_minor_version();

    // --- [ io_uring_check_version ] ---

    /** {@code bool io_uring_check_version(int major, int minor)} */
    @NativeType("bool")
    public static native boolean io_uring_check_version(int major, int minor);

    /** Return the appropriate mask for a buffer ring of size {@code ring_entries} */
    public static int io_uring_buf_ring_mask(@NativeType("__u32") int ring_entries) {
        return ring_entries - 1;
    }

    public static void io_uring_buf_ring_init(@NativeType("struct io_uring_buf_ring *") IOURingBufRing br) {
        br.tail((short)0);
    }

    public static void io_uring_buf_ring_add(@NativeType("struct io_uring_buf_ring *") IOURingBufRing br, @NativeType("void *") ByteBuffer addr, @NativeType("unsigned short") short bid, int mask, int buf_offset) {
        IOURingBuf buf = br.bufs((br.tail() + buf_offset) & mask);

        buf.addr(memAddress(addr));
        buf.len(addr.remaining());
        buf.bid(bid);
    }

}