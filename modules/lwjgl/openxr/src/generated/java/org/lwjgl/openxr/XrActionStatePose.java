/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Pose action metadata.
 * 
 * <h5>Description</h5>
 * 
 * <p>A pose action <b>must</b> not be bound to multiple input sources, according to <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#multiple_inputs">the previously defined rule</a>.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_ACTION_STATE_POSE TYPE_ACTION_STATE_POSE}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrGetActionStatePose GetActionStatePose}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrActionStatePose {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrBool32 {@link #isActive};
 * }</code></pre>
 */
public class XrActionStatePose extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ISACTIVE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ISACTIVE = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrActionStatePose} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrActionStatePose(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** {@link XR10#XR_TRUE TRUE} if and only if there exists an input source that is being tracked by this pose action. */
    @NativeType("XrBool32")
    public boolean isActive() { return nisActive(address()) != 0; }

    /** Sets the specified value to the {@link #type} field. */
    public XrActionStatePose type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_ACTION_STATE_POSE TYPE_ACTION_STATE_POSE} value to the {@link #type} field. */
    public XrActionStatePose type$Default() { return type(XR10.XR_TYPE_ACTION_STATE_POSE); }
    /** Sets the specified value to the {@link #next} field. */
    public XrActionStatePose next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #isActive} field. */
    public XrActionStatePose isActive(@NativeType("XrBool32") boolean value) { nisActive(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrActionStatePose set(
        int type,
        long next,
        boolean isActive
    ) {
        type(type);
        next(next);
        isActive(isActive);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrActionStatePose set(XrActionStatePose src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrActionStatePose} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrActionStatePose malloc() {
        return wrap(XrActionStatePose.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrActionStatePose} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrActionStatePose calloc() {
        return wrap(XrActionStatePose.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrActionStatePose} instance allocated with {@link BufferUtils}. */
    public static XrActionStatePose create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrActionStatePose.class, memAddress(container), container);
    }

    /** Returns a new {@code XrActionStatePose} instance for the specified memory address. */
    public static XrActionStatePose create(long address) {
        return wrap(XrActionStatePose.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrActionStatePose createSafe(long address) {
        return address == NULL ? null : wrap(XrActionStatePose.class, address);
    }

    /**
     * Returns a new {@link XrActionStatePose.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionStatePose.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrActionStatePose.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionStatePose.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActionStatePose.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionStatePose.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrActionStatePose.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrActionStatePose.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrActionStatePose.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrActionStatePose} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActionStatePose malloc(MemoryStack stack) {
        return wrap(XrActionStatePose.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrActionStatePose} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActionStatePose calloc(MemoryStack stack) {
        return wrap(XrActionStatePose.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrActionStatePose.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActionStatePose.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActionStatePose.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActionStatePose.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrActionStatePose.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrActionStatePose.NEXT); }
    /** Unsafe version of {@link #isActive}. */
    public static int nisActive(long struct) { return UNSAFE.getInt(null, struct + XrActionStatePose.ISACTIVE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrActionStatePose.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrActionStatePose.NEXT, value); }
    /** Unsafe version of {@link #isActive(boolean) isActive}. */
    public static void nisActive(long struct, int value) { UNSAFE.putInt(null, struct + XrActionStatePose.ISACTIVE, value); }

    // -----------------------------------

    /** An array of {@link XrActionStatePose} structs. */
    public static class Buffer extends StructBuffer<XrActionStatePose, Buffer> implements NativeResource {

        private static final XrActionStatePose ELEMENT_FACTORY = XrActionStatePose.create(-1L);

        /**
         * Creates a new {@code XrActionStatePose.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrActionStatePose#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected XrActionStatePose getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrActionStatePose#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrActionStatePose.ntype(address()); }
        /** @return the value of the {@link XrActionStatePose#next} field. */
        @NativeType("void *")
        public long next() { return XrActionStatePose.nnext(address()); }
        /** @return the value of the {@link XrActionStatePose#isActive} field. */
        @NativeType("XrBool32")
        public boolean isActive() { return XrActionStatePose.nisActive(address()) != 0; }

        /** Sets the specified value to the {@link XrActionStatePose#type} field. */
        public XrActionStatePose.Buffer type(@NativeType("XrStructureType") int value) { XrActionStatePose.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_ACTION_STATE_POSE TYPE_ACTION_STATE_POSE} value to the {@link XrActionStatePose#type} field. */
        public XrActionStatePose.Buffer type$Default() { return type(XR10.XR_TYPE_ACTION_STATE_POSE); }
        /** Sets the specified value to the {@link XrActionStatePose#next} field. */
        public XrActionStatePose.Buffer next(@NativeType("void *") long value) { XrActionStatePose.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrActionStatePose#isActive} field. */
        public XrActionStatePose.Buffer isActive(@NativeType("XrBool32") boolean value) { XrActionStatePose.nisActive(address(), value ? 1 : 0); return this; }

    }

}