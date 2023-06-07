/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * union CUlaunchAttributeValue {
 *     char pad[64];
 *     {@link CUaccessPolicyWindow CUaccessPolicyWindow} accessPolicyWindow;
 *     int cooperative;
 *     CUsynchronizationPolicy syncPolicy;
 *     struct {
 *         unsigned int x;
 *         unsigned int y;
 *         unsigned int z;
 *     } clusterDim;
 *     CUclusterSchedulingPolicy clusterSchedulingPolicyPreference;
 *     int programmaticStreamSerializationAllowed;
 *     struct {
 *         CUevent event;
 *         int flags;
 *         int triggerAtBlockStart;
 *     } programmaticEvent;
 *     int priority;
 *     {@link CUlaunchMemSyncDomainMap CUlaunchMemSyncDomainMap} memSyncDomainMap;
 *     CUlaunchMemSyncDomain memSyncDomain;
 * }</code></pre>
 */
public class CUlaunchAttributeValue extends Struct<CUlaunchAttributeValue> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PAD,
        ACCESSPOLICYWINDOW,
        COOPERATIVE,
        SYNCPOLICY,
        CLUSTERDIM,
            CLUSTERDIM_X,
            CLUSTERDIM_Y,
            CLUSTERDIM_Z,
        CLUSTERSCHEDULINGPOLICYPREFERENCE,
        PROGRAMMATICSTREAMSERIALIZATIONALLOWED,
        PROGRAMMATICEVENT,
            PROGRAMMATICEVENT_EVENT,
            PROGRAMMATICEVENT_FLAGS,
            PROGRAMMATICEVENT_TRIGGERATBLOCKSTART,
        PRIORITY,
        MEMSYNCDOMAINMAP,
        MEMSYNCDOMAIN;

    static {
        Layout layout = __union(
            __array(1, 64),
            __member(CUaccessPolicyWindow.SIZEOF, CUaccessPolicyWindow.ALIGNOF),
            __member(4),
            __member(4),
            __struct(
                __member(4),
                __member(4),
                __member(4)
            ),
            __member(4),
            __member(4),
            __struct(
                __member(POINTER_SIZE),
                __member(4),
                __member(4)
            ),
            __member(4),
            __member(CUlaunchMemSyncDomainMap.SIZEOF, CUlaunchMemSyncDomainMap.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PAD = layout.offsetof(0);
        ACCESSPOLICYWINDOW = layout.offsetof(1);
        COOPERATIVE = layout.offsetof(2);
        SYNCPOLICY = layout.offsetof(3);
        CLUSTERDIM = layout.offsetof(4);
            CLUSTERDIM_X = layout.offsetof(5);
            CLUSTERDIM_Y = layout.offsetof(6);
            CLUSTERDIM_Z = layout.offsetof(7);
        CLUSTERSCHEDULINGPOLICYPREFERENCE = layout.offsetof(8);
        PROGRAMMATICSTREAMSERIALIZATIONALLOWED = layout.offsetof(9);
        PROGRAMMATICEVENT = layout.offsetof(10);
            PROGRAMMATICEVENT_EVENT = layout.offsetof(11);
            PROGRAMMATICEVENT_FLAGS = layout.offsetof(12);
            PROGRAMMATICEVENT_TRIGGERATBLOCKSTART = layout.offsetof(13);
        PRIORITY = layout.offsetof(14);
        MEMSYNCDOMAINMAP = layout.offsetof(15);
        MEMSYNCDOMAIN = layout.offsetof(16);
    }

    protected CUlaunchAttributeValue(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUlaunchAttributeValue create(long address, @Nullable ByteBuffer container) {
        return new CUlaunchAttributeValue(address, container);
    }

    /**
     * Creates a {@code CUlaunchAttributeValue} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUlaunchAttributeValue(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the {@code pad} field. */
    @NativeType("char[64]")
    public ByteBuffer pad() { return npad(address()); }
    /** @return the value at the specified index of the {@code pad} field. */
    @NativeType("char")
    public byte pad(int index) { return npad(address(), index); }
    /** @return a {@link CUaccessPolicyWindow} view of the {@code accessPolicyWindow} field. */
    public CUaccessPolicyWindow accessPolicyWindow() { return naccessPolicyWindow(address()); }
    /** @return the value of the {@code cooperative} field. */
    public int cooperative() { return ncooperative(address()); }
    /** @return the value of the {@code syncPolicy} field. */
    @NativeType("CUsynchronizationPolicy")
    public int syncPolicy() { return nsyncPolicy(address()); }
    /** @return the value of the {@code clusterDim.x} field. */
    @NativeType("unsigned int")
    public int clusterDim_x() { return nclusterDim_x(address()); }
    /** @return the value of the {@code clusterDim.y} field. */
    @NativeType("unsigned int")
    public int clusterDim_y() { return nclusterDim_y(address()); }
    /** @return the value of the {@code clusterDim.z} field. */
    @NativeType("unsigned int")
    public int clusterDim_z() { return nclusterDim_z(address()); }
    /** @return the value of the {@code clusterSchedulingPolicyPreference} field. */
    @NativeType("CUclusterSchedulingPolicy")
    public int clusterSchedulingPolicyPreference() { return nclusterSchedulingPolicyPreference(address()); }
    /** @return the value of the {@code programmaticStreamSerializationAllowed} field. */
    public int programmaticStreamSerializationAllowed() { return nprogrammaticStreamSerializationAllowed(address()); }
    /** @return the value of the {@code programmaticEvent.event} field. */
    @NativeType("CUevent")
    public long programmaticEvent_event() { return nprogrammaticEvent_event(address()); }
    /** @return the value of the {@code programmaticEvent.flags} field. */
    public int programmaticEvent_flags() { return nprogrammaticEvent_flags(address()); }
    /** @return the value of the {@code programmaticEvent.triggerAtBlockStart} field. */
    public int programmaticEvent_triggerAtBlockStart() { return nprogrammaticEvent_triggerAtBlockStart(address()); }
    /** @return the value of the {@code priority} field. */
    public int priority() { return npriority(address()); }
    /** @return a {@link CUlaunchMemSyncDomainMap} view of the {@code memSyncDomainMap} field. */
    public CUlaunchMemSyncDomainMap memSyncDomainMap() { return nmemSyncDomainMap(address()); }
    /** @return the value of the {@code memSyncDomain} field. */
    @NativeType("CUlaunchMemSyncDomain")
    public int memSyncDomain() { return nmemSyncDomain(address()); }

    /** Copies the specified {@link ByteBuffer} to the {@code pad} field. */
    public CUlaunchAttributeValue pad(@NativeType("char[64]") ByteBuffer value) { npad(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code pad} field. */
    public CUlaunchAttributeValue pad(int index, @NativeType("char") byte value) { npad(address(), index, value); return this; }
    /** Copies the specified {@link CUaccessPolicyWindow} to the {@code accessPolicyWindow} field. */
    public CUlaunchAttributeValue accessPolicyWindow(CUaccessPolicyWindow value) { naccessPolicyWindow(address(), value); return this; }
    /** Passes the {@code accessPolicyWindow} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CUlaunchAttributeValue accessPolicyWindow(java.util.function.Consumer<CUaccessPolicyWindow> consumer) { consumer.accept(accessPolicyWindow()); return this; }
    /** Sets the specified value to the {@code cooperative} field. */
    public CUlaunchAttributeValue cooperative(int value) { ncooperative(address(), value); return this; }
    /** Sets the specified value to the {@code syncPolicy} field. */
    public CUlaunchAttributeValue syncPolicy(@NativeType("CUsynchronizationPolicy") int value) { nsyncPolicy(address(), value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public CUlaunchAttributeValue clusterDim_x(@NativeType("unsigned int") int value) { nclusterDim_x(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public CUlaunchAttributeValue clusterDim_y(@NativeType("unsigned int") int value) { nclusterDim_y(address(), value); return this; }
    /** Sets the specified value to the {@code z} field. */
    public CUlaunchAttributeValue clusterDim_z(@NativeType("unsigned int") int value) { nclusterDim_z(address(), value); return this; }
    /** Sets the specified value to the {@code clusterSchedulingPolicyPreference} field. */
    public CUlaunchAttributeValue clusterSchedulingPolicyPreference(@NativeType("CUclusterSchedulingPolicy") int value) { nclusterSchedulingPolicyPreference(address(), value); return this; }
    /** Sets the specified value to the {@code programmaticStreamSerializationAllowed} field. */
    public CUlaunchAttributeValue programmaticStreamSerializationAllowed(int value) { nprogrammaticStreamSerializationAllowed(address(), value); return this; }
    /** Sets the specified value to the {@code event} field. */
    public CUlaunchAttributeValue programmaticEvent_event(@NativeType("CUevent") long value) { nprogrammaticEvent_event(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public CUlaunchAttributeValue programmaticEvent_flags(int value) { nprogrammaticEvent_flags(address(), value); return this; }
    /** Sets the specified value to the {@code triggerAtBlockStart} field. */
    public CUlaunchAttributeValue programmaticEvent_triggerAtBlockStart(int value) { nprogrammaticEvent_triggerAtBlockStart(address(), value); return this; }
    /** Sets the specified value to the {@code priority} field. */
    public CUlaunchAttributeValue priority(int value) { npriority(address(), value); return this; }
    /** Copies the specified {@link CUlaunchMemSyncDomainMap} to the {@code memSyncDomainMap} field. */
    public CUlaunchAttributeValue memSyncDomainMap(CUlaunchMemSyncDomainMap value) { nmemSyncDomainMap(address(), value); return this; }
    /** Passes the {@code memSyncDomainMap} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CUlaunchAttributeValue memSyncDomainMap(java.util.function.Consumer<CUlaunchMemSyncDomainMap> consumer) { consumer.accept(memSyncDomainMap()); return this; }
    /** Sets the specified value to the {@code memSyncDomain} field. */
    public CUlaunchAttributeValue memSyncDomain(@NativeType("CUlaunchMemSyncDomain") int value) { nmemSyncDomain(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUlaunchAttributeValue set(CUlaunchAttributeValue src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUlaunchAttributeValue} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUlaunchAttributeValue malloc() {
        return new CUlaunchAttributeValue(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUlaunchAttributeValue} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUlaunchAttributeValue calloc() {
        return new CUlaunchAttributeValue(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUlaunchAttributeValue} instance allocated with {@link BufferUtils}. */
    public static CUlaunchAttributeValue create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUlaunchAttributeValue(memAddress(container), container);
    }

    /** Returns a new {@code CUlaunchAttributeValue} instance for the specified memory address. */
    public static CUlaunchAttributeValue create(long address) {
        return new CUlaunchAttributeValue(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUlaunchAttributeValue createSafe(long address) {
        return address == NULL ? null : new CUlaunchAttributeValue(address, null);
    }

    /**
     * Returns a new {@link CUlaunchAttributeValue.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUlaunchAttributeValue.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUlaunchAttributeValue.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUlaunchAttributeValue.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUlaunchAttributeValue.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUlaunchAttributeValue.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUlaunchAttributeValue.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUlaunchAttributeValue.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUlaunchAttributeValue.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUlaunchAttributeValue} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUlaunchAttributeValue malloc(MemoryStack stack) {
        return new CUlaunchAttributeValue(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUlaunchAttributeValue} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUlaunchAttributeValue calloc(MemoryStack stack) {
        return new CUlaunchAttributeValue(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUlaunchAttributeValue.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUlaunchAttributeValue.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUlaunchAttributeValue.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUlaunchAttributeValue.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pad}. */
    public static ByteBuffer npad(long struct) { return memByteBuffer(struct + CUlaunchAttributeValue.PAD, 64); }
    /** Unsafe version of {@link #pad(int) pad}. */
    public static byte npad(long struct, int index) {
        return UNSAFE.getByte(null, struct + CUlaunchAttributeValue.PAD + check(index, 64) * 1);
    }
    /** Unsafe version of {@link #accessPolicyWindow}. */
    public static CUaccessPolicyWindow naccessPolicyWindow(long struct) { return CUaccessPolicyWindow.create(struct + CUlaunchAttributeValue.ACCESSPOLICYWINDOW); }
    /** Unsafe version of {@link #cooperative}. */
    public static int ncooperative(long struct) { return UNSAFE.getInt(null, struct + CUlaunchAttributeValue.COOPERATIVE); }
    /** Unsafe version of {@link #syncPolicy}. */
    public static int nsyncPolicy(long struct) { return UNSAFE.getInt(null, struct + CUlaunchAttributeValue.SYNCPOLICY); }
    /** Unsafe version of {@link #clusterDim_x}. */
    public static int nclusterDim_x(long struct) { return UNSAFE.getInt(null, struct + CUlaunchAttributeValue.CLUSTERDIM_X); }
    /** Unsafe version of {@link #clusterDim_y}. */
    public static int nclusterDim_y(long struct) { return UNSAFE.getInt(null, struct + CUlaunchAttributeValue.CLUSTERDIM_Y); }
    /** Unsafe version of {@link #clusterDim_z}. */
    public static int nclusterDim_z(long struct) { return UNSAFE.getInt(null, struct + CUlaunchAttributeValue.CLUSTERDIM_Z); }
    /** Unsafe version of {@link #clusterSchedulingPolicyPreference}. */
    public static int nclusterSchedulingPolicyPreference(long struct) { return UNSAFE.getInt(null, struct + CUlaunchAttributeValue.CLUSTERSCHEDULINGPOLICYPREFERENCE); }
    /** Unsafe version of {@link #programmaticStreamSerializationAllowed}. */
    public static int nprogrammaticStreamSerializationAllowed(long struct) { return UNSAFE.getInt(null, struct + CUlaunchAttributeValue.PROGRAMMATICSTREAMSERIALIZATIONALLOWED); }
    /** Unsafe version of {@link #programmaticEvent_event}. */
    public static long nprogrammaticEvent_event(long struct) { return memGetAddress(struct + CUlaunchAttributeValue.PROGRAMMATICEVENT_EVENT); }
    /** Unsafe version of {@link #programmaticEvent_flags}. */
    public static int nprogrammaticEvent_flags(long struct) { return UNSAFE.getInt(null, struct + CUlaunchAttributeValue.PROGRAMMATICEVENT_FLAGS); }
    /** Unsafe version of {@link #programmaticEvent_triggerAtBlockStart}. */
    public static int nprogrammaticEvent_triggerAtBlockStart(long struct) { return UNSAFE.getInt(null, struct + CUlaunchAttributeValue.PROGRAMMATICEVENT_TRIGGERATBLOCKSTART); }
    /** Unsafe version of {@link #priority}. */
    public static int npriority(long struct) { return UNSAFE.getInt(null, struct + CUlaunchAttributeValue.PRIORITY); }
    /** Unsafe version of {@link #memSyncDomainMap}. */
    public static CUlaunchMemSyncDomainMap nmemSyncDomainMap(long struct) { return CUlaunchMemSyncDomainMap.create(struct + CUlaunchAttributeValue.MEMSYNCDOMAINMAP); }
    /** Unsafe version of {@link #memSyncDomain}. */
    public static int nmemSyncDomain(long struct) { return UNSAFE.getInt(null, struct + CUlaunchAttributeValue.MEMSYNCDOMAIN); }

    /** Unsafe version of {@link #pad(ByteBuffer) pad}. */
    public static void npad(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 64); }
        memCopy(memAddress(value), struct + CUlaunchAttributeValue.PAD, value.remaining() * 1);
    }
    /** Unsafe version of {@link #pad(int, byte) pad}. */
    public static void npad(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + CUlaunchAttributeValue.PAD + check(index, 64) * 1, value);
    }
    /** Unsafe version of {@link #accessPolicyWindow(CUaccessPolicyWindow) accessPolicyWindow}. */
    public static void naccessPolicyWindow(long struct, CUaccessPolicyWindow value) { memCopy(value.address(), struct + CUlaunchAttributeValue.ACCESSPOLICYWINDOW, CUaccessPolicyWindow.SIZEOF); }
    /** Unsafe version of {@link #cooperative(int) cooperative}. */
    public static void ncooperative(long struct, int value) { UNSAFE.putInt(null, struct + CUlaunchAttributeValue.COOPERATIVE, value); }
    /** Unsafe version of {@link #syncPolicy(int) syncPolicy}. */
    public static void nsyncPolicy(long struct, int value) { UNSAFE.putInt(null, struct + CUlaunchAttributeValue.SYNCPOLICY, value); }
    /** Unsafe version of {@link #clusterDim_x(int) clusterDim_x}. */
    public static void nclusterDim_x(long struct, int value) { UNSAFE.putInt(null, struct + CUlaunchAttributeValue.CLUSTERDIM_X, value); }
    /** Unsafe version of {@link #clusterDim_y(int) clusterDim_y}. */
    public static void nclusterDim_y(long struct, int value) { UNSAFE.putInt(null, struct + CUlaunchAttributeValue.CLUSTERDIM_Y, value); }
    /** Unsafe version of {@link #clusterDim_z(int) clusterDim_z}. */
    public static void nclusterDim_z(long struct, int value) { UNSAFE.putInt(null, struct + CUlaunchAttributeValue.CLUSTERDIM_Z, value); }
    /** Unsafe version of {@link #clusterSchedulingPolicyPreference(int) clusterSchedulingPolicyPreference}. */
    public static void nclusterSchedulingPolicyPreference(long struct, int value) { UNSAFE.putInt(null, struct + CUlaunchAttributeValue.CLUSTERSCHEDULINGPOLICYPREFERENCE, value); }
    /** Unsafe version of {@link #programmaticStreamSerializationAllowed(int) programmaticStreamSerializationAllowed}. */
    public static void nprogrammaticStreamSerializationAllowed(long struct, int value) { UNSAFE.putInt(null, struct + CUlaunchAttributeValue.PROGRAMMATICSTREAMSERIALIZATIONALLOWED, value); }
    /** Unsafe version of {@link #programmaticEvent_event(long) programmaticEvent_event}. */
    public static void nprogrammaticEvent_event(long struct, long value) { memPutAddress(struct + CUlaunchAttributeValue.PROGRAMMATICEVENT_EVENT, check(value)); }
    /** Unsafe version of {@link #programmaticEvent_flags(int) programmaticEvent_flags}. */
    public static void nprogrammaticEvent_flags(long struct, int value) { UNSAFE.putInt(null, struct + CUlaunchAttributeValue.PROGRAMMATICEVENT_FLAGS, value); }
    /** Unsafe version of {@link #programmaticEvent_triggerAtBlockStart(int) programmaticEvent_triggerAtBlockStart}. */
    public static void nprogrammaticEvent_triggerAtBlockStart(long struct, int value) { UNSAFE.putInt(null, struct + CUlaunchAttributeValue.PROGRAMMATICEVENT_TRIGGERATBLOCKSTART, value); }
    /** Unsafe version of {@link #priority(int) priority}. */
    public static void npriority(long struct, int value) { UNSAFE.putInt(null, struct + CUlaunchAttributeValue.PRIORITY, value); }
    /** Unsafe version of {@link #memSyncDomainMap(CUlaunchMemSyncDomainMap) memSyncDomainMap}. */
    public static void nmemSyncDomainMap(long struct, CUlaunchMemSyncDomainMap value) { memCopy(value.address(), struct + CUlaunchAttributeValue.MEMSYNCDOMAINMAP, CUlaunchMemSyncDomainMap.SIZEOF); }
    /** Unsafe version of {@link #memSyncDomain(int) memSyncDomain}. */
    public static void nmemSyncDomain(long struct, int value) { UNSAFE.putInt(null, struct + CUlaunchAttributeValue.MEMSYNCDOMAIN, value); }

    // -----------------------------------

    /** An array of {@link CUlaunchAttributeValue} structs. */
    public static class Buffer extends StructBuffer<CUlaunchAttributeValue, Buffer> implements NativeResource {

        private static final CUlaunchAttributeValue ELEMENT_FACTORY = CUlaunchAttributeValue.create(-1L);

        /**
         * Creates a new {@code CUlaunchAttributeValue.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUlaunchAttributeValue#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUlaunchAttributeValue getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@code pad} field. */
        @NativeType("char[64]")
        public ByteBuffer pad() { return CUlaunchAttributeValue.npad(address()); }
        /** @return the value at the specified index of the {@code pad} field. */
        @NativeType("char")
        public byte pad(int index) { return CUlaunchAttributeValue.npad(address(), index); }
        /** @return a {@link CUaccessPolicyWindow} view of the {@code accessPolicyWindow} field. */
        public CUaccessPolicyWindow accessPolicyWindow() { return CUlaunchAttributeValue.naccessPolicyWindow(address()); }
        /** @return the value of the {@code cooperative} field. */
        public int cooperative() { return CUlaunchAttributeValue.ncooperative(address()); }
        /** @return the value of the {@code syncPolicy} field. */
        @NativeType("CUsynchronizationPolicy")
        public int syncPolicy() { return CUlaunchAttributeValue.nsyncPolicy(address()); }
        /** @return the value of the {@code clusterDim.x} field. */
        @NativeType("unsigned int")
        public int clusterDim_x() { return CUlaunchAttributeValue.nclusterDim_x(address()); }
        /** @return the value of the {@code clusterDim.y} field. */
        @NativeType("unsigned int")
        public int clusterDim_y() { return CUlaunchAttributeValue.nclusterDim_y(address()); }
        /** @return the value of the {@code clusterDim.z} field. */
        @NativeType("unsigned int")
        public int clusterDim_z() { return CUlaunchAttributeValue.nclusterDim_z(address()); }
        /** @return the value of the {@code clusterSchedulingPolicyPreference} field. */
        @NativeType("CUclusterSchedulingPolicy")
        public int clusterSchedulingPolicyPreference() { return CUlaunchAttributeValue.nclusterSchedulingPolicyPreference(address()); }
        /** @return the value of the {@code programmaticStreamSerializationAllowed} field. */
        public int programmaticStreamSerializationAllowed() { return CUlaunchAttributeValue.nprogrammaticStreamSerializationAllowed(address()); }
        /** @return the value of the {@code programmaticEvent.event} field. */
        @NativeType("CUevent")
        public long programmaticEvent_event() { return CUlaunchAttributeValue.nprogrammaticEvent_event(address()); }
        /** @return the value of the {@code programmaticEvent.flags} field. */
        public int programmaticEvent_flags() { return CUlaunchAttributeValue.nprogrammaticEvent_flags(address()); }
        /** @return the value of the {@code programmaticEvent.triggerAtBlockStart} field. */
        public int programmaticEvent_triggerAtBlockStart() { return CUlaunchAttributeValue.nprogrammaticEvent_triggerAtBlockStart(address()); }
        /** @return the value of the {@code priority} field. */
        public int priority() { return CUlaunchAttributeValue.npriority(address()); }
        /** @return a {@link CUlaunchMemSyncDomainMap} view of the {@code memSyncDomainMap} field. */
        public CUlaunchMemSyncDomainMap memSyncDomainMap() { return CUlaunchAttributeValue.nmemSyncDomainMap(address()); }
        /** @return the value of the {@code memSyncDomain} field. */
        @NativeType("CUlaunchMemSyncDomain")
        public int memSyncDomain() { return CUlaunchAttributeValue.nmemSyncDomain(address()); }

        /** Copies the specified {@link ByteBuffer} to the {@code pad} field. */
        public CUlaunchAttributeValue.Buffer pad(@NativeType("char[64]") ByteBuffer value) { CUlaunchAttributeValue.npad(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code pad} field. */
        public CUlaunchAttributeValue.Buffer pad(int index, @NativeType("char") byte value) { CUlaunchAttributeValue.npad(address(), index, value); return this; }
        /** Copies the specified {@link CUaccessPolicyWindow} to the {@code accessPolicyWindow} field. */
        public CUlaunchAttributeValue.Buffer accessPolicyWindow(CUaccessPolicyWindow value) { CUlaunchAttributeValue.naccessPolicyWindow(address(), value); return this; }
        /** Passes the {@code accessPolicyWindow} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CUlaunchAttributeValue.Buffer accessPolicyWindow(java.util.function.Consumer<CUaccessPolicyWindow> consumer) { consumer.accept(accessPolicyWindow()); return this; }
        /** Sets the specified value to the {@code cooperative} field. */
        public CUlaunchAttributeValue.Buffer cooperative(int value) { CUlaunchAttributeValue.ncooperative(address(), value); return this; }
        /** Sets the specified value to the {@code syncPolicy} field. */
        public CUlaunchAttributeValue.Buffer syncPolicy(@NativeType("CUsynchronizationPolicy") int value) { CUlaunchAttributeValue.nsyncPolicy(address(), value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public CUlaunchAttributeValue.Buffer clusterDim_x(@NativeType("unsigned int") int value) { CUlaunchAttributeValue.nclusterDim_x(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public CUlaunchAttributeValue.Buffer clusterDim_y(@NativeType("unsigned int") int value) { CUlaunchAttributeValue.nclusterDim_y(address(), value); return this; }
        /** Sets the specified value to the {@code z} field. */
        public CUlaunchAttributeValue.Buffer clusterDim_z(@NativeType("unsigned int") int value) { CUlaunchAttributeValue.nclusterDim_z(address(), value); return this; }
        /** Sets the specified value to the {@code clusterSchedulingPolicyPreference} field. */
        public CUlaunchAttributeValue.Buffer clusterSchedulingPolicyPreference(@NativeType("CUclusterSchedulingPolicy") int value) { CUlaunchAttributeValue.nclusterSchedulingPolicyPreference(address(), value); return this; }
        /** Sets the specified value to the {@code programmaticStreamSerializationAllowed} field. */
        public CUlaunchAttributeValue.Buffer programmaticStreamSerializationAllowed(int value) { CUlaunchAttributeValue.nprogrammaticStreamSerializationAllowed(address(), value); return this; }
        /** Sets the specified value to the {@code event} field. */
        public CUlaunchAttributeValue.Buffer programmaticEvent_event(@NativeType("CUevent") long value) { CUlaunchAttributeValue.nprogrammaticEvent_event(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public CUlaunchAttributeValue.Buffer programmaticEvent_flags(int value) { CUlaunchAttributeValue.nprogrammaticEvent_flags(address(), value); return this; }
        /** Sets the specified value to the {@code triggerAtBlockStart} field. */
        public CUlaunchAttributeValue.Buffer programmaticEvent_triggerAtBlockStart(int value) { CUlaunchAttributeValue.nprogrammaticEvent_triggerAtBlockStart(address(), value); return this; }
        /** Sets the specified value to the {@code priority} field. */
        public CUlaunchAttributeValue.Buffer priority(int value) { CUlaunchAttributeValue.npriority(address(), value); return this; }
        /** Copies the specified {@link CUlaunchMemSyncDomainMap} to the {@code memSyncDomainMap} field. */
        public CUlaunchAttributeValue.Buffer memSyncDomainMap(CUlaunchMemSyncDomainMap value) { CUlaunchAttributeValue.nmemSyncDomainMap(address(), value); return this; }
        /** Passes the {@code memSyncDomainMap} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CUlaunchAttributeValue.Buffer memSyncDomainMap(java.util.function.Consumer<CUlaunchMemSyncDomainMap> consumer) { consumer.accept(memSyncDomainMap()); return this; }
        /** Sets the specified value to the {@code memSyncDomain} field. */
        public CUlaunchAttributeValue.Buffer memSyncDomain(@NativeType("CUlaunchMemSyncDomain") int value) { CUlaunchAttributeValue.nmemSyncDomain(address(), value); return this; }

    }

}