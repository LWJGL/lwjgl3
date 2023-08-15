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
 * Chains to {@link XrHandJointLocationsEXT} to get hand tracking data source state.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrHandTrackingDataSourceStateEXT} is a structure that an application <b>can</b> chain to {@link XrHandJointLocationsEXT}{@code ::next} when calling {@link EXTHandTracking#xrLocateHandJointsEXT LocateHandJointsEXT} to retrieve the data source of the currently active hand tracking device.</p>
 * 
 * <p>When the returned {@code isActive} is {@code XR_FALSE}, it indicates the currently active hand tracking device does not support any of the requested data sources. In these cases, the runtime <b>must</b> also return no valid tracking locations for hand joints from this {@link EXTHandTracking#xrLocateHandJointsEXT LocateHandJointsEXT} function.</p>
 * 
 * <p>If the tracker was not created with {@link XrHandTrackingDataSourceInfoEXT} chained to {@link XrHandTrackerCreateInfoEXT}{@code ::next}, then the runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}, if {@link XrHandTrackingDataSourceStateEXT} is passed in the call to {@link EXTHandTracking#xrLocateHandJointsEXT LocateHandJointsEXT}.</p>
 * 
 * <p>If there is an active hand tracking device that is one of the specified {@code requestedDataSources}, the runtime <b>must</b> set {@code isActive} to {@link XR10#XR_TRUE TRUE}. When the runtime sets {@code isActive} to {@link XR10#XR_TRUE TRUE}, the runtime <b>must</b> set {@code dataSource} indicate the active data source. The runtime <b>must</b> return a {@code dataSource} that is a subset of the {@code requestedDataSources} when creating the corresponding hand tracker.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link EXTHandTrackingDataSource XR_EXT_hand_tracking_data_source} extension <b>must</b> be enabled prior to using {@link XrHandTrackingDataSourceStateEXT}</li>
 * <li>{@code type} <b>must</b> be {@link EXTHandTrackingDataSource#XR_TYPE_HAND_TRACKING_DATA_SOURCE_STATE_EXT TYPE_HAND_TRACKING_DATA_SOURCE_STATE_EXT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code dataSource} <b>must</b> be a valid {@code XrHandTrackingDataSourceEXT} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrHandJointLocationsEXT}, {@link EXTHandTracking#xrLocateHandJointsEXT LocateHandJointsEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrHandTrackingDataSourceStateEXT {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrBool32 {@link #isActive};
 *     XrHandTrackingDataSourceEXT {@link #dataSource};
 * }</code></pre>
 */
public class XrHandTrackingDataSourceStateEXT extends Struct<XrHandTrackingDataSourceStateEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ISACTIVE,
        DATASOURCE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ISACTIVE = layout.offsetof(2);
        DATASOURCE = layout.offsetof(3);
    }

    protected XrHandTrackingDataSourceStateEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrHandTrackingDataSourceStateEXT create(long address, @Nullable ByteBuffer container) {
        return new XrHandTrackingDataSourceStateEXT(address, container);
    }

    /**
     * Creates a {@code XrHandTrackingDataSourceStateEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandTrackingDataSourceStateEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** indicating there is an active data source */
    @NativeType("XrBool32")
    public boolean isActive() { return nisActive(address()) != 0; }
    /** indicating the data source that was used to generate the hand tracking joints. */
    @NativeType("XrHandTrackingDataSourceEXT")
    public int dataSource() { return ndataSource(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrHandTrackingDataSourceStateEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTHandTrackingDataSource#XR_TYPE_HAND_TRACKING_DATA_SOURCE_STATE_EXT TYPE_HAND_TRACKING_DATA_SOURCE_STATE_EXT} value to the {@link #type} field. */
    public XrHandTrackingDataSourceStateEXT type$Default() { return type(EXTHandTrackingDataSource.XR_TYPE_HAND_TRACKING_DATA_SOURCE_STATE_EXT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrHandTrackingDataSourceStateEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #isActive} field. */
    public XrHandTrackingDataSourceStateEXT isActive(@NativeType("XrBool32") boolean value) { nisActive(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #dataSource} field. */
    public XrHandTrackingDataSourceStateEXT dataSource(@NativeType("XrHandTrackingDataSourceEXT") int value) { ndataSource(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandTrackingDataSourceStateEXT set(
        int type,
        long next,
        boolean isActive,
        int dataSource
    ) {
        type(type);
        next(next);
        isActive(isActive);
        dataSource(dataSource);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHandTrackingDataSourceStateEXT set(XrHandTrackingDataSourceStateEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandTrackingDataSourceStateEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandTrackingDataSourceStateEXT malloc() {
        return new XrHandTrackingDataSourceStateEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrHandTrackingDataSourceStateEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandTrackingDataSourceStateEXT calloc() {
        return new XrHandTrackingDataSourceStateEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrHandTrackingDataSourceStateEXT} instance allocated with {@link BufferUtils}. */
    public static XrHandTrackingDataSourceStateEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrHandTrackingDataSourceStateEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrHandTrackingDataSourceStateEXT} instance for the specified memory address. */
    public static XrHandTrackingDataSourceStateEXT create(long address) {
        return new XrHandTrackingDataSourceStateEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandTrackingDataSourceStateEXT createSafe(long address) {
        return address == NULL ? null : new XrHandTrackingDataSourceStateEXT(address, null);
    }

    /**
     * Returns a new {@link XrHandTrackingDataSourceStateEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingDataSourceStateEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandTrackingDataSourceStateEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingDataSourceStateEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandTrackingDataSourceStateEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingDataSourceStateEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrHandTrackingDataSourceStateEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingDataSourceStateEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandTrackingDataSourceStateEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrHandTrackingDataSourceStateEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandTrackingDataSourceStateEXT malloc(MemoryStack stack) {
        return new XrHandTrackingDataSourceStateEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrHandTrackingDataSourceStateEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandTrackingDataSourceStateEXT calloc(MemoryStack stack) {
        return new XrHandTrackingDataSourceStateEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrHandTrackingDataSourceStateEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingDataSourceStateEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandTrackingDataSourceStateEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingDataSourceStateEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrHandTrackingDataSourceStateEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHandTrackingDataSourceStateEXT.NEXT); }
    /** Unsafe version of {@link #isActive}. */
    public static int nisActive(long struct) { return UNSAFE.getInt(null, struct + XrHandTrackingDataSourceStateEXT.ISACTIVE); }
    /** Unsafe version of {@link #dataSource}. */
    public static int ndataSource(long struct) { return UNSAFE.getInt(null, struct + XrHandTrackingDataSourceStateEXT.DATASOURCE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrHandTrackingDataSourceStateEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHandTrackingDataSourceStateEXT.NEXT, value); }
    /** Unsafe version of {@link #isActive(boolean) isActive}. */
    public static void nisActive(long struct, int value) { UNSAFE.putInt(null, struct + XrHandTrackingDataSourceStateEXT.ISACTIVE, value); }
    /** Unsafe version of {@link #dataSource(int) dataSource}. */
    public static void ndataSource(long struct, int value) { UNSAFE.putInt(null, struct + XrHandTrackingDataSourceStateEXT.DATASOURCE, value); }

    // -----------------------------------

    /** An array of {@link XrHandTrackingDataSourceStateEXT} structs. */
    public static class Buffer extends StructBuffer<XrHandTrackingDataSourceStateEXT, Buffer> implements NativeResource {

        private static final XrHandTrackingDataSourceStateEXT ELEMENT_FACTORY = XrHandTrackingDataSourceStateEXT.create(-1L);

        /**
         * Creates a new {@code XrHandTrackingDataSourceStateEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandTrackingDataSourceStateEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrHandTrackingDataSourceStateEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrHandTrackingDataSourceStateEXT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHandTrackingDataSourceStateEXT.ntype(address()); }
        /** @return the value of the {@link XrHandTrackingDataSourceStateEXT#next} field. */
        @NativeType("void *")
        public long next() { return XrHandTrackingDataSourceStateEXT.nnext(address()); }
        /** @return the value of the {@link XrHandTrackingDataSourceStateEXT#isActive} field. */
        @NativeType("XrBool32")
        public boolean isActive() { return XrHandTrackingDataSourceStateEXT.nisActive(address()) != 0; }
        /** @return the value of the {@link XrHandTrackingDataSourceStateEXT#dataSource} field. */
        @NativeType("XrHandTrackingDataSourceEXT")
        public int dataSource() { return XrHandTrackingDataSourceStateEXT.ndataSource(address()); }

        /** Sets the specified value to the {@link XrHandTrackingDataSourceStateEXT#type} field. */
        public XrHandTrackingDataSourceStateEXT.Buffer type(@NativeType("XrStructureType") int value) { XrHandTrackingDataSourceStateEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTHandTrackingDataSource#XR_TYPE_HAND_TRACKING_DATA_SOURCE_STATE_EXT TYPE_HAND_TRACKING_DATA_SOURCE_STATE_EXT} value to the {@link XrHandTrackingDataSourceStateEXT#type} field. */
        public XrHandTrackingDataSourceStateEXT.Buffer type$Default() { return type(EXTHandTrackingDataSource.XR_TYPE_HAND_TRACKING_DATA_SOURCE_STATE_EXT); }
        /** Sets the specified value to the {@link XrHandTrackingDataSourceStateEXT#next} field. */
        public XrHandTrackingDataSourceStateEXT.Buffer next(@NativeType("void *") long value) { XrHandTrackingDataSourceStateEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrHandTrackingDataSourceStateEXT#isActive} field. */
        public XrHandTrackingDataSourceStateEXT.Buffer isActive(@NativeType("XrBool32") boolean value) { XrHandTrackingDataSourceStateEXT.nisActive(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XrHandTrackingDataSourceStateEXT#dataSource} field. */
        public XrHandTrackingDataSourceStateEXT.Buffer dataSource(@NativeType("XrHandTrackingDataSourceEXT") int value) { XrHandTrackingDataSourceStateEXT.ndataSource(address(), value); return this; }

    }

}