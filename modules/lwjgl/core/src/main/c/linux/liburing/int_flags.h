/* SPDX-License-Identifier: MIT */
#ifndef LIBURING_INT_FLAGS
#define LIBURING_INT_FLAGS

#define INT_FLAGS_MASK		(IORING_ENTER_REGISTERED_RING)

enum {
	INT_FLAG_REG_RING	= IORING_ENTER_REGISTERED_RING,
	INT_FLAG_REG_REG_RING	= 1,
	INT_FLAG_APP_MEM	= 2,
};

static inline int ring_enter_flags(struct io_uring *ring)
{
	return ring->int_flags & INT_FLAGS_MASK;
}

#endif
