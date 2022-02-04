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
 * Event indicating instance loss will occur.
 * 
 * <h5>Description</h5>
 * 
 * <p>After the application has destroyed all of its instances and their children and waited past the specified time, it may then re-try {@link XR10#xrCreateInstance CreateInstance} in a loop waiting for whatever maintenance the runtime is performing to complete. The runtime will return {@link XR10#XR_ERROR_RUNTIME_UNAVAILABLE ERROR_RUNTIME_UNAVAILABLE} from {@link XR10#xrCreateInstance CreateInstance} as long as it is unable to create the instance. Once the runtime has returned and is able to continue, it <b>must</b> resume returning {@link XR10#XR_SUCCESS SUCCESS} from {@link XR10#xrCreateInstance CreateInstance} if valid data is passed in.</p>
 * 
 * <h5>Member Descriptions</h5>
 * 
 * <ul>
 * <li>{@code type} is the {@code XrStructureType} of this structure.</li>
 * <li>{@code next} is {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR.</li>
 * <li>{@code lossTime} is the absolute time at which the indicated instance will be considered lost and become unusable.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_EVENT_DATA_INSTANCE_LOSS_PENDING TYPE_EVENT_DATA_INSTANCE_LOSS_PENDING}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrEventDataBaseHeader}, {@link XR10#xrPollEvent PollEvent}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEventDataInstanceLossPending {
 *     XrStructureType type;
 *     void const * next;
 *     XrTime lossTime;
 * }</code></pre>
 */
public class XrEventDataInstanceLossPending extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LOSSTIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LOSSTIME = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrEventDataInstanceLossPending} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataInstanceLossPending(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code lossTime} field. */
    @NativeType("XrTime")
    public long lossTime() { return nlossTime(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataInstanceLossPending type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_EVENT_DATA_INSTANCE_LOSS_PENDING TYPE_EVENT_DATA_INSTANCE_LOSS_PENDING} value to the {@code type} field. */
    public XrEventDataInstanceLossPending type$Default() { return type(XR10.XR_TYPE_EVENT_DATA_INSTANCE_LOSS_PENDING); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataInstanceLossPending next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code lossTime} field. */
    public XrEventDataInstanceLossPending lossTime(@NativeType("XrTime") long value) { nlossTime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataInstanceLossPending set(
        int type,
        long next,
        long lossTime
    ) {
        type(type);
        next(next);
        lossTime(lossTime);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEventDataInstanceLossPending set(XrEventDataInstanceLossPending src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataInstanceLossPending} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataInstanceLossPending malloc() {
        return wrap(XrEventDataInstanceLossPending.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrEventDataInstanceLossPending} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataInstanceLossPending calloc() {
        return wrap(XrEventDataInstanceLossPending.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrEventDataInstanceLossPending} instance allocated with {@link BufferUtils}. */
    public static XrEventDataInstanceLossPending create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrEventDataInstanceLossPending.class, memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataInstanceLossPending} instance for the specified memory address. */
    public static XrEventDataInstanceLossPending create(long address) {
        return wrap(XrEventDataInstanceLossPending.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataInstanceLossPending createSafe(long address) {
        return address == NULL ? null : wrap(XrEventDataInstanceLossPending.class, address);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataInstanceLossPending}. */
    public static XrEventDataInstanceLossPending create(XrEventDataBaseHeader value) {
        return wrap(XrEventDataInstanceLossPending.class, value);
    }

    /**
     * Returns a new {@link XrEventDataInstanceLossPending.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataInstanceLossPending.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataInstanceLossPending.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataInstanceLossPending.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataInstanceLossPending.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataInstanceLossPending.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrEventDataInstanceLossPending.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataInstanceLossPending.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataInstanceLossPending.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataInstanceLossPending.Buffer}. */
    public static XrEventDataInstanceLossPending.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /**
     * Returns a new {@code XrEventDataInstanceLossPending} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataInstanceLossPending malloc(MemoryStack stack) {
        return wrap(XrEventDataInstanceLossPending.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrEventDataInstanceLossPending} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataInstanceLossPending calloc(MemoryStack stack) {
        return wrap(XrEventDataInstanceLossPending.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrEventDataInstanceLossPending.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataInstanceLossPending.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataInstanceLossPending.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataInstanceLossPending.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrEventDataInstanceLossPending.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataInstanceLossPending.NEXT); }
    /** Unsafe version of {@link #lossTime}. */
    public static long nlossTime(long struct) { return UNSAFE.getLong(null, struct + XrEventDataInstanceLossPending.LOSSTIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataInstanceLossPending.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataInstanceLossPending.NEXT, value); }
    /** Unsafe version of {@link #lossTime(long) lossTime}. */
    public static void nlossTime(long struct, long value) { UNSAFE.putLong(null, struct + XrEventDataInstanceLossPending.LOSSTIME, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataInstanceLossPending} structs. */
    public static class Buffer extends StructBuffer<XrEventDataInstanceLossPending, Buffer> implements NativeResource {

        private static final XrEventDataInstanceLossPending ELEMENT_FACTORY = XrEventDataInstanceLossPending.create(-1L);

        /**
         * Creates a new {@code XrEventDataInstanceLossPending.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataInstanceLossPending#SIZEOF}, and its mark will be undefined.
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
        protected XrEventDataInstanceLossPending getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataInstanceLossPending.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataInstanceLossPending.nnext(address()); }
        /** @return the value of the {@code lossTime} field. */
        @NativeType("XrTime")
        public long lossTime() { return XrEventDataInstanceLossPending.nlossTime(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataInstanceLossPending.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataInstanceLossPending.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_EVENT_DATA_INSTANCE_LOSS_PENDING TYPE_EVENT_DATA_INSTANCE_LOSS_PENDING} value to the {@code type} field. */
        public XrEventDataInstanceLossPending.Buffer type$Default() { return type(XR10.XR_TYPE_EVENT_DATA_INSTANCE_LOSS_PENDING); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataInstanceLossPending.Buffer next(@NativeType("void const *") long value) { XrEventDataInstanceLossPending.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code lossTime} field. */
        public XrEventDataInstanceLossPending.Buffer lossTime(@NativeType("XrTime") long value) { XrEventDataInstanceLossPending.nlossTime(address(), value); return this; }

    }

}