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
 * struct XrSoundFieldConfigBD {
 *     XrStructureType type;
 *     void const * next;
 *     XrBool32 enabled;
 *     {@link XrQuaternionf XrQuaternionf} orientation;
 *     XrSpace baseSpace;
 *     float mainVolume;
 *     float lfeGain;
 * }</code></pre>
 */
public class XrSoundFieldConfigBD extends Struct<XrSoundFieldConfigBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ENABLED,
        ORIENTATION,
        BASESPACE,
        MAINVOLUME,
        LFEGAIN;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(XrQuaternionf.SIZEOF, XrQuaternionf.ALIGNOF),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ENABLED = layout.offsetof(2);
        ORIENTATION = layout.offsetof(3);
        BASESPACE = layout.offsetof(4);
        MAINVOLUME = layout.offsetof(5);
        LFEGAIN = layout.offsetof(6);
    }

    protected XrSoundFieldConfigBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSoundFieldConfigBD create(long address, @Nullable ByteBuffer container) {
        return new XrSoundFieldConfigBD(address, container);
    }

    /**
     * Creates a {@code XrSoundFieldConfigBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSoundFieldConfigBD(ByteBuffer container) {
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
    /** @return a {@link XrQuaternionf} view of the {@code orientation} field. */
    public XrQuaternionf orientation() { return norientation(address()); }
    /** @return the value of the {@code baseSpace} field. */
    @NativeType("XrSpace")
    public long baseSpace() { return nbaseSpace(address()); }
    /** @return the value of the {@code mainVolume} field. */
    public float mainVolume() { return nmainVolume(address()); }
    /** @return the value of the {@code lfeGain} field. */
    public float lfeGain() { return nlfeGain(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSoundFieldConfigBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialAudioRendering#XR_TYPE_SOUND_FIELD_CONFIG_BD TYPE_SOUND_FIELD_CONFIG_BD} value to the {@code type} field. */
    public XrSoundFieldConfigBD type$Default() { return type(BDSpatialAudioRendering.XR_TYPE_SOUND_FIELD_CONFIG_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSoundFieldConfigBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrSoundFieldChannelDefinitionAmbixBD} value to the {@code next} chain. */
    public XrSoundFieldConfigBD next(XrSoundFieldChannelDefinitionAmbixBD value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSoundFieldChannelDefinitionFumaBD} value to the {@code next} chain. */
    public XrSoundFieldConfigBD next(XrSoundFieldChannelDefinitionFumaBD value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSoundFieldChannelDefinitionSurroundBD} value to the {@code next} chain. */
    public XrSoundFieldConfigBD next(XrSoundFieldChannelDefinitionSurroundBD value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@code enabled} field. */
    public XrSoundFieldConfigBD enabled(@NativeType("XrBool32") boolean value) { nenabled(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link XrQuaternionf} to the {@code orientation} field. */
    public XrSoundFieldConfigBD orientation(XrQuaternionf value) { norientation(address(), value); return this; }
    /** Passes the {@code orientation} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSoundFieldConfigBD orientation(java.util.function.Consumer<XrQuaternionf> consumer) { consumer.accept(orientation()); return this; }
    /** Sets the specified value to the {@code baseSpace} field. */
    public XrSoundFieldConfigBD baseSpace(XrSpace value) { nbaseSpace(address(), value); return this; }
    /** Sets the specified value to the {@code mainVolume} field. */
    public XrSoundFieldConfigBD mainVolume(float value) { nmainVolume(address(), value); return this; }
    /** Sets the specified value to the {@code lfeGain} field. */
    public XrSoundFieldConfigBD lfeGain(float value) { nlfeGain(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSoundFieldConfigBD set(
        int type,
        long next,
        boolean enabled,
        XrQuaternionf orientation,
        XrSpace baseSpace,
        float mainVolume,
        float lfeGain
    ) {
        type(type);
        next(next);
        enabled(enabled);
        orientation(orientation);
        baseSpace(baseSpace);
        mainVolume(mainVolume);
        lfeGain(lfeGain);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSoundFieldConfigBD set(XrSoundFieldConfigBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSoundFieldConfigBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSoundFieldConfigBD malloc() {
        return new XrSoundFieldConfigBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSoundFieldConfigBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSoundFieldConfigBD calloc() {
        return new XrSoundFieldConfigBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSoundFieldConfigBD} instance allocated with {@link BufferUtils}. */
    public static XrSoundFieldConfigBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSoundFieldConfigBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSoundFieldConfigBD} instance for the specified memory address. */
    public static XrSoundFieldConfigBD create(long address) {
        return new XrSoundFieldConfigBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSoundFieldConfigBD createSafe(long address) {
        return address == NULL ? null : new XrSoundFieldConfigBD(address, null);
    }

    /**
     * Returns a new {@link XrSoundFieldConfigBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundFieldConfigBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSoundFieldConfigBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundFieldConfigBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSoundFieldConfigBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundFieldConfigBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSoundFieldConfigBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSoundFieldConfigBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSoundFieldConfigBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSoundFieldConfigBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSoundFieldConfigBD malloc(MemoryStack stack) {
        return new XrSoundFieldConfigBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSoundFieldConfigBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSoundFieldConfigBD calloc(MemoryStack stack) {
        return new XrSoundFieldConfigBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSoundFieldConfigBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSoundFieldConfigBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSoundFieldConfigBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSoundFieldConfigBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSoundFieldConfigBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSoundFieldConfigBD.NEXT); }
    /** Unsafe version of {@link #enabled}. */
    public static int nenabled(long struct) { return memGetInt(struct + XrSoundFieldConfigBD.ENABLED); }
    /** Unsafe version of {@link #orientation}. */
    public static XrQuaternionf norientation(long struct) { return XrQuaternionf.create(struct + XrSoundFieldConfigBD.ORIENTATION); }
    /** Unsafe version of {@link #baseSpace}. */
    public static long nbaseSpace(long struct) { return memGetAddress(struct + XrSoundFieldConfigBD.BASESPACE); }
    /** Unsafe version of {@link #mainVolume}. */
    public static float nmainVolume(long struct) { return memGetFloat(struct + XrSoundFieldConfigBD.MAINVOLUME); }
    /** Unsafe version of {@link #lfeGain}. */
    public static float nlfeGain(long struct) { return memGetFloat(struct + XrSoundFieldConfigBD.LFEGAIN); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSoundFieldConfigBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSoundFieldConfigBD.NEXT, value); }
    /** Unsafe version of {@link #enabled(boolean) enabled}. */
    public static void nenabled(long struct, int value) { memPutInt(struct + XrSoundFieldConfigBD.ENABLED, value); }
    /** Unsafe version of {@link #orientation(XrQuaternionf) orientation}. */
    public static void norientation(long struct, XrQuaternionf value) { memCopy(value.address(), struct + XrSoundFieldConfigBD.ORIENTATION, XrQuaternionf.SIZEOF); }
    /** Unsafe version of {@link #baseSpace(XrSpace) baseSpace}. */
    public static void nbaseSpace(long struct, XrSpace value) { memPutAddress(struct + XrSoundFieldConfigBD.BASESPACE, value.address()); }
    /** Unsafe version of {@link #mainVolume(float) mainVolume}. */
    public static void nmainVolume(long struct, float value) { memPutFloat(struct + XrSoundFieldConfigBD.MAINVOLUME, value); }
    /** Unsafe version of {@link #lfeGain(float) lfeGain}. */
    public static void nlfeGain(long struct, float value) { memPutFloat(struct + XrSoundFieldConfigBD.LFEGAIN, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSoundFieldConfigBD.BASESPACE));
    }

    // -----------------------------------

    /** An array of {@link XrSoundFieldConfigBD} structs. */
    public static class Buffer extends StructBuffer<XrSoundFieldConfigBD, Buffer> implements NativeResource {

        private static final XrSoundFieldConfigBD ELEMENT_FACTORY = XrSoundFieldConfigBD.create(-1L);

        /**
         * Creates a new {@code XrSoundFieldConfigBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSoundFieldConfigBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSoundFieldConfigBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSoundFieldConfigBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSoundFieldConfigBD.nnext(address()); }
        /** @return the value of the {@code enabled} field. */
        @NativeType("XrBool32")
        public boolean enabled() { return XrSoundFieldConfigBD.nenabled(address()) != 0; }
        /** @return a {@link XrQuaternionf} view of the {@code orientation} field. */
        public XrQuaternionf orientation() { return XrSoundFieldConfigBD.norientation(address()); }
        /** @return the value of the {@code baseSpace} field. */
        @NativeType("XrSpace")
        public long baseSpace() { return XrSoundFieldConfigBD.nbaseSpace(address()); }
        /** @return the value of the {@code mainVolume} field. */
        public float mainVolume() { return XrSoundFieldConfigBD.nmainVolume(address()); }
        /** @return the value of the {@code lfeGain} field. */
        public float lfeGain() { return XrSoundFieldConfigBD.nlfeGain(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSoundFieldConfigBD.Buffer type(@NativeType("XrStructureType") int value) { XrSoundFieldConfigBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialAudioRendering#XR_TYPE_SOUND_FIELD_CONFIG_BD TYPE_SOUND_FIELD_CONFIG_BD} value to the {@code type} field. */
        public XrSoundFieldConfigBD.Buffer type$Default() { return type(BDSpatialAudioRendering.XR_TYPE_SOUND_FIELD_CONFIG_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSoundFieldConfigBD.Buffer next(@NativeType("void const *") long value) { XrSoundFieldConfigBD.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrSoundFieldChannelDefinitionAmbixBD} value to the {@code next} chain. */
        public XrSoundFieldConfigBD.Buffer next(XrSoundFieldChannelDefinitionAmbixBD value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSoundFieldChannelDefinitionFumaBD} value to the {@code next} chain. */
        public XrSoundFieldConfigBD.Buffer next(XrSoundFieldChannelDefinitionFumaBD value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSoundFieldChannelDefinitionSurroundBD} value to the {@code next} chain. */
        public XrSoundFieldConfigBD.Buffer next(XrSoundFieldChannelDefinitionSurroundBD value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@code enabled} field. */
        public XrSoundFieldConfigBD.Buffer enabled(@NativeType("XrBool32") boolean value) { XrSoundFieldConfigBD.nenabled(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link XrQuaternionf} to the {@code orientation} field. */
        public XrSoundFieldConfigBD.Buffer orientation(XrQuaternionf value) { XrSoundFieldConfigBD.norientation(address(), value); return this; }
        /** Passes the {@code orientation} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSoundFieldConfigBD.Buffer orientation(java.util.function.Consumer<XrQuaternionf> consumer) { consumer.accept(orientation()); return this; }
        /** Sets the specified value to the {@code baseSpace} field. */
        public XrSoundFieldConfigBD.Buffer baseSpace(XrSpace value) { XrSoundFieldConfigBD.nbaseSpace(address(), value); return this; }
        /** Sets the specified value to the {@code mainVolume} field. */
        public XrSoundFieldConfigBD.Buffer mainVolume(float value) { XrSoundFieldConfigBD.nmainVolume(address(), value); return this; }
        /** Sets the specified value to the {@code lfeGain} field. */
        public XrSoundFieldConfigBD.Buffer lfeGain(float value) { XrSoundFieldConfigBD.nlfeGain(address(), value); return this; }

    }

}