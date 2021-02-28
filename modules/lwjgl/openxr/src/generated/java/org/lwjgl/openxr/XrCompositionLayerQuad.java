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
 * struct XrCompositionLayerQuad {
 *     XrStructureType type;
 *     void const * next;
 *     XrCompositionLayerFlags layerFlags;
 *     XrSpace space;
 *     XrEyeVisibility eyeVisibility;
 *     {@link XrSwapchainSubImage XrSwapchainSubImage} subImage;
 *     {@link XrPosef XrPosef} pose;
 *     {@link XrExtent2Df XrExtent2Df} size;
 * }</code></pre>
 */
public class XrCompositionLayerQuad extends Struct implements NativeResource {

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
        SUBIMAGE,
        POSE,
        SIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE),
            __member(4),
            __member(XrSwapchainSubImage.SIZEOF, XrSwapchainSubImage.ALIGNOF),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(XrExtent2Df.SIZEOF, XrExtent2Df.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LAYERFLAGS = layout.offsetof(2);
        SPACE = layout.offsetof(3);
        EYEVISIBILITY = layout.offsetof(4);
        SUBIMAGE = layout.offsetof(5);
        POSE = layout.offsetof(6);
        SIZE = layout.offsetof(7);
    }

    /**
     * Creates a {@code XrCompositionLayerQuad} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCompositionLayerQuad(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** Returns the value of the {@code layerFlags} field. */
    @NativeType("XrCompositionLayerFlags")
    public long layerFlags() { return nlayerFlags(address()); }
    /** Returns the value of the {@code space} field. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** Returns the value of the {@code eyeVisibility} field. */
    @NativeType("XrEyeVisibility")
    public int eyeVisibility() { return neyeVisibility(address()); }
    /** Returns a {@link XrSwapchainSubImage} view of the {@code subImage} field. */
    public XrSwapchainSubImage subImage() { return nsubImage(address()); }
    /** Returns a {@link XrPosef} view of the {@code pose} field. */
    public XrPosef pose() { return npose(address()); }
    /** Returns a {@link XrExtent2Df} view of the {@code size} field. */
    public XrExtent2Df size() { return nsize(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrCompositionLayerQuad type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrCompositionLayerQuad next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code layerFlags} field. */
    public XrCompositionLayerQuad layerFlags(@NativeType("XrCompositionLayerFlags") long value) { nlayerFlags(address(), value); return this; }
    /** Sets the specified value to the {@code space} field. */
    public XrCompositionLayerQuad space(XrSpace value) { nspace(address(), value); return this; }
    /** Sets the specified value to the {@code eyeVisibility} field. */
    public XrCompositionLayerQuad eyeVisibility(@NativeType("XrEyeVisibility") int value) { neyeVisibility(address(), value); return this; }
    /** Copies the specified {@link XrSwapchainSubImage} to the {@code subImage} field. */
    public XrCompositionLayerQuad subImage(XrSwapchainSubImage value) { nsubImage(address(), value); return this; }
    /** Passes the {@code subImage} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerQuad subImage(java.util.function.Consumer<XrSwapchainSubImage> consumer) { consumer.accept(subImage()); return this; }
    /** Copies the specified {@link XrPosef} to the {@code pose} field. */
    public XrCompositionLayerQuad pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerQuad pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
    /** Copies the specified {@link XrExtent2Df} to the {@code size} field. */
    public XrCompositionLayerQuad size(XrExtent2Df value) { nsize(address(), value); return this; }
    /** Passes the {@code size} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerQuad size(java.util.function.Consumer<XrExtent2Df> consumer) { consumer.accept(size()); return this; }

    /** Initializes this struct with the specified values. */
    public XrCompositionLayerQuad set(
        int type,
        long next,
        long layerFlags,
        XrSpace space,
        int eyeVisibility,
        XrSwapchainSubImage subImage,
        XrPosef pose,
        XrExtent2Df size
    ) {
        type(type);
        next(next);
        layerFlags(layerFlags);
        space(space);
        eyeVisibility(eyeVisibility);
        subImage(subImage);
        pose(pose);
        size(size);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCompositionLayerQuad set(XrCompositionLayerQuad src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerQuad} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerQuad malloc() {
        return wrap(XrCompositionLayerQuad.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerQuad} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerQuad calloc() {
        return wrap(XrCompositionLayerQuad.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerQuad} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerQuad create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrCompositionLayerQuad.class, memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerQuad} instance for the specified memory address. */
    public static XrCompositionLayerQuad create(long address) {
        return wrap(XrCompositionLayerQuad.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerQuad createSafe(long address) {
        return address == NULL ? null : wrap(XrCompositionLayerQuad.class, address);
    }

    /**
     * Returns a new {@link XrCompositionLayerQuad.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerQuad.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerQuad.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerQuad.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerQuad.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerQuad.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrCompositionLayerQuad.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerQuad.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerQuad.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerQuad} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrCompositionLayerQuad mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrCompositionLayerQuad} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrCompositionLayerQuad callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrCompositionLayerQuad} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerQuad mallocStack(MemoryStack stack) {
        return wrap(XrCompositionLayerQuad.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrCompositionLayerQuad} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerQuad callocStack(MemoryStack stack) {
        return wrap(XrCompositionLayerQuad.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrCompositionLayerQuad.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerQuad.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrCompositionLayerQuad.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerQuad.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrCompositionLayerQuad.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerQuad.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerQuad.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerQuad.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerQuad.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerQuad.NEXT); }
    /** Unsafe version of {@link #layerFlags}. */
    public static long nlayerFlags(long struct) { return UNSAFE.getLong(null, struct + XrCompositionLayerQuad.LAYERFLAGS); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrCompositionLayerQuad.SPACE); }
    /** Unsafe version of {@link #eyeVisibility}. */
    public static int neyeVisibility(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerQuad.EYEVISIBILITY); }
    /** Unsafe version of {@link #subImage}. */
    public static XrSwapchainSubImage nsubImage(long struct) { return XrSwapchainSubImage.create(struct + XrCompositionLayerQuad.SUBIMAGE); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrCompositionLayerQuad.POSE); }
    /** Unsafe version of {@link #size}. */
    public static XrExtent2Df nsize(long struct) { return XrExtent2Df.create(struct + XrCompositionLayerQuad.SIZE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerQuad.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerQuad.NEXT, check(value)); }
    /** Unsafe version of {@link #layerFlags(long) layerFlags}. */
    public static void nlayerFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrCompositionLayerQuad.LAYERFLAGS, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrCompositionLayerQuad.SPACE, value.address()); }
    /** Unsafe version of {@link #eyeVisibility(int) eyeVisibility}. */
    public static void neyeVisibility(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerQuad.EYEVISIBILITY, value); }
    /** Unsafe version of {@link #subImage(XrSwapchainSubImage) subImage}. */
    public static void nsubImage(long struct, XrSwapchainSubImage value) { memCopy(value.address(), struct + XrCompositionLayerQuad.SUBIMAGE, XrSwapchainSubImage.SIZEOF); }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrCompositionLayerQuad.POSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #size(XrExtent2Df) size}. */
    public static void nsize(long struct, XrExtent2Df value) { memCopy(value.address(), struct + XrCompositionLayerQuad.SIZE, XrExtent2Df.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrCompositionLayerQuad.NEXT));
        check(memGetAddress(struct + XrCompositionLayerQuad.SPACE));
        XrSwapchainSubImage.validate(struct + XrCompositionLayerQuad.SUBIMAGE);
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

    /** An array of {@link XrCompositionLayerQuad} structs. */
    public static class Buffer extends StructBuffer<XrCompositionLayerQuad, Buffer> implements NativeResource {

        private static final XrCompositionLayerQuad ELEMENT_FACTORY = XrCompositionLayerQuad.create(-1L);

        /**
         * Creates a new {@code XrCompositionLayerQuad.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerQuad#SIZEOF}, and its mark will be undefined.
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
        protected XrCompositionLayerQuad getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerQuad.ntype(address()); }
        /** Returns the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrCompositionLayerQuad.nnext(address()); }
        /** Returns the value of the {@code layerFlags} field. */
        @NativeType("XrCompositionLayerFlags")
        public long layerFlags() { return XrCompositionLayerQuad.nlayerFlags(address()); }
        /** Returns the value of the {@code space} field. */
        @NativeType("XrSpace")
        public long space() { return XrCompositionLayerQuad.nspace(address()); }
        /** Returns the value of the {@code eyeVisibility} field. */
        @NativeType("XrEyeVisibility")
        public int eyeVisibility() { return XrCompositionLayerQuad.neyeVisibility(address()); }
        /** Returns a {@link XrSwapchainSubImage} view of the {@code subImage} field. */
        public XrSwapchainSubImage subImage() { return XrCompositionLayerQuad.nsubImage(address()); }
        /** Returns a {@link XrPosef} view of the {@code pose} field. */
        public XrPosef pose() { return XrCompositionLayerQuad.npose(address()); }
        /** Returns a {@link XrExtent2Df} view of the {@code size} field. */
        public XrExtent2Df size() { return XrCompositionLayerQuad.nsize(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrCompositionLayerQuad.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerQuad.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrCompositionLayerQuad.Buffer next(@NativeType("void const *") long value) { XrCompositionLayerQuad.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code layerFlags} field. */
        public XrCompositionLayerQuad.Buffer layerFlags(@NativeType("XrCompositionLayerFlags") long value) { XrCompositionLayerQuad.nlayerFlags(address(), value); return this; }
        /** Sets the specified value to the {@code space} field. */
        public XrCompositionLayerQuad.Buffer space(XrSpace value) { XrCompositionLayerQuad.nspace(address(), value); return this; }
        /** Sets the specified value to the {@code eyeVisibility} field. */
        public XrCompositionLayerQuad.Buffer eyeVisibility(@NativeType("XrEyeVisibility") int value) { XrCompositionLayerQuad.neyeVisibility(address(), value); return this; }
        /** Copies the specified {@link XrSwapchainSubImage} to the {@code subImage} field. */
        public XrCompositionLayerQuad.Buffer subImage(XrSwapchainSubImage value) { XrCompositionLayerQuad.nsubImage(address(), value); return this; }
        /** Passes the {@code subImage} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerQuad.Buffer subImage(java.util.function.Consumer<XrSwapchainSubImage> consumer) { consumer.accept(subImage()); return this; }
        /** Copies the specified {@link XrPosef} to the {@code pose} field. */
        public XrCompositionLayerQuad.Buffer pose(XrPosef value) { XrCompositionLayerQuad.npose(address(), value); return this; }
        /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerQuad.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
        /** Copies the specified {@link XrExtent2Df} to the {@code size} field. */
        public XrCompositionLayerQuad.Buffer size(XrExtent2Df value) { XrCompositionLayerQuad.nsize(address(), value); return this; }
        /** Passes the {@code size} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerQuad.Buffer size(java.util.function.Consumer<XrExtent2Df> consumer) { consumer.accept(size()); return this; }

    }

}