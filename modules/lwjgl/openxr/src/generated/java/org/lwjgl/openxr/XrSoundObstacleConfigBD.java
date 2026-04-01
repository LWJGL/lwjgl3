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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct XrSoundObstacleConfigBD {
 *     XrStructureType type;
 *     void const * next;
 *     XrBool32 enabled;
 *     {@link XrPosef XrPosef} pose;
 *     XrSpace baseSpace;
 *     uint32_t materialCount;
 *     XrSoundObstacleMaterialBD * materials;
 * }</code></pre>
 */
public class XrSoundObstacleConfigBD extends Struct<XrSoundObstacleConfigBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ENABLED,
        POSE,
        BASESPACE,
        MATERIALCOUNT,
        MATERIALS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ENABLED = layout.offsetof(2);
        POSE = layout.offsetof(3);
        BASESPACE = layout.offsetof(4);
        MATERIALCOUNT = layout.offsetof(5);
        MATERIALS = layout.offsetof(6);
    }

    protected XrSoundObstacleConfigBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSoundObstacleConfigBD create(long address, @Nullable ByteBuffer container) {
        return new XrSoundObstacleConfigBD(address, container);
    }

    /**
     * Creates a {@code XrSoundObstacleConfigBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSoundObstacleConfigBD(ByteBuffer container) {
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
    /** @return the value of the {@code enabled} field. */
    @NativeType("XrBool32")
    public boolean enabled() { return nenabled(address()) != 0; }
    /** @return a {@link XrPosef} view of the {@code pose} field. */
    public XrPosef pose() { return npose(address()); }
    /** @return the value of the {@code baseSpace} field. */
    @NativeType("XrSpace")
    public long baseSpace() { return nbaseSpace(address()); }
    /** @return the value of the {@code materialCount} field. */
    @NativeType("uint32_t")
    public int materialCount() { return nmaterialCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code materials} field. */
    @NativeType("XrSoundObstacleMaterialBD *")
    public PointerBuffer materials() { return nmaterials(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSoundObstacleConfigBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialAudioRendering#XR_TYPE_SOUND_OBSTACLE_CONFIG_BD TYPE_SOUND_OBSTACLE_CONFIG_BD} value to the {@code type} field. */
    public XrSoundObstacleConfigBD type$Default() { return type(BDSpatialAudioRendering.XR_TYPE_SOUND_OBSTACLE_CONFIG_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSoundObstacleConfigBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code enabled} field. */
    public XrSoundObstacleConfigBD enabled(@NativeType("XrBool32") boolean value) { nenabled(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link XrPosef} to the {@code pose} field. */
    public XrSoundObstacleConfigBD pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSoundObstacleConfigBD pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
    /** Sets the specified value to the {@code baseSpace} field. */
    public XrSoundObstacleConfigBD baseSpace(XrSpace value) { nbaseSpace(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code materials} field. */
    public XrSoundObstacleConfigBD materials(@NativeType("XrSoundObstacleMaterialBD *") PointerBuffer value) { nmaterials(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSoundObstacleConfigBD set(
        int type,
        long next,
        boolean enabled,
        XrPosef pose,
        XrSpace baseSpace,
        PointerBuffer materials
    ) {
        type(type);
        next(next);
        enabled(enabled);
        pose(pose);
        baseSpace(baseSpace);
        materials(materials);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSoundObstacleConfigBD set(XrSoundObstacleConfigBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSoundObstacleConfigBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSoundObstacleConfigBD malloc() {
        return new XrSoundObstacleConfigBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSoundObstacleConfigBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSoundObstacleConfigBD calloc() {
        return new XrSoundObstacleConfigBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSoundObstacleConfigBD} instance allocated with {@link BufferUtils}. */
    public static XrSoundObstacleConfigBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSoundObstacleConfigBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSoundObstacleConfigBD} instance for the specified memory address. */
    public static XrSoundObstacleConfigBD create(long address) {
        return new XrSoundObstacleConfigBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSoundObstacleConfigBD createSafe(long address) {
        return address == NULL ? null : new XrSoundObstacleConfigBD(address, null);
    }

    /**
     * Returns a new {@link XrSoundObstacleConfigBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundObstacleConfigBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSoundObstacleConfigBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundObstacleConfigBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSoundObstacleConfigBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundObstacleConfigBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSoundObstacleConfigBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSoundObstacleConfigBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSoundObstacleConfigBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSoundObstacleConfigBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSoundObstacleConfigBD malloc(MemoryStack stack) {
        return new XrSoundObstacleConfigBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSoundObstacleConfigBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSoundObstacleConfigBD calloc(MemoryStack stack) {
        return new XrSoundObstacleConfigBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSoundObstacleConfigBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSoundObstacleConfigBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSoundObstacleConfigBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSoundObstacleConfigBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSoundObstacleConfigBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSoundObstacleConfigBD.NEXT); }
    /** Unsafe version of {@link #enabled}. */
    public static int nenabled(long struct) { return memGetInt(struct + XrSoundObstacleConfigBD.ENABLED); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrSoundObstacleConfigBD.POSE); }
    /** Unsafe version of {@link #baseSpace}. */
    public static long nbaseSpace(long struct) { return memGetAddress(struct + XrSoundObstacleConfigBD.BASESPACE); }
    /** Unsafe version of {@link #materialCount}. */
    public static int nmaterialCount(long struct) { return memGetInt(struct + XrSoundObstacleConfigBD.MATERIALCOUNT); }
    /** Unsafe version of {@link #materials() materials}. */
    public static PointerBuffer nmaterials(long struct) { return memPointerBuffer(memGetAddress(struct + XrSoundObstacleConfigBD.MATERIALS), nmaterialCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSoundObstacleConfigBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSoundObstacleConfigBD.NEXT, value); }
    /** Unsafe version of {@link #enabled(boolean) enabled}. */
    public static void nenabled(long struct, int value) { memPutInt(struct + XrSoundObstacleConfigBD.ENABLED, value); }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrSoundObstacleConfigBD.POSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #baseSpace(XrSpace) baseSpace}. */
    public static void nbaseSpace(long struct, XrSpace value) { memPutAddress(struct + XrSoundObstacleConfigBD.BASESPACE, value.address()); }
    /** Sets the specified value to the {@code materialCount} field of the specified {@code struct}. */
    public static void nmaterialCount(long struct, int value) { memPutInt(struct + XrSoundObstacleConfigBD.MATERIALCOUNT, value); }
    /** Unsafe version of {@link #materials(PointerBuffer) materials}. */
    public static void nmaterials(long struct, PointerBuffer value) { memPutAddress(struct + XrSoundObstacleConfigBD.MATERIALS, memAddress(value)); nmaterialCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSoundObstacleConfigBD.BASESPACE));
        check(memGetAddress(struct + XrSoundObstacleConfigBD.MATERIALS));
    }

    // -----------------------------------

    /** An array of {@link XrSoundObstacleConfigBD} structs. */
    public static class Buffer extends StructBuffer<XrSoundObstacleConfigBD, Buffer> implements NativeResource {

        private static final XrSoundObstacleConfigBD ELEMENT_FACTORY = XrSoundObstacleConfigBD.create(-1L);

        /**
         * Creates a new {@code XrSoundObstacleConfigBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSoundObstacleConfigBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSoundObstacleConfigBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSoundObstacleConfigBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSoundObstacleConfigBD.nnext(address()); }
        /** @return the value of the {@code enabled} field. */
        @NativeType("XrBool32")
        public boolean enabled() { return XrSoundObstacleConfigBD.nenabled(address()) != 0; }
        /** @return a {@link XrPosef} view of the {@code pose} field. */
        public XrPosef pose() { return XrSoundObstacleConfigBD.npose(address()); }
        /** @return the value of the {@code baseSpace} field. */
        @NativeType("XrSpace")
        public long baseSpace() { return XrSoundObstacleConfigBD.nbaseSpace(address()); }
        /** @return the value of the {@code materialCount} field. */
        @NativeType("uint32_t")
        public int materialCount() { return XrSoundObstacleConfigBD.nmaterialCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code materials} field. */
        @NativeType("XrSoundObstacleMaterialBD *")
        public PointerBuffer materials() { return XrSoundObstacleConfigBD.nmaterials(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSoundObstacleConfigBD.Buffer type(@NativeType("XrStructureType") int value) { XrSoundObstacleConfigBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialAudioRendering#XR_TYPE_SOUND_OBSTACLE_CONFIG_BD TYPE_SOUND_OBSTACLE_CONFIG_BD} value to the {@code type} field. */
        public XrSoundObstacleConfigBD.Buffer type$Default() { return type(BDSpatialAudioRendering.XR_TYPE_SOUND_OBSTACLE_CONFIG_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSoundObstacleConfigBD.Buffer next(@NativeType("void const *") long value) { XrSoundObstacleConfigBD.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code enabled} field. */
        public XrSoundObstacleConfigBD.Buffer enabled(@NativeType("XrBool32") boolean value) { XrSoundObstacleConfigBD.nenabled(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link XrPosef} to the {@code pose} field. */
        public XrSoundObstacleConfigBD.Buffer pose(XrPosef value) { XrSoundObstacleConfigBD.npose(address(), value); return this; }
        /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSoundObstacleConfigBD.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
        /** Sets the specified value to the {@code baseSpace} field. */
        public XrSoundObstacleConfigBD.Buffer baseSpace(XrSpace value) { XrSoundObstacleConfigBD.nbaseSpace(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code materials} field. */
        public XrSoundObstacleConfigBD.Buffer materials(@NativeType("XrSoundObstacleMaterialBD *") PointerBuffer value) { XrSoundObstacleConfigBD.nmaterials(address(), value); return this; }

    }

}