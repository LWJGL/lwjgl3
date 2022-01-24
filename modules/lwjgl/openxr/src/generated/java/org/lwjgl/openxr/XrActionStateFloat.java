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
 * Floating point action state.
 * 
 * <h5>Description</h5>
 * 
 * <p>When multiple input sources are bound to this action, the {@code currentState} follows <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#multiple_inputs">the previously defined rule to resolve ambiguity</a>.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_ACTION_STATE_FLOAT TYPE_ACTION_STATE_FLOAT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrGetActionStateFloat GetActionStateFloat}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrActionStateFloat {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     float {@link #currentState};
 *     XrBool32 {@link #changedSinceLastSync};
 *     XrTime {@link #lastChangeTime};
 *     XrBool32 {@link #isActive};
 * }</code></pre>
 */
public class XrActionStateFloat extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        CURRENTSTATE,
        CHANGEDSINCELASTSYNC,
        LASTCHANGETIME,
        ISACTIVE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        CURRENTSTATE = layout.offsetof(2);
        CHANGEDSINCELASTSYNC = layout.offsetof(3);
        LASTCHANGETIME = layout.offsetof(4);
        ISACTIVE = layout.offsetof(5);
    }

    /**
     * Creates a {@code XrActionStateFloat} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrActionStateFloat(ByteBuffer container) {
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
    /** the current state of the Action. */
    public float currentState() { return ncurrentState(address()); }
    /** {@link XR10#XR_TRUE TRUE} if the value of {@code currentState} is different than it was before the most recent call to {@link XR10#xrSyncActions SyncActions}. */
    @NativeType("XrBool32")
    public boolean changedSinceLastSync() { return nchangedSinceLastSync(address()) != 0; }
    /** the {@code XrTime} in nanoseconds since this action’s value last changed. */
    @NativeType("XrTime")
    public long lastChangeTime() { return nlastChangeTime(address()); }
    /** {@link XR10#XR_TRUE TRUE} if and only if there exists an input source that is contributing to the current state of this action. */
    @NativeType("XrBool32")
    public boolean isActive() { return nisActive(address()) != 0; }

    /** Sets the specified value to the {@link #type} field. */
    public XrActionStateFloat type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_ACTION_STATE_FLOAT TYPE_ACTION_STATE_FLOAT} value to the {@link #type} field. */
    public XrActionStateFloat type$Default() { return type(XR10.XR_TYPE_ACTION_STATE_FLOAT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrActionStateFloat next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #currentState} field. */
    public XrActionStateFloat currentState(float value) { ncurrentState(address(), value); return this; }
    /** Sets the specified value to the {@link #changedSinceLastSync} field. */
    public XrActionStateFloat changedSinceLastSync(@NativeType("XrBool32") boolean value) { nchangedSinceLastSync(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #lastChangeTime} field. */
    public XrActionStateFloat lastChangeTime(@NativeType("XrTime") long value) { nlastChangeTime(address(), value); return this; }
    /** Sets the specified value to the {@link #isActive} field. */
    public XrActionStateFloat isActive(@NativeType("XrBool32") boolean value) { nisActive(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrActionStateFloat set(
        int type,
        long next,
        float currentState,
        boolean changedSinceLastSync,
        long lastChangeTime,
        boolean isActive
    ) {
        type(type);
        next(next);
        currentState(currentState);
        changedSinceLastSync(changedSinceLastSync);
        lastChangeTime(lastChangeTime);
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
    public XrActionStateFloat set(XrActionStateFloat src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrActionStateFloat} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrActionStateFloat malloc() {
        return wrap(XrActionStateFloat.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrActionStateFloat} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrActionStateFloat calloc() {
        return wrap(XrActionStateFloat.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrActionStateFloat} instance allocated with {@link BufferUtils}. */
    public static XrActionStateFloat create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrActionStateFloat.class, memAddress(container), container);
    }

    /** Returns a new {@code XrActionStateFloat} instance for the specified memory address. */
    public static XrActionStateFloat create(long address) {
        return wrap(XrActionStateFloat.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrActionStateFloat createSafe(long address) {
        return address == NULL ? null : wrap(XrActionStateFloat.class, address);
    }

    /**
     * Returns a new {@link XrActionStateFloat.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionStateFloat.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrActionStateFloat.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionStateFloat.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActionStateFloat.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrActionStateFloat.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrActionStateFloat.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrActionStateFloat.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrActionStateFloat.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrActionStateFloat} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActionStateFloat malloc(MemoryStack stack) {
        return wrap(XrActionStateFloat.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrActionStateFloat} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActionStateFloat calloc(MemoryStack stack) {
        return wrap(XrActionStateFloat.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrActionStateFloat.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActionStateFloat.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActionStateFloat.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActionStateFloat.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrActionStateFloat.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrActionStateFloat.NEXT); }
    /** Unsafe version of {@link #currentState}. */
    public static float ncurrentState(long struct) { return UNSAFE.getFloat(null, struct + XrActionStateFloat.CURRENTSTATE); }
    /** Unsafe version of {@link #changedSinceLastSync}. */
    public static int nchangedSinceLastSync(long struct) { return UNSAFE.getInt(null, struct + XrActionStateFloat.CHANGEDSINCELASTSYNC); }
    /** Unsafe version of {@link #lastChangeTime}. */
    public static long nlastChangeTime(long struct) { return UNSAFE.getLong(null, struct + XrActionStateFloat.LASTCHANGETIME); }
    /** Unsafe version of {@link #isActive}. */
    public static int nisActive(long struct) { return UNSAFE.getInt(null, struct + XrActionStateFloat.ISACTIVE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrActionStateFloat.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrActionStateFloat.NEXT, value); }
    /** Unsafe version of {@link #currentState(float) currentState}. */
    public static void ncurrentState(long struct, float value) { UNSAFE.putFloat(null, struct + XrActionStateFloat.CURRENTSTATE, value); }
    /** Unsafe version of {@link #changedSinceLastSync(boolean) changedSinceLastSync}. */
    public static void nchangedSinceLastSync(long struct, int value) { UNSAFE.putInt(null, struct + XrActionStateFloat.CHANGEDSINCELASTSYNC, value); }
    /** Unsafe version of {@link #lastChangeTime(long) lastChangeTime}. */
    public static void nlastChangeTime(long struct, long value) { UNSAFE.putLong(null, struct + XrActionStateFloat.LASTCHANGETIME, value); }
    /** Unsafe version of {@link #isActive(boolean) isActive}. */
    public static void nisActive(long struct, int value) { UNSAFE.putInt(null, struct + XrActionStateFloat.ISACTIVE, value); }

    // -----------------------------------

    /** An array of {@link XrActionStateFloat} structs. */
    public static class Buffer extends StructBuffer<XrActionStateFloat, Buffer> implements NativeResource {

        private static final XrActionStateFloat ELEMENT_FACTORY = XrActionStateFloat.create(-1L);

        /**
         * Creates a new {@code XrActionStateFloat.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrActionStateFloat#SIZEOF}, and its mark will be undefined.
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
        protected XrActionStateFloat getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrActionStateFloat#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrActionStateFloat.ntype(address()); }
        /** @return the value of the {@link XrActionStateFloat#next} field. */
        @NativeType("void *")
        public long next() { return XrActionStateFloat.nnext(address()); }
        /** @return the value of the {@link XrActionStateFloat#currentState} field. */
        public float currentState() { return XrActionStateFloat.ncurrentState(address()); }
        /** @return the value of the {@link XrActionStateFloat#changedSinceLastSync} field. */
        @NativeType("XrBool32")
        public boolean changedSinceLastSync() { return XrActionStateFloat.nchangedSinceLastSync(address()) != 0; }
        /** @return the value of the {@link XrActionStateFloat#lastChangeTime} field. */
        @NativeType("XrTime")
        public long lastChangeTime() { return XrActionStateFloat.nlastChangeTime(address()); }
        /** @return the value of the {@link XrActionStateFloat#isActive} field. */
        @NativeType("XrBool32")
        public boolean isActive() { return XrActionStateFloat.nisActive(address()) != 0; }

        /** Sets the specified value to the {@link XrActionStateFloat#type} field. */
        public XrActionStateFloat.Buffer type(@NativeType("XrStructureType") int value) { XrActionStateFloat.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_ACTION_STATE_FLOAT TYPE_ACTION_STATE_FLOAT} value to the {@link XrActionStateFloat#type} field. */
        public XrActionStateFloat.Buffer type$Default() { return type(XR10.XR_TYPE_ACTION_STATE_FLOAT); }
        /** Sets the specified value to the {@link XrActionStateFloat#next} field. */
        public XrActionStateFloat.Buffer next(@NativeType("void *") long value) { XrActionStateFloat.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrActionStateFloat#currentState} field. */
        public XrActionStateFloat.Buffer currentState(float value) { XrActionStateFloat.ncurrentState(address(), value); return this; }
        /** Sets the specified value to the {@link XrActionStateFloat#changedSinceLastSync} field. */
        public XrActionStateFloat.Buffer changedSinceLastSync(@NativeType("XrBool32") boolean value) { XrActionStateFloat.nchangedSinceLastSync(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XrActionStateFloat#lastChangeTime} field. */
        public XrActionStateFloat.Buffer lastChangeTime(@NativeType("XrTime") long value) { XrActionStateFloat.nlastChangeTime(address(), value); return this; }
        /** Sets the specified value to the {@link XrActionStateFloat#isActive} field. */
        public XrActionStateFloat.Buffer isActive(@NativeType("XrBool32") boolean value) { XrActionStateFloat.nisActive(address(), value ? 1 : 0); return this; }

    }

}