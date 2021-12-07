/* SPDX-License-Identifier: MIT */
#define _DEFAULT_SOURCE

/*
 * Functions in this file require libc, only build them when we use libc.
 *
 * Note:
 * liburing's tests still need these functions.
 */
#if defined(CONFIG_NOLIBC) && !defined(LIBURING_BUILD_TEST)
# error "This file should only be compiled for libc build, or for liburing tests"
#endif

/*
 * Will go away once libc support is there
 */
#include <unistd.h>
#include <sys/syscall.h>
#include <sys/uio.h>
#include "liburing/compat.h"
#include "liburing/io_uring.h"
#include "syscall.h"

int __sys_io_uring_register(int fd, unsigned opcode, const void *arg,
			    unsigned nr_args)
{
	return syscall(__NR_io_uring_register, fd, opcode, arg, nr_args);
}

int __sys_io_uring_setup(unsigned entries, struct io_uring_params *p)
{
	return syscall(__NR_io_uring_setup, entries, p);
}

int __sys_io_uring_enter2(int fd, unsigned to_submit, unsigned min_complete,
			  unsigned flags, sigset_t *sig, int sz)
{
	return syscall(__NR_io_uring_enter, fd, to_submit, min_complete, flags,
		       sig, sz);
}

int __sys_io_uring_enter(int fd, unsigned to_submit, unsigned min_complete,
			 unsigned flags, sigset_t *sig)
{
	return __sys_io_uring_enter2(fd, to_submit, min_complete, flags, sig,
				     _NSIG / 8);
}
