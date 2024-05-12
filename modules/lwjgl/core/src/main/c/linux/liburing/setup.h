/* SPDX-License-Identifier: MIT */
#ifndef LIBURING_SETUP_H
#define LIBURING_SETUP_H

int __io_uring_queue_init_params(unsigned entries, struct io_uring *ring,
				 struct io_uring_params *p, void *buf,
				 size_t buf_size);

#endif
