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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrCompositionLayerCubeKHR {
 *     XrStructureType type;
 *     void const * next;
 *     XrCompositionLayerFlags layerFlags;
 *     XrSpace space;
 *     XrEyeVisibility eyeVisibility;
 *     XrSwapchain swapchain;
 *     uint32_t imageArrayIndex;
 *     {@link XrQuaternionf XrQuaternionf} orientation;
 * }</code></pre>
 */
public class XrCompositionLayerCubeKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LAYERFLAGS,
        SPACE,
        EYEVISIBILITY,
        SWAPCHAIN,
        IMAGEARRAYINDEX,
        ORIENTATION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(XrQuaternionf.SIZEOF, XrQuaternionf.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LAYERFLAGS = layout.offsetof(2);
        SPACE = layout.offsetof(3);
        EYEVISIBILITY = layout.offsetof(4);
        SWAPCHAIN = layout.offsetof(5);
        IMAGEARRAYINDEX = layout.offsetof(6);
        ORIENTATION = layout.offsetof(7);
    }

    /**
     * Creates a {@code XrCompositionLayerCubeKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCompositionLayerCubeKHR(ByteBuffer container) {
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
    /** @return the value of the {@code layerFlags} field. */
    @NativeType("XrCompositionLayerFlags")
    public long layerFlags() { return nlayerFlags(address()); }
    /** @return the value of the {@code space} field. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** @return the value of the {@code eyeVisibility} field. */
    @NativeType("XrEyeVisibility")
    public int eyeVisibility() { return neyeVisibility(address()); }
    /** @return the value of the {@code swapchain} field. */
    @NativeType("XrSwapchain")
    public long swapchain() { return nswapchain(address()); }
    /** @return the value of the {@code imageArrayIndex} field. */
    @NativeType("uint32_t")
    public int imageArrayIndex() { return nimageArrayIndex(address()); }
    /** @return a {@link XrQuaternionf} view of the {@code orientation} field. */
    public XrQuaternionf orientation() { return norientation(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrCompositionLayerCubeKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrCompositionLayerCubeKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code layerFlags} field. */
    public XrCompositionLayerCubeKHR layerFlags(@NativeType("XrCompositionLayerFlags") long value) { nlayerFlags(address(), value); return this; }
    /** Sets the specified value to the {@code space} field. */
    public XrCompositionLayerCubeKHR space(XrSpace value) { nspace(address(), value); return this; }
    /** Sets the specified value to the {@code eyeVisibility} field. */
    public XrCompositionLayerCubeKHR eyeVisibility(@NativeType("XrEyeVisibility") int value) { neyeVisibility(address(), value); return this; }
    /** Sets the specified value to the {@code swapchain} field. */
    public XrCompositionLayerCubeKHR swapchain(XrSwapchain value) { nswapchain(address(), value); return this; }
    /** Sets the specified value to the {@code imageArrayIndex} field. */
    public XrCompositionLayerCubeKHR imageArrayIndex(@NativeType("uint32_t") int value) { nimageArrayIndex(address(), value); return this; }
    /** Copies the specified {@link XrQuaternionf} to the {@code orientation} field. */
    public XrCompositionLayerCubeKHR orientation(XrQuaternionf value) { norientation(address(), value); return this; }
    /** Passes the {@code orientation} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerCubeKHR orientation(java.util.function.Consumer<XrQuaternionf> consumer) { consumer.accept(orientation()); return this; }

    /** Initializes this struct with the specified values. */
    public XrCompositionLayerCubeKHR set(
        int type,
        long next,
        long layerFlags,
        XrSpace space,
        int eyeVisibility,
        XrSwapchain swapchain,
        int imageArrayIndex,
        XrQuaternionf orientation
    ) {
        type(type);
        next(next);
        layerFlags(layerFlags);
        space(space);
        eyeVisibility(eyeVisibility);
        swapchain(swapchain);
        imageArrayIndex(imageArrayIndex);
        orientation(orientation);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCompositionLayerCubeKHR set(XrCompositionLayerCubeKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerCubeKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerCubeKHR malloc() {
        return wrap(XrCompositionLayerCubeKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerCubeKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerCubeKHR calloc() {
        return wrap(XrCompositionLayerCubeKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerCubeKHR} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerCubeKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrCompositionLayerCubeKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerCubeKHR} instance for the specified memory address. */
    public static XrCompositionLayerCubeKHR create(long address) {
        return wrap(XrCompositionLayerCubeKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerCubeKHR createSafe(long address) {
        return address == NULL ? null : wrap(XrCompositionLayerCubeKHR.class, address);
    }

    /**
     * Returns a new {@link XrCompositionLayerCubeKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerCubeKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerCubeKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerCubeKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerCubeKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerCubeKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrCompositionLayerCubeKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerCubeKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerCubeKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerCubeKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrCompositionLayerCubeKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrCompositionLayerCubeKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrCompositionLayerCubeKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrCompositionLayerCubeKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerCubeKHR mallocStack(MemoryStack stack) {
        return wrap(XrCompositionLayerCubeKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrCompositionLayerCubeKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerCubeKHR callocStack(MemoryStack stack) {
        return wrap(XrCompositionLayerCubeKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrCompositionLayerCubeKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerCubeKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrCompositionLayerCubeKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerCubeKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrCompositionLayerCubeKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerCubeKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerCubeKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerCubeKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerCubeKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerCubeKHR.NEXT); }
    /** Unsafe version of {@link #layerFlags}. */
    public static long nlayerFlags(long struct) { return UNSAFE.getLong(null, struct + XrCompositionLayerCubeKHR.LAYERFLAGS); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrCompositionLayerCubeKHR.SPACE); }
    /** Unsafe version of {@link #eyeVisibility}. */
    public static int neyeVisibility(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerCubeKHR.EYEVISIBILITY); }
    /** Unsafe version of {@link #swapchain}. */
    public static long nswapchain(long struct) { return memGetAddress(struct + XrCompositionLayerCubeKHR.SWAPCHAIN); }
    /** Unsafe version of {@link #imageArrayIndex}. */
    public static int nimageArrayIndex(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerCubeKHR.IMAGEARRAYINDEX); }
    /** Unsafe version of {@link #orientation}. */
    public static XrQuaternionf norientation(long struct) { return XrQuaternionf.create(struct + XrCompositionLayerCubeKHR.ORIENTATION); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerCubeKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerCubeKHR.NEXT, value); }
    /** Unsafe version of {@link #layerFlags(long) layerFlags}. */
    public static void nlayerFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrCompositionLayerCubeKHR.LAYERFLAGS, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrCompositionLayerCubeKHR.SPACE, value.address()); }
    /** Unsafe version of {@link #eyeVisibility(int) eyeVisibility}. */
    public static void neyeVisibility(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerCubeKHR.EYEVISIBILITY, value); }
    /** Unsafe version of {@link #swapchain(XrSwapchain) swapchain}. */
    public static void nswapchain(long struct, XrSwapchain value) { memPutAddress(struct + XrCompositionLayerCubeKHR.SWAPCHAIN, value.address()); }
    /** Unsafe version of {@link #imageArrayIndex(int) imageArrayIndex}. */
    public static void nimageArrayIndex(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerCubeKHR.IMAGEARRAYINDEX, value); }
    /** Unsafe version of {@link #orientation(XrQuaternionf) orientation}. */
    public static void norientation(long struct, XrQuaternionf value) { memCopy(value.address(), struct + XrCompositionLayerCubeKHR.ORIENTATION, XrQuaternionf.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrCompositionLayerCubeKHR.SPACE));
        check(memGetAddress(struct + XrCompositionLayerCubeKHR.SWAPCHAIN));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link XrCompositionLayerCubeKHR} structs. */
    public static class Buffer extends StructBuffer<XrCompositionLayerCubeKHR, Buffer> implements NativeResource {

        private static final XrCompositionLayerCubeKHR ELEMENT_FACTORY = XrCompositionLayerCubeKHR.create(-1L);

        /**
         * Creates a new {@code XrCompositionLayerCubeKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerCubeKHR#SIZEOF}, and its mark will be undefined.
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
        protected XrCompositionLayerCubeKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerCubeKHR.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrCompositionLayerCubeKHR.nnext(address()); }
        /** @return the value of the {@code layerFlags} field. */
        @NativeType("XrCompositionLayerFlags")
        public long layerFlags() { return XrCompositionLayerCubeKHR.nlayerFlags(address()); }
        /** @return the value of the {@code space} field. */
        @NativeType("XrSpace")
        public long space() { return XrCompositionLayerCubeKHR.nspace(address()); }
        /** @return the value of the {@code eyeVisibility} field. */
        @NativeType("XrEyeVisibility")
        public int eyeVisibility() { return XrCompositionLayerCubeKHR.neyeVisibility(address()); }
        /** @return the value of the {@code swapchain} field. */
        @NativeType("XrSwapchain")
        public long swapchain() { return XrCompositionLayerCubeKHR.nswapchain(address()); }
        /** @return the value of the {@code imageArrayIndex} field. */
        @NativeType("uint32_t")
        public int imageArrayIndex() { return XrCompositionLayerCubeKHR.nimageArrayIndex(address()); }
        /** @return a {@link XrQuaternionf} view of the {@code orientation} field. */
        public XrQuaternionf orientation() { return XrCompositionLayerCubeKHR.norientation(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrCompositionLayerCubeKHR.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerCubeKHR.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrCompositionLayerCubeKHR.Buffer next(@NativeType("void const *") long value) { XrCompositionLayerCubeKHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code layerFlags} field. */
        public XrCompositionLayerCubeKHR.Buffer layerFlags(@NativeType("XrCompositionLayerFlags") long value) { XrCompositionLayerCubeKHR.nlayerFlags(address(), value); return this; }
        /** Sets the specified value to the {@code space} field. */
        public XrCompositionLayerCubeKHR.Buffer space(XrSpace value) { XrCompositionLayerCubeKHR.nspace(address(), value); return this; }
        /** Sets the specified value to the {@code eyeVisibility} field. */
        public XrCompositionLayerCubeKHR.Buffer eyeVisibility(@NativeType("XrEyeVisibility") int value) { XrCompositionLayerCubeKHR.neyeVisibility(address(), value); return this; }
        /** Sets the specified value to the {@code swapchain} field. */
        public XrCompositionLayerCubeKHR.Buffer swapchain(XrSwapchain value) { XrCompositionLayerCubeKHR.nswapchain(address(), value); return this; }
        /** Sets the specified value to the {@code imageArrayIndex} field. */
        public XrCompositionLayerCubeKHR.Buffer imageArrayIndex(@NativeType("uint32_t") int value) { XrCompositionLayerCubeKHR.nimageArrayIndex(address(), value); return this; }
        /** Copies the specified {@link XrQuaternionf} to the {@code orientation} field. */
        public XrCompositionLayerCubeKHR.Buffer orientation(XrQuaternionf value) { XrCompositionLayerCubeKHR.norientation(address(), value); return this; }
        /** Passes the {@code orientation} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerCubeKHR.Buffer orientation(java.util.function.Consumer<XrQuaternionf> consumer) { consumer.accept(orientation()); return this; }

    }

}