/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrRoomLayoutFB {
 *     XrStructureType type;
 *     void const * next;
 *     {@link XrUuidEXT XrUuidEXT} floorUuid;
 *     {@link XrUuidEXT XrUuidEXT} ceilingUuid;
 *     uint32_t wallUuidCapacityInput;
 *     uint32_t wallUuidCountOutput;
 *     {@link XrUuidEXT XrUuidEXT} * wallUuids;
 * }}</pre>
 */
public class XrRoomLayoutFB extends Struct<XrRoomLayoutFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FLOORUUID,
        CEILINGUUID,
        WALLUUIDCAPACITYINPUT,
        WALLUUIDCOUNTOUTPUT,
        WALLUUIDS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrUuidEXT.SIZEOF, XrUuidEXT.ALIGNOF),
            __member(XrUuidEXT.SIZEOF, XrUuidEXT.ALIGNOF),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FLOORUUID = layout.offsetof(2);
        CEILINGUUID = layout.offsetof(3);
        WALLUUIDCAPACITYINPUT = layout.offsetof(4);
        WALLUUIDCOUNTOUTPUT = layout.offsetof(5);
        WALLUUIDS = layout.offsetof(6);
    }

    protected XrRoomLayoutFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrRoomLayoutFB create(long address, @Nullable ByteBuffer container) {
        return new XrRoomLayoutFB(address, container);
    }

    /**
     * Creates a {@code XrRoomLayoutFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRoomLayoutFB(ByteBuffer container) {
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
    /** @return a {@link XrUuidEXT} view of the {@code floorUuid} field. */
    public XrUuidEXT floorUuid() { return nfloorUuid(address()); }
    /** @return a {@link XrUuidEXT} view of the {@code ceilingUuid} field. */
    public XrUuidEXT ceilingUuid() { return nceilingUuid(address()); }
    /** @return the value of the {@code wallUuidCapacityInput} field. */
    @NativeType("uint32_t")
    public int wallUuidCapacityInput() { return nwallUuidCapacityInput(address()); }
    /** @return the value of the {@code wallUuidCountOutput} field. */
    @NativeType("uint32_t")
    public int wallUuidCountOutput() { return nwallUuidCountOutput(address()); }
    /** @return a {@link XrUuidEXT.Buffer} view of the struct array pointed to by the {@code wallUuids} field. */
    @NativeType("XrUuidEXT *")
    public XrUuidEXT.@Nullable Buffer wallUuids() { return nwallUuids(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrRoomLayoutFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBScene#XR_TYPE_ROOM_LAYOUT_FB TYPE_ROOM_LAYOUT_FB} value to the {@code type} field. */
    public XrRoomLayoutFB type$Default() { return type(FBScene.XR_TYPE_ROOM_LAYOUT_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrRoomLayoutFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrUuidEXT} to the {@code floorUuid} field. */
    public XrRoomLayoutFB floorUuid(XrUuidEXT value) { nfloorUuid(address(), value); return this; }
    /** Passes the {@code floorUuid} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrRoomLayoutFB floorUuid(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(floorUuid()); return this; }
    /** Copies the specified {@link XrUuidEXT} to the {@code ceilingUuid} field. */
    public XrRoomLayoutFB ceilingUuid(XrUuidEXT value) { nceilingUuid(address(), value); return this; }
    /** Passes the {@code ceilingUuid} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrRoomLayoutFB ceilingUuid(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(ceilingUuid()); return this; }
    /** Sets the specified value to the {@code wallUuidCapacityInput} field. */
    public XrRoomLayoutFB wallUuidCapacityInput(@NativeType("uint32_t") int value) { nwallUuidCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code wallUuidCountOutput} field. */
    public XrRoomLayoutFB wallUuidCountOutput(@NativeType("uint32_t") int value) { nwallUuidCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrUuidEXT.Buffer} to the {@code wallUuids} field. */
    public XrRoomLayoutFB wallUuids(@NativeType("XrUuidEXT *") XrUuidEXT.@Nullable Buffer value) { nwallUuids(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrRoomLayoutFB set(
        int type,
        long next,
        XrUuidEXT floorUuid,
        XrUuidEXT ceilingUuid,
        int wallUuidCapacityInput,
        int wallUuidCountOutput,
        XrUuidEXT.@Nullable Buffer wallUuids
    ) {
        type(type);
        next(next);
        floorUuid(floorUuid);
        ceilingUuid(ceilingUuid);
        wallUuidCapacityInput(wallUuidCapacityInput);
        wallUuidCountOutput(wallUuidCountOutput);
        wallUuids(wallUuids);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrRoomLayoutFB set(XrRoomLayoutFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRoomLayoutFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRoomLayoutFB malloc() {
        return new XrRoomLayoutFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrRoomLayoutFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRoomLayoutFB calloc() {
        return new XrRoomLayoutFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrRoomLayoutFB} instance allocated with {@link BufferUtils}. */
    public static XrRoomLayoutFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrRoomLayoutFB(memAddress(container), container);
    }

    /** Returns a new {@code XrRoomLayoutFB} instance for the specified memory address. */
    public static XrRoomLayoutFB create(long address) {
        return new XrRoomLayoutFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrRoomLayoutFB createSafe(long address) {
        return address == NULL ? null : new XrRoomLayoutFB(address, null);
    }

    /**
     * Returns a new {@link XrRoomLayoutFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRoomLayoutFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRoomLayoutFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRoomLayoutFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRoomLayoutFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRoomLayoutFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrRoomLayoutFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRoomLayoutFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrRoomLayoutFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrRoomLayoutFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRoomLayoutFB malloc(MemoryStack stack) {
        return new XrRoomLayoutFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrRoomLayoutFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRoomLayoutFB calloc(MemoryStack stack) {
        return new XrRoomLayoutFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrRoomLayoutFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRoomLayoutFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRoomLayoutFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRoomLayoutFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrRoomLayoutFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrRoomLayoutFB.NEXT); }
    /** Unsafe version of {@link #floorUuid}. */
    public static XrUuidEXT nfloorUuid(long struct) { return XrUuidEXT.create(struct + XrRoomLayoutFB.FLOORUUID); }
    /** Unsafe version of {@link #ceilingUuid}. */
    public static XrUuidEXT nceilingUuid(long struct) { return XrUuidEXT.create(struct + XrRoomLayoutFB.CEILINGUUID); }
    /** Unsafe version of {@link #wallUuidCapacityInput}. */
    public static int nwallUuidCapacityInput(long struct) { return memGetInt(struct + XrRoomLayoutFB.WALLUUIDCAPACITYINPUT); }
    /** Unsafe version of {@link #wallUuidCountOutput}. */
    public static int nwallUuidCountOutput(long struct) { return memGetInt(struct + XrRoomLayoutFB.WALLUUIDCOUNTOUTPUT); }
    /** Unsafe version of {@link #wallUuids}. */
    public static XrUuidEXT.@Nullable Buffer nwallUuids(long struct) { return XrUuidEXT.createSafe(memGetAddress(struct + XrRoomLayoutFB.WALLUUIDS), nwallUuidCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrRoomLayoutFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrRoomLayoutFB.NEXT, value); }
    /** Unsafe version of {@link #floorUuid(XrUuidEXT) floorUuid}. */
    public static void nfloorUuid(long struct, XrUuidEXT value) { memCopy(value.address(), struct + XrRoomLayoutFB.FLOORUUID, XrUuidEXT.SIZEOF); }
    /** Unsafe version of {@link #ceilingUuid(XrUuidEXT) ceilingUuid}. */
    public static void nceilingUuid(long struct, XrUuidEXT value) { memCopy(value.address(), struct + XrRoomLayoutFB.CEILINGUUID, XrUuidEXT.SIZEOF); }
    /** Sets the specified value to the {@code wallUuidCapacityInput} field of the specified {@code struct}. */
    public static void nwallUuidCapacityInput(long struct, int value) { memPutInt(struct + XrRoomLayoutFB.WALLUUIDCAPACITYINPUT, value); }
    /** Unsafe version of {@link #wallUuidCountOutput(int) wallUuidCountOutput}. */
    public static void nwallUuidCountOutput(long struct, int value) { memPutInt(struct + XrRoomLayoutFB.WALLUUIDCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #wallUuids(XrUuidEXT.Buffer) wallUuids}. */
    public static void nwallUuids(long struct, XrUuidEXT.@Nullable Buffer value) { memPutAddress(struct + XrRoomLayoutFB.WALLUUIDS, memAddressSafe(value)); if (value != null) { nwallUuidCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrRoomLayoutFB} structs. */
    public static class Buffer extends StructBuffer<XrRoomLayoutFB, Buffer> implements NativeResource {

        private static final XrRoomLayoutFB ELEMENT_FACTORY = XrRoomLayoutFB.create(-1L);

        /**
         * Creates a new {@code XrRoomLayoutFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRoomLayoutFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected XrRoomLayoutFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrRoomLayoutFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrRoomLayoutFB.nnext(address()); }
        /** @return a {@link XrUuidEXT} view of the {@code floorUuid} field. */
        public XrUuidEXT floorUuid() { return XrRoomLayoutFB.nfloorUuid(address()); }
        /** @return a {@link XrUuidEXT} view of the {@code ceilingUuid} field. */
        public XrUuidEXT ceilingUuid() { return XrRoomLayoutFB.nceilingUuid(address()); }
        /** @return the value of the {@code wallUuidCapacityInput} field. */
        @NativeType("uint32_t")
        public int wallUuidCapacityInput() { return XrRoomLayoutFB.nwallUuidCapacityInput(address()); }
        /** @return the value of the {@code wallUuidCountOutput} field. */
        @NativeType("uint32_t")
        public int wallUuidCountOutput() { return XrRoomLayoutFB.nwallUuidCountOutput(address()); }
        /** @return a {@link XrUuidEXT.Buffer} view of the struct array pointed to by the {@code wallUuids} field. */
        @NativeType("XrUuidEXT *")
        public XrUuidEXT.@Nullable Buffer wallUuids() { return XrRoomLayoutFB.nwallUuids(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrRoomLayoutFB.Buffer type(@NativeType("XrStructureType") int value) { XrRoomLayoutFB.ntype(address(), value); return this; }
        /** Sets the {@link FBScene#XR_TYPE_ROOM_LAYOUT_FB TYPE_ROOM_LAYOUT_FB} value to the {@code type} field. */
        public XrRoomLayoutFB.Buffer type$Default() { return type(FBScene.XR_TYPE_ROOM_LAYOUT_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrRoomLayoutFB.Buffer next(@NativeType("void const *") long value) { XrRoomLayoutFB.nnext(address(), value); return this; }
        /** Copies the specified {@link XrUuidEXT} to the {@code floorUuid} field. */
        public XrRoomLayoutFB.Buffer floorUuid(XrUuidEXT value) { XrRoomLayoutFB.nfloorUuid(address(), value); return this; }
        /** Passes the {@code floorUuid} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrRoomLayoutFB.Buffer floorUuid(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(floorUuid()); return this; }
        /** Copies the specified {@link XrUuidEXT} to the {@code ceilingUuid} field. */
        public XrRoomLayoutFB.Buffer ceilingUuid(XrUuidEXT value) { XrRoomLayoutFB.nceilingUuid(address(), value); return this; }
        /** Passes the {@code ceilingUuid} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrRoomLayoutFB.Buffer ceilingUuid(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(ceilingUuid()); return this; }
        /** Sets the specified value to the {@code wallUuidCapacityInput} field. */
        public XrRoomLayoutFB.Buffer wallUuidCapacityInput(@NativeType("uint32_t") int value) { XrRoomLayoutFB.nwallUuidCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code wallUuidCountOutput} field. */
        public XrRoomLayoutFB.Buffer wallUuidCountOutput(@NativeType("uint32_t") int value) { XrRoomLayoutFB.nwallUuidCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrUuidEXT.Buffer} to the {@code wallUuids} field. */
        public XrRoomLayoutFB.Buffer wallUuids(@NativeType("XrUuidEXT *") XrUuidEXT.@Nullable Buffer value) { XrRoomLayoutFB.nwallUuids(address(), value); return this; }

    }

}