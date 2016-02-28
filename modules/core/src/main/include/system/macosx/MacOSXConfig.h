/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */

#include <stddef.h>
#include <stdint.h>

#define DISABLE_WARNINGS() \
	_Pragma("GCC diagnostic push") \
	_Pragma("GCC diagnostic ignored \"-Wall\"") \
	_Pragma("GCC diagnostic ignored \"-Wextra\"")

#define ENABLE_WARNINGS() \
	_Pragma("GCC diagnostic pop")
