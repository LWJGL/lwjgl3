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
 * Provides additional context of a spatial entity representing a room.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure is used by the {@link FBScene#xrGetSpaceRoomLayoutFB GetSpaceRoomLayoutFB} function to provide the application with the {@link XrUuidEXT} handles representing the various surfaces of a room.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBScene XR_FB_scene} extension <b>must</b> be enabled prior to using {@link XrRoomLayoutFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBScene#XR_TYPE_ROOM_LAYOUT_FB TYPE_ROOM_LAYOUT_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>If {@code wallUuidCapacityInput} is not 0, {@code wallUuids} <b>must</b> be a pointer to an array of {@code wallUuidCapacityInput} {@link XrUuidEXT} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrUuidEXT}, {@link FBScene#xrGetSpaceRoomLayoutFB GetSpaceRoomLayoutFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrRoomLayoutFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     {@link XrUuidEXT XrUuidEXT} {@link #floorUuid};
 *     {@link XrUuidEXT XrUuidEXT} {@link #ceilingUuid};
 *     uint32_t {@link #wallUuidCapacityInput};
 *     uint32_t {@link #wallUuidCountOutput};
 *     {@link XrUuidEXT XrUuidEXT} * {@link #wallUuids};
 * }</code></pre>
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

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the UUID of the spatial entity representing the room floor */
    public XrUuidEXT floorUuid() { return nfloorUuid(address()); }
    /** the UUID of the spatial entity representing the room ceiling */
    public XrUuidEXT ceilingUuid() { return nceilingUuid(address()); }
    /** the capacity of the {@code wallUuids} array, in number of UUIDs, or 0 to indicate a request to retrieve the required capacity. */
    @NativeType("uint32_t")
    public int wallUuidCapacityInput() { return nwallUuidCapacityInput(address()); }
    /** the count of {@link XrUuidEXT} handles written, or the required capacity in the case that {@code wallUuidCapacityInput} is insufficient. */
    @NativeType("uint32_t")
    public int wallUuidCountOutput() { return nwallUuidCountOutput(address()); }
    /** a pointer to an array of {@link XrUuidEXT} handles, but can be {@code NULL} if {@code wallUuidCapacityInput} is 0. */
    @Nullable
    @NativeType("XrUuidEXT *")
    public XrUuidEXT.Buffer wallUuids() { return nwallUuids(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrRoomLayoutFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBScene#XR_TYPE_ROOM_LAYOUT_FB TYPE_ROOM_LAYOUT_FB} value to the {@link #type} field. */
    public XrRoomLayoutFB type$Default() { return type(FBScene.XR_TYPE_ROOM_LAYOUT_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrRoomLayoutFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrUuidEXT} to the {@link #floorUuid} field. */
    public XrRoomLayoutFB floorUuid(XrUuidEXT value) { nfloorUuid(address(), value); return this; }
    /** Passes the {@link #floorUuid} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrRoomLayoutFB floorUuid(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(floorUuid()); return this; }
    /** Copies the specified {@link XrUuidEXT} to the {@link #ceilingUuid} field. */
    public XrRoomLayoutFB ceilingUuid(XrUuidEXT value) { nceilingUuid(address(), value); return this; }
    /** Passes the {@link #ceilingUuid} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrRoomLayoutFB ceilingUuid(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(ceilingUuid()); return this; }
    /** Sets the specified value to the {@link #wallUuidCapacityInput} field. */
    public XrRoomLayoutFB wallUuidCapacityInput(@NativeType("uint32_t") int value) { nwallUuidCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@link #wallUuidCountOutput} field. */
    public XrRoomLayoutFB wallUuidCountOutput(@NativeType("uint32_t") int value) { nwallUuidCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrUuidEXT.Buffer} to the {@link #wallUuids} field. */
    public XrRoomLayoutFB wallUuids(@Nullable @NativeType("XrUuidEXT *") XrUuidEXT.Buffer value) { nwallUuids(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrRoomLayoutFB set(
        int type,
        long next,
        XrUuidEXT floorUuid,
        XrUuidEXT ceilingUuid,
        int wallUuidCapacityInput,
        int wallUuidCountOutput,
        @Nullable XrUuidEXT.Buffer wallUuids
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
    @Nullable
    public static XrRoomLayoutFB createSafe(long address) {
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
    @Nullable
    public static XrRoomLayoutFB.Buffer createSafe(long address, int capacity) {
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
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrRoomLayoutFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrRoomLayoutFB.NEXT); }
    /** Unsafe version of {@link #floorUuid}. */
    public static XrUuidEXT nfloorUuid(long struct) { return XrUuidEXT.create(struct + XrRoomLayoutFB.FLOORUUID); }
    /** Unsafe version of {@link #ceilingUuid}. */
    public static XrUuidEXT nceilingUuid(long struct) { return XrUuidEXT.create(struct + XrRoomLayoutFB.CEILINGUUID); }
    /** Unsafe version of {@link #wallUuidCapacityInput}. */
    public static int nwallUuidCapacityInput(long struct) { return UNSAFE.getInt(null, struct + XrRoomLayoutFB.WALLUUIDCAPACITYINPUT); }
    /** Unsafe version of {@link #wallUuidCountOutput}. */
    public static int nwallUuidCountOutput(long struct) { return UNSAFE.getInt(null, struct + XrRoomLayoutFB.WALLUUIDCOUNTOUTPUT); }
    /** Unsafe version of {@link #wallUuids}. */
    @Nullable public static XrUuidEXT.Buffer nwallUuids(long struct) { return XrUuidEXT.createSafe(memGetAddress(struct + XrRoomLayoutFB.WALLUUIDS), nwallUuidCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrRoomLayoutFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrRoomLayoutFB.NEXT, value); }
    /** Unsafe version of {@link #floorUuid(XrUuidEXT) floorUuid}. */
    public static void nfloorUuid(long struct, XrUuidEXT value) { memCopy(value.address(), struct + XrRoomLayoutFB.FLOORUUID, XrUuidEXT.SIZEOF); }
    /** Unsafe version of {@link #ceilingUuid(XrUuidEXT) ceilingUuid}. */
    public static void nceilingUuid(long struct, XrUuidEXT value) { memCopy(value.address(), struct + XrRoomLayoutFB.CEILINGUUID, XrUuidEXT.SIZEOF); }
    /** Sets the specified value to the {@code wallUuidCapacityInput} field of the specified {@code struct}. */
    public static void nwallUuidCapacityInput(long struct, int value) { UNSAFE.putInt(null, struct + XrRoomLayoutFB.WALLUUIDCAPACITYINPUT, value); }
    /** Unsafe version of {@link #wallUuidCountOutput(int) wallUuidCountOutput}. */
    public static void nwallUuidCountOutput(long struct, int value) { UNSAFE.putInt(null, struct + XrRoomLayoutFB.WALLUUIDCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #wallUuids(XrUuidEXT.Buffer) wallUuids}. */
    public static void nwallUuids(long struct, @Nullable XrUuidEXT.Buffer value) { memPutAddress(struct + XrRoomLayoutFB.WALLUUIDS, memAddressSafe(value)); if (value != null) { nwallUuidCapacityInput(struct, value.remaining()); } }

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
        protected XrRoomLayoutFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrRoomLayoutFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrRoomLayoutFB.ntype(address()); }
        /** @return the value of the {@link XrRoomLayoutFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrRoomLayoutFB.nnext(address()); }
        /** @return a {@link XrUuidEXT} view of the {@link XrRoomLayoutFB#floorUuid} field. */
        public XrUuidEXT floorUuid() { return XrRoomLayoutFB.nfloorUuid(address()); }
        /** @return a {@link XrUuidEXT} view of the {@link XrRoomLayoutFB#ceilingUuid} field. */
        public XrUuidEXT ceilingUuid() { return XrRoomLayoutFB.nceilingUuid(address()); }
        /** @return the value of the {@link XrRoomLayoutFB#wallUuidCapacityInput} field. */
        @NativeType("uint32_t")
        public int wallUuidCapacityInput() { return XrRoomLayoutFB.nwallUuidCapacityInput(address()); }
        /** @return the value of the {@link XrRoomLayoutFB#wallUuidCountOutput} field. */
        @NativeType("uint32_t")
        public int wallUuidCountOutput() { return XrRoomLayoutFB.nwallUuidCountOutput(address()); }
        /** @return a {@link XrUuidEXT.Buffer} view of the struct array pointed to by the {@link XrRoomLayoutFB#wallUuids} field. */
        @Nullable
        @NativeType("XrUuidEXT *")
        public XrUuidEXT.Buffer wallUuids() { return XrRoomLayoutFB.nwallUuids(address()); }

        /** Sets the specified value to the {@link XrRoomLayoutFB#type} field. */
        public XrRoomLayoutFB.Buffer type(@NativeType("XrStructureType") int value) { XrRoomLayoutFB.ntype(address(), value); return this; }
        /** Sets the {@link FBScene#XR_TYPE_ROOM_LAYOUT_FB TYPE_ROOM_LAYOUT_FB} value to the {@link XrRoomLayoutFB#type} field. */
        public XrRoomLayoutFB.Buffer type$Default() { return type(FBScene.XR_TYPE_ROOM_LAYOUT_FB); }
        /** Sets the specified value to the {@link XrRoomLayoutFB#next} field. */
        public XrRoomLayoutFB.Buffer next(@NativeType("void const *") long value) { XrRoomLayoutFB.nnext(address(), value); return this; }
        /** Copies the specified {@link XrUuidEXT} to the {@link XrRoomLayoutFB#floorUuid} field. */
        public XrRoomLayoutFB.Buffer floorUuid(XrUuidEXT value) { XrRoomLayoutFB.nfloorUuid(address(), value); return this; }
        /** Passes the {@link XrRoomLayoutFB#floorUuid} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrRoomLayoutFB.Buffer floorUuid(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(floorUuid()); return this; }
        /** Copies the specified {@link XrUuidEXT} to the {@link XrRoomLayoutFB#ceilingUuid} field. */
        public XrRoomLayoutFB.Buffer ceilingUuid(XrUuidEXT value) { XrRoomLayoutFB.nceilingUuid(address(), value); return this; }
        /** Passes the {@link XrRoomLayoutFB#ceilingUuid} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrRoomLayoutFB.Buffer ceilingUuid(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(ceilingUuid()); return this; }
        /** Sets the specified value to the {@link XrRoomLayoutFB#wallUuidCapacityInput} field. */
        public XrRoomLayoutFB.Buffer wallUuidCapacityInput(@NativeType("uint32_t") int value) { XrRoomLayoutFB.nwallUuidCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@link XrRoomLayoutFB#wallUuidCountOutput} field. */
        public XrRoomLayoutFB.Buffer wallUuidCountOutput(@NativeType("uint32_t") int value) { XrRoomLayoutFB.nwallUuidCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrUuidEXT.Buffer} to the {@link XrRoomLayoutFB#wallUuids} field. */
        public XrRoomLayoutFB.Buffer wallUuids(@Nullable @NativeType("XrUuidEXT *") XrUuidEXT.Buffer value) { XrRoomLayoutFB.nwallUuids(address(), value); return this; }

    }

}