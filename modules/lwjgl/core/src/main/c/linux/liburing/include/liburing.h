/* SPDX-License-Identifier: MIT */
#ifndef LIB_URING_H
#define LIB_URING_H

#ifndef _XOPEN_SOURCE
#define _XOPEN_SOURCE 500 /* Required for glibc to expose sigset_t */
#endif

#include <sys/socket.h>
#include <sys/uio.h>
#include <errno.h>
#include <signal.h>
#include <stdbool.h>
#include <inttypes.h>
#include <time.h>
#include <sched.h>
#include <linux/swab.h>
#include "liburing/compat.h"
#include "liburing/io_uring.h"
#include "liburing/barrier.h"

#ifndef uring_unlikely
#  define uring_unlikely(cond)      __builtin_expect(!!(cond), 0)
#endif

#ifndef uring_likely
#  define uring_likely(cond)        __builtin_expect(!!(cond), 1)
#endif

#ifdef __cplusplus
extern "C" {
#endif

/*
 * Library interface to io_uring
 */
struct io_uring_sq {
	unsigned *khead;
	unsigned *ktail;
	unsigned *kring_mask;
	unsigned *kring_entries;
	unsigned *kflags;
	unsigned *kdropped;
	unsigned *array;
	struct io_uring_sqe *sqes;

	unsigned sqe_head;
	unsigned sqe_tail;

	size_t ring_sz;
	void *ring_ptr;

	unsigned pad[4];
};

struct io_uring_cq {
	unsigned *khead;
	unsigned *ktail;
	unsigned *kring_mask;
	unsigned *kring_entries;
	unsigned *kflags;
	unsigned *koverflow;
	struct io_uring_cqe *cqes;

	size_t ring_sz;
	void *ring_ptr;

	unsigned pad[4];
};

struct io_uring {
	struct io_uring_sq sq;
	struct io_uring_cq cq;
	unsigned flags;
	int ring_fd;

	unsigned features;
	unsigned pad[3];
};

/*
 * Library interface
 */

/*
 * return an allocated io_uring_probe structure, or NULL if probe fails (for
 * example, if it is not available). The caller is responsible for freeing it
 */
struct io_uring_probe *io_uring_get_probe_ring(struct io_uring *ring);
/* same as io_uring_get_probe_ring, but takes care of ring init and teardown */
struct io_uring_probe *io_uring_get_probe(void);

/*
 * frees a probe allocated through io_uring_get_probe() or
 * io_uring_get_probe_ring()
 */
void io_uring_free_probe(struct io_uring_probe *probe);

static inline int io_uring_opcode_supported(const struct io_uring_probe *p, int op)
{
	if (op > p->last_op)
		return 0;
	return (p->ops[op].flags & IO_URING_OP_SUPPORTED) != 0;
}

int io_uring_queue_init_params(unsigned entries, struct io_uring *ring,
				struct io_uring_params *p);
int io_uring_queue_init(unsigned entries, struct io_uring *ring,
			unsigned flags);
int io_uring_queue_mmap(int fd, struct io_uring_params *p,
			struct io_uring *ring);
int io_uring_ring_dontfork(struct io_uring *ring);
void io_uring_queue_exit(struct io_uring *ring);
unsigned io_uring_peek_batch_cqe(struct io_uring *ring,
	struct io_uring_cqe **cqes, unsigned count);
int io_uring_wait_cqes(struct io_uring *ring, struct io_uring_cqe **cqe_ptr,
		       unsigned wait_nr, struct __kernel_timespec *ts,
		       sigset_t *sigmask);
int io_uring_wait_cqe_timeout(struct io_uring *ring,
			      struct io_uring_cqe **cqe_ptr,
			      struct __kernel_timespec *ts);
int io_uring_submit(struct io_uring *ring);
int io_uring_submit_and_wait(struct io_uring *ring, unsigned wait_nr);
int io_uring_submit_and_wait_timeout(struct io_uring *ring,
				     struct io_uring_cqe **cqe_ptr,
				     unsigned wait_nr,
				     struct __kernel_timespec *ts,
				     sigset_t *sigmask);
struct io_uring_sqe *io_uring_get_sqe(struct io_uring *ring);

int io_uring_register_buffers(struct io_uring *ring, const struct iovec *iovecs,
			      unsigned nr_iovecs);
int io_uring_register_buffers_tags(struct io_uring *ring,
				   const struct iovec *iovecs,
				   const __u64 *tags, unsigned nr);
int io_uring_register_buffers_update_tag(struct io_uring *ring,
					 unsigned off,
					 const struct iovec *iovecs,
					 const __u64 *tags, unsigned nr);
int io_uring_unregister_buffers(struct io_uring *ring);

int io_uring_register_files(struct io_uring *ring, const int *files,
			    unsigned nr_files);
int io_uring_register_files_tags(struct io_uring *ring, const int *files,
				 const __u64 *tags, unsigned nr);
int io_uring_register_files_update_tag(struct io_uring *ring, unsigned off,
				       const int *files, const __u64 *tags,
				       unsigned nr_files);

int io_uring_unregister_files(struct io_uring *ring);
int io_uring_register_files_update(struct io_uring *ring, unsigned off,
				   int *files, unsigned nr_files);
int io_uring_register_eventfd(struct io_uring *ring, int fd);
int io_uring_register_eventfd_async(struct io_uring *ring, int fd);
int io_uring_unregister_eventfd(struct io_uring *ring);
int io_uring_register_probe(struct io_uring *ring, struct io_uring_probe *p,
			    unsigned nr);
int io_uring_register_personality(struct io_uring *ring);
int io_uring_unregister_personality(struct io_uring *ring, int id);
int io_uring_register_restrictions(struct io_uring *ring,
				   struct io_uring_restriction *res,
				   unsigned int nr_res);
int io_uring_enable_rings(struct io_uring *ring);
int __io_uring_sqring_wait(struct io_uring *ring);
int io_uring_register_iowq_aff(struct io_uring *ring, size_t cpusz,
				const cpu_set_t *mask);
int io_uring_unregister_iowq_aff(struct io_uring *ring);
int io_uring_register_iowq_max_workers(struct io_uring *ring,
				       unsigned int *values);

/*
 * Helper for the peek/wait single cqe functions. Exported because of that,
 * but probably shouldn't be used directly in an application.
 */
int __io_uring_get_cqe(struct io_uring *ring,
			struct io_uring_cqe **cqe_ptr, unsigned submit,
			unsigned wait_nr, sigset_t *sigmask);

#define LIBURING_UDATA_TIMEOUT	((__u64) -1)

#define io_uring_for_each_cqe(ring, head, cqe)				\
	/*								\
	 * io_uring_smp_load_acquire() enforces the order of tail	\
	 * and CQE reads.						\
	 */								\
	for (head = *(ring)->cq.khead;					\
	     (cqe = (head != io_uring_smp_load_acquire((ring)->cq.ktail) ? \
		&(ring)->cq.cqes[head & (*(ring)->cq.kring_mask)] : NULL)); \
	     head++)							\

/*
 * Must be called after io_uring_for_each_cqe()
 */
static inline void io_uring_cq_advance(struct io_uring *ring,
				       unsigned nr)
{
	if (nr) {
		struct io_uring_cq *cq = &ring->cq;

		/*
		 * Ensure that the kernel only sees the new value of the head
		 * index after the CQEs have been read.
		 */
		io_uring_smp_store_release(cq->khead, *cq->khead + nr);
	}
}

/*
 * Must be called after io_uring_{peek,wait}_cqe() after the cqe has
 * been processed by the application.
 */
static inline void io_uring_cqe_seen(struct io_uring *ring,
				     struct io_uring_cqe *cqe)
{
	if (cqe)
		io_uring_cq_advance(ring, 1);
}

/*
 * Command prep helpers
 */

/*
 * Associate pointer @data with the sqe, for later retrieval from the cqe
 * at command completion time with io_uring_cqe_get_data().
 */
static inline void io_uring_sqe_set_data(struct io_uring_sqe *sqe, void *data)
{
	sqe->user_data = (unsigned long) data;
}

static inline void *io_uring_cqe_get_data(const struct io_uring_cqe *cqe)
{
	return (void *) (uintptr_t) cqe->user_data;
}

/*
 * Assign a 64-bit value to this sqe, which can get retrieved at completion
 * time with io_uring_cqe_get_data64. Just like the non-64 variants, except
 * these store a 64-bit type rather than a data pointer.
 */
static inline void io_uring_sqe_set_data64(struct io_uring_sqe *sqe,
					   __u64 data)
{
	sqe->user_data = data;
}

static inline __u64 io_uring_cqe_get_data64(const struct io_uring_cqe *cqe)
{
	return cqe->user_data;
}

/*
 * Tell the app the have the 64-bit variants of the get/set userdata
 */
#define LIBURING_HAVE_DATA64

static inline void io_uring_sqe_set_flags(struct io_uring_sqe *sqe,
					  unsigned flags)
{
	sqe->flags = (__u8) flags;
}

static inline void __io_uring_set_target_fixed_file(struct io_uring_sqe *sqe,
						    unsigned int file_index)
{
	/* 0 means no fixed files, indexes should be encoded as "index + 1" */
	sqe->file_index = file_index + 1;
}

static inline void io_uring_prep_rw(int op, struct io_uring_sqe *sqe, int fd,
				    const void *addr, unsigned len,
				    __u64 offset)
{
	sqe->opcode = (__u8) op;
	sqe->flags = 0;
	sqe->ioprio = 0;
	sqe->fd = fd;
	sqe->off = offset;
	sqe->addr = (unsigned long) addr;
	sqe->len = len;
	sqe->rw_flags = 0;
	sqe->buf_index = 0;
	sqe->personality = 0;
	sqe->file_index = 0;
	sqe->__pad2[0] = sqe->__pad2[1] = 0;
}

/**
 * @pre Either fd_in or fd_out must be a pipe.
 * @param off_in If fd_in refers to a pipe, off_in must be (int64_t) -1;
 *               If fd_in does not refer to a pipe and off_in is (int64_t) -1, then bytes are read
 *               from fd_in starting from the file offset and it is adjust appropriately;
 *               If fd_in does not refer to a pipe and off_in is not (int64_t) -1, then the
 *               starting offset of fd_in will be off_in.
 * @param off_out The description of off_in also applied to off_out.
 * @param splice_flags see man splice(2) for description of flags.
 *
 * This splice operation can be used to implement sendfile by splicing to an intermediate pipe
 * first, then splice to the final destination.
 * In fact, the implementation of sendfile in kernel uses splice internally.
 *
 * NOTE that even if fd_in or fd_out refers to a pipe, the splice operation can still failed with
 * EINVAL if one of the fd doesn't explicitly support splice operation, e.g. reading from terminal
 * is unsupported from kernel 5.7 to 5.11.
 * Check issue #291 for more information.
 */
static inline void io_uring_prep_splice(struct io_uring_sqe *sqe,
					int fd_in, int64_t off_in,
					int fd_out, int64_t off_out,
					unsigned int nbytes,
					unsigned int splice_flags)
{
	io_uring_prep_rw(IORING_OP_SPLICE, sqe, fd_out, NULL, nbytes,
				(__u64) off_out);
	sqe->splice_off_in = (__u64) off_in;
	sqe->splice_fd_in = fd_in;
	sqe->splice_flags = splice_flags;
}

static inline void io_uring_prep_tee(struct io_uring_sqe *sqe,
				     int fd_in, int fd_out,
				     unsigned int nbytes,
				     unsigned int splice_flags)
{
	io_uring_prep_rw(IORING_OP_TEE, sqe, fd_out, NULL, nbytes, 0);
	sqe->splice_off_in = 0;
	sqe->splice_fd_in = fd_in;
	sqe->splice_flags = splice_flags;
}

static inline void io_uring_prep_readv(struct io_uring_sqe *sqe, int fd,
				       const struct iovec *iovecs,
				       unsigned nr_vecs, __u64 offset)
{
	io_uring_prep_rw(IORING_OP_READV, sqe, fd, iovecs, nr_vecs, offset);
}

static inline void io_uring_prep_readv2(struct io_uring_sqe *sqe, int fd,
				       const struct iovec *iovecs,
				       unsigned nr_vecs, __u64 offset, int flags)
{
	io_uring_prep_readv(sqe, fd, iovecs, nr_vecs, offset);
	sqe->rw_flags = flags;
}

static inline void io_uring_prep_read_fixed(struct io_uring_sqe *sqe, int fd,
					    void *buf, unsigned nbytes,
					    __u64 offset, int buf_index)
{
	io_uring_prep_rw(IORING_OP_READ_FIXED, sqe, fd, buf, nbytes, offset);
	sqe->buf_index = (__u16) buf_index;
}

static inline void io_uring_prep_writev(struct io_uring_sqe *sqe, int fd,
					const struct iovec *iovecs,
					unsigned nr_vecs, __u64 offset)
{
	io_uring_prep_rw(IORING_OP_WRITEV, sqe, fd, iovecs, nr_vecs, offset);
}

static inline void io_uring_prep_writev2(struct io_uring_sqe *sqe, int fd,
				       const struct iovec *iovecs,
				       unsigned nr_vecs, __u64 offset, int flags)
{
	io_uring_prep_writev(sqe, fd, iovecs, nr_vecs, offset);
	sqe->rw_flags = flags;
}

static inline void io_uring_prep_write_fixed(struct io_uring_sqe *sqe, int fd,
					     const void *buf, unsigned nbytes,
					     __u64 offset, int buf_index)
{
	io_uring_prep_rw(IORING_OP_WRITE_FIXED, sqe, fd, buf, nbytes, offset);
	sqe->buf_index = (__u16) buf_index;
}

static inline void io_uring_prep_recvmsg(struct io_uring_sqe *sqe, int fd,
					 struct msghdr *msg, unsigned flags)
{
	io_uring_prep_rw(IORING_OP_RECVMSG, sqe, fd, msg, 1, 0);
	sqe->msg_flags = flags;
}

static inline void io_uring_prep_sendmsg(struct io_uring_sqe *sqe, int fd,
					 const struct msghdr *msg, unsigned flags)
{
	io_uring_prep_rw(IORING_OP_SENDMSG, sqe, fd, msg, 1, 0);
	sqe->msg_flags = flags;
}

static inline unsigned __io_uring_prep_poll_mask(unsigned poll_mask)
{
#if __BYTE_ORDER == __BIG_ENDIAN
	poll_mask = __swahw32(poll_mask);
#endif
	return poll_mask;
}

static inline void io_uring_prep_poll_add(struct io_uring_sqe *sqe, int fd,
					  unsigned poll_mask)
{
	io_uring_prep_rw(IORING_OP_POLL_ADD, sqe, fd, NULL, 0, 0);
	sqe->poll32_events = __io_uring_prep_poll_mask(poll_mask);
}

static inline void io_uring_prep_poll_multishot(struct io_uring_sqe *sqe,
						int fd, unsigned poll_mask)
{
	io_uring_prep_poll_add(sqe, fd, poll_mask);
	sqe->len = IORING_POLL_ADD_MULTI;
}

static inline void io_uring_prep_poll_remove(struct io_uring_sqe *sqe,
					     __u64 user_data)
{
	io_uring_prep_rw(IORING_OP_POLL_REMOVE, sqe, -1, NULL, 0, 0);
	sqe->addr = user_data;
}

static inline void io_uring_prep_poll_update(struct io_uring_sqe *sqe,
					     __u64 old_user_data,
					     __u64 new_user_data,
					     unsigned poll_mask, unsigned flags)
{
	io_uring_prep_rw(IORING_OP_POLL_REMOVE, sqe, -1, NULL, flags,
			 new_user_data);
	sqe->addr = old_user_data;
	sqe->poll32_events = __io_uring_prep_poll_mask(poll_mask);
}

static inline void io_uring_prep_fsync(struct io_uring_sqe *sqe, int fd,
				       unsigned fsync_flags)
{
	io_uring_prep_rw(IORING_OP_FSYNC, sqe, fd, NULL, 0, 0);
	sqe->fsync_flags = fsync_flags;
}

static inline void io_uring_prep_nop(struct io_uring_sqe *sqe)
{
	io_uring_prep_rw(IORING_OP_NOP, sqe, -1, NULL, 0, 0);
}

static inline void io_uring_prep_timeout(struct io_uring_sqe *sqe,
					 struct __kernel_timespec *ts,
					 unsigned count, unsigned flags)
{
	io_uring_prep_rw(IORING_OP_TIMEOUT, sqe, -1, ts, 1, count);
	sqe->timeout_flags = flags;
}

static inline void io_uring_prep_timeout_remove(struct io_uring_sqe *sqe,
						__u64 user_data, unsigned flags)
{
	io_uring_prep_rw(IORING_OP_TIMEOUT_REMOVE, sqe, -1, NULL, 0, 0);
	sqe->addr = user_data;
	sqe->timeout_flags = flags;
}

static inline void io_uring_prep_timeout_update(struct io_uring_sqe *sqe,
						struct __kernel_timespec *ts,
						__u64 user_data, unsigned flags)
{
	io_uring_prep_rw(IORING_OP_TIMEOUT_REMOVE, sqe, -1, NULL, 0,
				(uintptr_t) ts);
	sqe->addr = user_data;
	sqe->timeout_flags = flags | IORING_TIMEOUT_UPDATE;
}

static inline void io_uring_prep_accept(struct io_uring_sqe *sqe, int fd,
					struct sockaddr *addr,
					socklen_t *addrlen, int flags)
{
	io_uring_prep_rw(IORING_OP_ACCEPT, sqe, fd, addr, 0,
				(__u64) (unsigned long) addrlen);
	sqe->accept_flags = (__u32) flags;
}

/* accept directly into the fixed file table */
static inline void io_uring_prep_accept_direct(struct io_uring_sqe *sqe, int fd,
					       struct sockaddr *addr,
					       socklen_t *addrlen, int flags,
					       unsigned int file_index)
{
	io_uring_prep_accept(sqe, fd, addr, addrlen, flags);
	__io_uring_set_target_fixed_file(sqe, file_index);
}

static inline void io_uring_prep_cancel(struct io_uring_sqe *sqe,
					__u64 user_data, int flags)
{
	io_uring_prep_rw(IORING_OP_ASYNC_CANCEL, sqe, -1, NULL, 0, 0);
	sqe->addr = user_data;
	sqe->cancel_flags = (__u32) flags;
}

static inline void io_uring_prep_link_timeout(struct io_uring_sqe *sqe,
					      struct __kernel_timespec *ts,
					      unsigned flags)
{
	io_uring_prep_rw(IORING_OP_LINK_TIMEOUT, sqe, -1, ts, 1, 0);
	sqe->timeout_flags = flags;
}

static inline void io_uring_prep_connect(struct io_uring_sqe *sqe, int fd,
					 const struct sockaddr *addr,
					 socklen_t addrlen)
{
	io_uring_prep_rw(IORING_OP_CONNECT, sqe, fd, addr, 0, addrlen);
}

static inline void io_uring_prep_files_update(struct io_uring_sqe *sqe,
					      int *fds, unsigned nr_fds,
					      int offset)
{
	io_uring_prep_rw(IORING_OP_FILES_UPDATE, sqe, -1, fds, nr_fds,
				(__u64) offset);
}

static inline void io_uring_prep_fallocate(struct io_uring_sqe *sqe, int fd,
					   int mode, off_t offset, off_t len)
{

	io_uring_prep_rw(IORING_OP_FALLOCATE, sqe, fd,
			(const uintptr_t *) (unsigned long) len,
			(unsigned int) mode, (__u64) offset);
}

static inline void io_uring_prep_openat(struct io_uring_sqe *sqe, int dfd,
					const char *path, int flags, mode_t mode)
{
	io_uring_prep_rw(IORING_OP_OPENAT, sqe, dfd, path, mode, 0);
	sqe->open_flags = (__u32) flags;
}

/* open directly into the fixed file table */
static inline void io_uring_prep_openat_direct(struct io_uring_sqe *sqe,
					       int dfd, const char *path,
					       int flags, mode_t mode,
					       unsigned file_index)
{
	io_uring_prep_openat(sqe, dfd, path, flags, mode);
	__io_uring_set_target_fixed_file(sqe, file_index);
}


static inline void io_uring_prep_close(struct io_uring_sqe *sqe, int fd)
{
	io_uring_prep_rw(IORING_OP_CLOSE, sqe, fd, NULL, 0, 0);
}

static inline void io_uring_prep_close_direct(struct io_uring_sqe *sqe,
					      unsigned file_index)
{
	io_uring_prep_close(sqe, 0);
	__io_uring_set_target_fixed_file(sqe, file_index);
}

static inline void io_uring_prep_read(struct io_uring_sqe *sqe, int fd,
				      void *buf, unsigned nbytes, __u64 offset)
{
	io_uring_prep_rw(IORING_OP_READ, sqe, fd, buf, nbytes, offset);
}

static inline void io_uring_prep_write(struct io_uring_sqe *sqe, int fd,
				       const void *buf, unsigned nbytes, __u64 offset)
{
	io_uring_prep_rw(IORING_OP_WRITE, sqe, fd, buf, nbytes, offset);
}

struct statx;
static inline void io_uring_prep_statx(struct io_uring_sqe *sqe, int dfd,
				const char *path, int flags, unsigned mask,
				struct statx *statxbuf)
{
	io_uring_prep_rw(IORING_OP_STATX, sqe, dfd, path, mask,
				(__u64) (unsigned long) statxbuf);
	sqe->statx_flags = (__u32) flags;
}

static inline void io_uring_prep_fadvise(struct io_uring_sqe *sqe, int fd,
					 __u64 offset, off_t len, int advice)
{
	io_uring_prep_rw(IORING_OP_FADVISE, sqe, fd, NULL, (__u32) len, offset);
	sqe->fadvise_advice = (__u32) advice;
}

static inline void io_uring_prep_madvise(struct io_uring_sqe *sqe, void *addr,
					 off_t length, int advice)
{
	io_uring_prep_rw(IORING_OP_MADVISE, sqe, -1, addr, (__u32) length, 0);
	sqe->fadvise_advice = (__u32) advice;
}

static inline void io_uring_prep_send(struct io_uring_sqe *sqe, int sockfd,
				      const void *buf, size_t len, int flags)
{
	io_uring_prep_rw(IORING_OP_SEND, sqe, sockfd, buf, (__u32) len, 0);
	sqe->msg_flags = (__u32) flags;
}

static inline void io_uring_prep_recv(struct io_uring_sqe *sqe, int sockfd,
				      void *buf, size_t len, int flags)
{
	io_uring_prep_rw(IORING_OP_RECV, sqe, sockfd, buf, (__u32) len, 0);
	sqe->msg_flags = (__u32) flags;
}

static inline void io_uring_prep_openat2(struct io_uring_sqe *sqe, int dfd,
					const char *path, struct open_how *how)
{
	io_uring_prep_rw(IORING_OP_OPENAT2, sqe, dfd, path, sizeof(*how),
				(uint64_t) (uintptr_t) how);
}

/* open directly into the fixed file table */
static inline void io_uring_prep_openat2_direct(struct io_uring_sqe *sqe,
						int dfd, const char *path,
						struct open_how *how,
						unsigned file_index)
{
	io_uring_prep_openat2(sqe, dfd, path, how);
	__io_uring_set_target_fixed_file(sqe, file_index);
}

struct epoll_event;
static inline void io_uring_prep_epoll_ctl(struct io_uring_sqe *sqe, int epfd,
					   int fd, int op,
					   struct epoll_event *ev)
{
	io_uring_prep_rw(IORING_OP_EPOLL_CTL, sqe, epfd, ev,
				(__u32) op, (__u32) fd);
}

static inline void io_uring_prep_provide_buffers(struct io_uring_sqe *sqe,
						 void *addr, int len, int nr,
						 int bgid, int bid)
{
	io_uring_prep_rw(IORING_OP_PROVIDE_BUFFERS, sqe, nr, addr, (__u32) len,
				(__u64) bid);
	sqe->buf_group = (__u16) bgid;
}

static inline void io_uring_prep_remove_buffers(struct io_uring_sqe *sqe,
						int nr, int bgid)
{
	io_uring_prep_rw(IORING_OP_REMOVE_BUFFERS, sqe, nr, NULL, 0, 0);
	sqe->buf_group = (__u16) bgid;
}

static inline void io_uring_prep_shutdown(struct io_uring_sqe *sqe, int fd,
					  int how)
{
	io_uring_prep_rw(IORING_OP_SHUTDOWN, sqe, fd, NULL, (__u32) how, 0);
}

static inline void io_uring_prep_unlinkat(struct io_uring_sqe *sqe, int dfd,
					  const char *path, int flags)
{
	io_uring_prep_rw(IORING_OP_UNLINKAT, sqe, dfd, path, 0, 0);
	sqe->unlink_flags = (__u32) flags;
}

static inline void io_uring_prep_renameat(struct io_uring_sqe *sqe, int olddfd,
					  const char *oldpath, int newdfd,
					  const char *newpath, int flags)
{
	io_uring_prep_rw(IORING_OP_RENAMEAT, sqe, olddfd, oldpath, (__u32) newdfd,
				(uint64_t) (uintptr_t) newpath);
	sqe->rename_flags = (__u32) flags;
}

static inline void io_uring_prep_sync_file_range(struct io_uring_sqe *sqe,
						 int fd, unsigned len,
						 __u64 offset, int flags)
{
	io_uring_prep_rw(IORING_OP_SYNC_FILE_RANGE, sqe, fd, NULL, len, offset);
	sqe->sync_range_flags = (__u32) flags;
}

static inline void io_uring_prep_mkdirat(struct io_uring_sqe *sqe, int dfd,
					const char *path, mode_t mode)
{
	io_uring_prep_rw(IORING_OP_MKDIRAT, sqe, dfd, path, mode, 0);
}

static inline void io_uring_prep_symlinkat(struct io_uring_sqe *sqe,
					const char *target, int newdirfd, const char *linkpath)
{
	io_uring_prep_rw(IORING_OP_SYMLINKAT, sqe, newdirfd, target, 0,
				(uint64_t) (uintptr_t) linkpath);
}

static inline void io_uring_prep_linkat(struct io_uring_sqe *sqe, int olddfd,
					const char *oldpath, int newdfd,
					const char *newpath, int flags)
{
	io_uring_prep_rw(IORING_OP_LINKAT, sqe, olddfd, oldpath, (__u32) newdfd,
				(uint64_t) (uintptr_t) newpath);
	sqe->hardlink_flags = (__u32) flags;
}

/*
 * Returns number of unconsumed (if SQPOLL) or unsubmitted entries exist in
 * the SQ ring
 */
static inline unsigned io_uring_sq_ready(const struct io_uring *ring)
{
	/*
	 * Without a barrier, we could miss an update and think the SQ wasn't ready.
	 * We don't need the load acquire for non-SQPOLL since then we drive updates.
	 */
	if (ring->flags & IORING_SETUP_SQPOLL)
		return ring->sq.sqe_tail - io_uring_smp_load_acquire(ring->sq.khead);

	/* always use real head, to avoid losing sync for short submit */
	return ring->sq.sqe_tail - *ring->sq.khead;
}

/*
 * Returns how much space is left in the SQ ring.
 */
static inline unsigned io_uring_sq_space_left(const struct io_uring *ring)
{
	return *ring->sq.kring_entries - io_uring_sq_ready(ring);
}

/*
 * Only applicable when using SQPOLL - allows the caller to wait for space
 * to free up in the SQ ring, which happens when the kernel side thread has
 * consumed one or more entries. If the SQ ring is currently non-full, no
 * action is taken. Note: may return -EINVAL if the kernel doesn't support
 * this feature.
 */
static inline int io_uring_sqring_wait(struct io_uring *ring)
{
	if (!(ring->flags & IORING_SETUP_SQPOLL))
		return 0;
	if (io_uring_sq_space_left(ring))
		return 0;

	return __io_uring_sqring_wait(ring);
}

/*
 * Returns how many unconsumed entries are ready in the CQ ring
 */
static inline unsigned io_uring_cq_ready(const struct io_uring *ring)
{
	return io_uring_smp_load_acquire(ring->cq.ktail) - *ring->cq.khead;
}

/*
 * Returns true if the eventfd notification is currently enabled
 */
static inline bool io_uring_cq_eventfd_enabled(const struct io_uring *ring)
{
	if (!ring->cq.kflags)
		return true;

	return !(*ring->cq.kflags & IORING_CQ_EVENTFD_DISABLED);
}

/*
 * Toggle eventfd notification on or off, if an eventfd is registered with
 * the ring.
 */
static inline int io_uring_cq_eventfd_toggle(struct io_uring *ring,
					     bool enabled)
{
	uint32_t flags;

	if (!!enabled == io_uring_cq_eventfd_enabled(ring))
		return 0;

	if (!ring->cq.kflags)
		return -EOPNOTSUPP;

	flags = *ring->cq.kflags;

	if (enabled)
		flags &= ~IORING_CQ_EVENTFD_DISABLED;
	else
		flags |= IORING_CQ_EVENTFD_DISABLED;

	IO_URING_WRITE_ONCE(*ring->cq.kflags, flags);

	return 0;
}

/*
 * Return an IO completion, waiting for 'wait_nr' completions if one isn't
 * readily available. Returns 0 with cqe_ptr filled in on success, -errno on
 * failure.
 */
static inline int io_uring_wait_cqe_nr(struct io_uring *ring,
				      struct io_uring_cqe **cqe_ptr,
				      unsigned wait_nr)
{
	return __io_uring_get_cqe(ring, cqe_ptr, 0, wait_nr, NULL);
}

/*
 * Return an IO completion, if one is readily available. Returns 0 with
 * cqe_ptr filled in on success, -errno on failure.
 */
static inline int io_uring_peek_cqe(struct io_uring *ring,
				    struct io_uring_cqe **cqe_ptr)
{
	return io_uring_wait_cqe_nr(ring, cqe_ptr, 0);
}

/*
 * Return an IO completion, waiting for it if necessary. Returns 0 with
 * cqe_ptr filled in on success, -errno on failure.
 */
static inline int io_uring_wait_cqe(struct io_uring *ring,
				    struct io_uring_cqe **cqe_ptr)
{
	return io_uring_wait_cqe_nr(ring, cqe_ptr, 1);
}

ssize_t io_uring_mlock_size(unsigned entries, unsigned flags);
ssize_t io_uring_mlock_size_params(unsigned entries, struct io_uring_params *p);

#ifdef __cplusplus
}
#endif

#endif
