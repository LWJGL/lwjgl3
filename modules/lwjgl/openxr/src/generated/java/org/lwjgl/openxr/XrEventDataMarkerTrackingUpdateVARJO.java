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
 * Structure representing marker tracking information.
 * 
 * <h5>Description</h5>
 * 
 * <p>Receiving the {@link XrEventDataMarkerTrackingUpdateVARJO} event structure indicates that the tracking information has changed. The runtime <b>must</b> not send more than one event per frame per marker. The runtime <b>must</b> send an event if the marker has changed its state (active or inactive). The runtime <b>must</b> send an event if it has detected pose change of the active marker.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link VARJOMarkerTracking XR_VARJO_marker_tracking} extension <b>must</b> be enabled prior to using {@link XrEventDataMarkerTrackingUpdateVARJO}</li>
 * <li>{@code type} <b>must</b> be {@link VARJOMarkerTracking#XR_TYPE_EVENT_DATA_MARKER_TRACKING_UPDATE_VARJO TYPE_EVENT_DATA_MARKER_TRACKING_UPDATE_VARJO}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrPollEvent PollEvent}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEventDataMarkerTrackingUpdateVARJO {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     uint64_t {@link #markerId};
 *     XrBool32 {@link #isActive};
 *     XrBool32 isPredicted;
 *     XrTime {@link #time};
 * }</code></pre>
 */
public class XrEventDataMarkerTrackingUpdateVARJO extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MARKERID,
        ISACTIVE,
        ISPREDICTED,
        TIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        MARKERID = layout.offsetof(2);
        ISACTIVE = layout.offsetof(3);
        ISPREDICTED = layout.offsetof(4);
        TIME = layout.offsetof(5);
    }

    /**
     * Creates a {@code XrEventDataMarkerTrackingUpdateVARJO} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataMarkerTrackingUpdateVARJO(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** unique identifier of the marker that has been updated. */
    @NativeType("uint64_t")
    public long markerId() { return nmarkerId(address()); }
    /** the tracking state of the marker. */
    @NativeType("XrBool32")
    public boolean isActive() { return nisActive(address()) != 0; }
    /** @return the value of the {@code isPredicted} field. */
    @NativeType("XrBool32")
    public boolean isPredicted() { return nisPredicted(address()) != 0; }
    /** the time of the marker update. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrEventDataMarkerTrackingUpdateVARJO type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link VARJOMarkerTracking#XR_TYPE_EVENT_DATA_MARKER_TRACKING_UPDATE_VARJO TYPE_EVENT_DATA_MARKER_TRACKING_UPDATE_VARJO} value to the {@link #type} field. */
    public XrEventDataMarkerTrackingUpdateVARJO type$Default() { return type(VARJOMarkerTracking.XR_TYPE_EVENT_DATA_MARKER_TRACKING_UPDATE_VARJO); }
    /** Sets the specified value to the {@link #next} field. */
    public XrEventDataMarkerTrackingUpdateVARJO next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #markerId} field. */
    public XrEventDataMarkerTrackingUpdateVARJO markerId(@NativeType("uint64_t") long value) { nmarkerId(address(), value); return this; }
    /** Sets the specified value to the {@link #isActive} field. */
    public XrEventDataMarkerTrackingUpdateVARJO isActive(@NativeType("XrBool32") boolean value) { nisActive(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code isPredicted} field. */
    public XrEventDataMarkerTrackingUpdateVARJO isPredicted(@NativeType("XrBool32") boolean value) { nisPredicted(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #time} field. */
    public XrEventDataMarkerTrackingUpdateVARJO time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataMarkerTrackingUpdateVARJO set(
        int type,
        long next,
        long markerId,
        boolean isActive,
        boolean isPredicted,
        long time
    ) {
        type(type);
        next(next);
        markerId(markerId);
        isActive(isActive);
        isPredicted(isPredicted);
        time(time);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEventDataMarkerTrackingUpdateVARJO set(XrEventDataMarkerTrackingUpdateVARJO src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataMarkerTrackingUpdateVARJO} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataMarkerTrackingUpdateVARJO malloc() {
        return wrap(XrEventDataMarkerTrackingUpdateVARJO.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrEventDataMarkerTrackingUpdateVARJO} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataMarkerTrackingUpdateVARJO calloc() {
        return wrap(XrEventDataMarkerTrackingUpdateVARJO.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrEventDataMarkerTrackingUpdateVARJO} instance allocated with {@link BufferUtils}. */
    public static XrEventDataMarkerTrackingUpdateVARJO create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrEventDataMarkerTrackingUpdateVARJO.class, memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataMarkerTrackingUpdateVARJO} instance for the specified memory address. */
    public static XrEventDataMarkerTrackingUpdateVARJO create(long address) {
        return wrap(XrEventDataMarkerTrackingUpdateVARJO.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataMarkerTrackingUpdateVARJO createSafe(long address) {
        return address == NULL ? null : wrap(XrEventDataMarkerTrackingUpdateVARJO.class, address);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataMarkerTrackingUpdateVARJO}. */
    public static XrEventDataMarkerTrackingUpdateVARJO create(XrEventDataBaseHeader value) {
        return wrap(XrEventDataMarkerTrackingUpdateVARJO.class, value);
    }

    /**
     * Returns a new {@link XrEventDataMarkerTrackingUpdateVARJO.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataMarkerTrackingUpdateVARJO.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataMarkerTrackingUpdateVARJO.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataMarkerTrackingUpdateVARJO.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataMarkerTrackingUpdateVARJO.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataMarkerTrackingUpdateVARJO.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrEventDataMarkerTrackingUpdateVARJO.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataMarkerTrackingUpdateVARJO.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataMarkerTrackingUpdateVARJO.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataMarkerTrackingUpdateVARJO.Buffer}. */
    public static XrEventDataMarkerTrackingUpdateVARJO.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /**
     * Returns a new {@code XrEventDataMarkerTrackingUpdateVARJO} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataMarkerTrackingUpdateVARJO malloc(MemoryStack stack) {
        return wrap(XrEventDataMarkerTrackingUpdateVARJO.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrEventDataMarkerTrackingUpdateVARJO} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataMarkerTrackingUpdateVARJO calloc(MemoryStack stack) {
        return wrap(XrEventDataMarkerTrackingUpdateVARJO.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrEventDataMarkerTrackingUpdateVARJO.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataMarkerTrackingUpdateVARJO.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataMarkerTrackingUpdateVARJO.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataMarkerTrackingUpdateVARJO.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrEventDataMarkerTrackingUpdateVARJO.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataMarkerTrackingUpdateVARJO.NEXT); }
    /** Unsafe version of {@link #markerId}. */
    public static long nmarkerId(long struct) { return UNSAFE.getLong(null, struct + XrEventDataMarkerTrackingUpdateVARJO.MARKERID); }
    /** Unsafe version of {@link #isActive}. */
    public static int nisActive(long struct) { return UNSAFE.getInt(null, struct + XrEventDataMarkerTrackingUpdateVARJO.ISACTIVE); }
    /** Unsafe version of {@link #isPredicted}. */
    public static int nisPredicted(long struct) { return UNSAFE.getInt(null, struct + XrEventDataMarkerTrackingUpdateVARJO.ISPREDICTED); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return UNSAFE.getLong(null, struct + XrEventDataMarkerTrackingUpdateVARJO.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataMarkerTrackingUpdateVARJO.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataMarkerTrackingUpdateVARJO.NEXT, value); }
    /** Unsafe version of {@link #markerId(long) markerId}. */
    public static void nmarkerId(long struct, long value) { UNSAFE.putLong(null, struct + XrEventDataMarkerTrackingUpdateVARJO.MARKERID, value); }
    /** Unsafe version of {@link #isActive(boolean) isActive}. */
    public static void nisActive(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataMarkerTrackingUpdateVARJO.ISACTIVE, value); }
    /** Unsafe version of {@link #isPredicted(boolean) isPredicted}. */
    public static void nisPredicted(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataMarkerTrackingUpdateVARJO.ISPREDICTED, value); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { UNSAFE.putLong(null, struct + XrEventDataMarkerTrackingUpdateVARJO.TIME, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataMarkerTrackingUpdateVARJO} structs. */
    public static class Buffer extends StructBuffer<XrEventDataMarkerTrackingUpdateVARJO, Buffer> implements NativeResource {

        private static final XrEventDataMarkerTrackingUpdateVARJO ELEMENT_FACTORY = XrEventDataMarkerTrackingUpdateVARJO.create(-1L);

        /**
         * Creates a new {@code XrEventDataMarkerTrackingUpdateVARJO.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataMarkerTrackingUpdateVARJO#SIZEOF}, and its mark will be undefined.
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
        protected XrEventDataMarkerTrackingUpdateVARJO getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrEventDataMarkerTrackingUpdateVARJO#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataMarkerTrackingUpdateVARJO.ntype(address()); }
        /** @return the value of the {@link XrEventDataMarkerTrackingUpdateVARJO#next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataMarkerTrackingUpdateVARJO.nnext(address()); }
        /** @return the value of the {@link XrEventDataMarkerTrackingUpdateVARJO#markerId} field. */
        @NativeType("uint64_t")
        public long markerId() { return XrEventDataMarkerTrackingUpdateVARJO.nmarkerId(address()); }
        /** @return the value of the {@link XrEventDataMarkerTrackingUpdateVARJO#isActive} field. */
        @NativeType("XrBool32")
        public boolean isActive() { return XrEventDataMarkerTrackingUpdateVARJO.nisActive(address()) != 0; }
        /** @return the value of the {@code isPredicted} field. */
        @NativeType("XrBool32")
        public boolean isPredicted() { return XrEventDataMarkerTrackingUpdateVARJO.nisPredicted(address()) != 0; }
        /** @return the value of the {@link XrEventDataMarkerTrackingUpdateVARJO#time} field. */
        @NativeType("XrTime")
        public long time() { return XrEventDataMarkerTrackingUpdateVARJO.ntime(address()); }

        /** Sets the specified value to the {@link XrEventDataMarkerTrackingUpdateVARJO#type} field. */
        public XrEventDataMarkerTrackingUpdateVARJO.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataMarkerTrackingUpdateVARJO.ntype(address(), value); return this; }
        /** Sets the {@link VARJOMarkerTracking#XR_TYPE_EVENT_DATA_MARKER_TRACKING_UPDATE_VARJO TYPE_EVENT_DATA_MARKER_TRACKING_UPDATE_VARJO} value to the {@link XrEventDataMarkerTrackingUpdateVARJO#type} field. */
        public XrEventDataMarkerTrackingUpdateVARJO.Buffer type$Default() { return type(VARJOMarkerTracking.XR_TYPE_EVENT_DATA_MARKER_TRACKING_UPDATE_VARJO); }
        /** Sets the specified value to the {@link XrEventDataMarkerTrackingUpdateVARJO#next} field. */
        public XrEventDataMarkerTrackingUpdateVARJO.Buffer next(@NativeType("void const *") long value) { XrEventDataMarkerTrackingUpdateVARJO.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataMarkerTrackingUpdateVARJO#markerId} field. */
        public XrEventDataMarkerTrackingUpdateVARJO.Buffer markerId(@NativeType("uint64_t") long value) { XrEventDataMarkerTrackingUpdateVARJO.nmarkerId(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataMarkerTrackingUpdateVARJO#isActive} field. */
        public XrEventDataMarkerTrackingUpdateVARJO.Buffer isActive(@NativeType("XrBool32") boolean value) { XrEventDataMarkerTrackingUpdateVARJO.nisActive(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code isPredicted} field. */
        public XrEventDataMarkerTrackingUpdateVARJO.Buffer isPredicted(@NativeType("XrBool32") boolean value) { XrEventDataMarkerTrackingUpdateVARJO.nisPredicted(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XrEventDataMarkerTrackingUpdateVARJO#time} field. */
        public XrEventDataMarkerTrackingUpdateVARJO.Buffer time(@NativeType("XrTime") long value) { XrEventDataMarkerTrackingUpdateVARJO.ntime(address(), value); return this; }

    }

}