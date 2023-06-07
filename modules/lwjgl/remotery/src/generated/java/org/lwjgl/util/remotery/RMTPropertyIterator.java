/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Struct to hold iterator info.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct rmtPropertyIterator {
 *     {@link RMTProperty rmtProperty} * property;
 *     {@link RMTProperty rmtProperty} * initial;
 * }</code></pre>
 */
@NativeType("struct rmtPropertyIterator")
public class RMTPropertyIterator extends Struct<RMTPropertyIterator> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PROPERTY,
        INITIAL;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PROPERTY = layout.offsetof(0);
        INITIAL = layout.offsetof(1);
    }

    protected RMTPropertyIterator(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected RMTPropertyIterator create(long address, @Nullable ByteBuffer container) {
        return new RMTPropertyIterator(address, container);
    }

    /**
     * Creates a {@code RMTPropertyIterator} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RMTPropertyIterator(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link RMTProperty} view of the struct pointed to by the {@code property} field. */
    @NativeType("rmtProperty *")
    public RMTProperty property() { return nproperty(address()); }

    // -----------------------------------

    /** Returns a new {@code RMTPropertyIterator} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static RMTPropertyIterator malloc() {
        return new RMTPropertyIterator(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code RMTPropertyIterator} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static RMTPropertyIterator calloc() {
        return new RMTPropertyIterator(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code RMTPropertyIterator} instance allocated with {@link BufferUtils}. */
    public static RMTPropertyIterator create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new RMTPropertyIterator(memAddress(container), container);
    }

    /** Returns a new {@code RMTPropertyIterator} instance for the specified memory address. */
    public static RMTPropertyIterator create(long address) {
        return new RMTPropertyIterator(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static RMTPropertyIterator createSafe(long address) {
        return address == NULL ? null : new RMTPropertyIterator(address, null);
    }

    /**
     * Returns a new {@code RMTPropertyIterator} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static RMTPropertyIterator malloc(MemoryStack stack) {
        return new RMTPropertyIterator(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code RMTPropertyIterator} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static RMTPropertyIterator calloc(MemoryStack stack) {
        return new RMTPropertyIterator(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    // -----------------------------------

    /** Unsafe version of {@link #property}. */
    public static RMTProperty nproperty(long struct) { return RMTProperty.create(memGetAddress(struct + RMTPropertyIterator.PROPERTY)); }
    public static RMTProperty ninitial(long struct) { return RMTProperty.create(memGetAddress(struct + RMTPropertyIterator.INITIAL)); }

}