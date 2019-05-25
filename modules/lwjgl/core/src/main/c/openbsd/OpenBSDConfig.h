/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */

#include <stddef.h>
#include <inttypes.h>

#define DISABLE_WARNINGS()
#define ENABLE_WARNINGS()

// JNIEXPORT_CRITICAL & CRITICAL are used as a workaround for JDK-8167409 on applicable functions.
#define JNIEXPORT_CRITICAL static
#define CRITICAL(function) _JavaCritical_##function
