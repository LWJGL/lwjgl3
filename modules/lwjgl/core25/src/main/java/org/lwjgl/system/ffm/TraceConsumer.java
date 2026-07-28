/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import org.jspecify.annotations.*;

import java.lang.reflect.*;
import java.util.*;

/** A consumer of traced method calls. */
public interface TraceConsumer {

    void accept(Method method, @Nullable Object returnValue, Object... args);

    /**
     * Returns a composed {@code TraceConsumer} that performs, in sequence, this operation followed by the {@code after} operation. If performing either
     * operation throws an exception, it is relayed to the caller of the composed operation.  If performing this operation throws an exception, the
     * {@code after} operation will not be performed.
     *
     * @param after the operation to perform after this operation
     *
     * @return a composed {@code TraceConsumer} that performs in sequence this operation followed by the {@code after} operation
     *
     * @throws NullPointerException if {@code after} is null
     */
    default TraceConsumer andThen(TraceConsumer after) {
        Objects.requireNonNull(after);
        return (method, returnValue, args) -> {
            accept(method, returnValue, args);
            after.accept(method, returnValue, args);
        };
    }

}
