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
 * struct XrCompositionLayerEquirectKHR {
 *     XrStructureType type;
 *     void const * next;
 *     XrCompositionLayerFlags layerFlags;
 *     XrSpace space;
 *     XrEyeVisibility eyeVisibility;
 *     {@link XrSwapchainSubImage XrSwapchainSubImage} subImage;
 *     {@link XrPosef XrPosef} pose;
 *     float radius;
 *     {@link XrVector2f XrVector2f} scale;
 *     {@link XrVector2f XrVector2f} bias;
 * }</code></pre>
 */
public class XrCompositionLayerEquirectKHR extends Struct implements NativeResource {

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
        RADIUS,
        SCALE,
        BIAS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE),
            __member(4),
            __member(XrSwapchainSubImage.SIZEOF, XrSwapchainSubImage.ALIGNOF),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(4),
            __member(XrVector2f.SIZEOF, XrVector2f.ALIGNOF),
            __member(XrVector2f.SIZEOF, XrVector2f.ALIGNOF)
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
        RADIUS = layout.offsetof(7);
        SCALE = layout.offsetof(8);
        BIAS = layout.offsetof(9);
    }

    /**
     * Creates a {@code XrCompositionLayerEquirectKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCompositionLayerEquirectKHR(ByteBuffer container) {
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
    /** @return a {@link XrSwapchainSubImage} view of the {@code subImage} field. */
    public XrSwapchainSubImage subImage() { return nsubImage(address()); }
    /** @return a {@link XrPosef} view of the {@code pose} field. */
    public XrPosef pose() { return npose(address()); }
    /** @return the value of the {@code radius} field. */
    public float radius() { return nradius(address()); }
    /** @return a {@link XrVector2f} view of the {@code scale} field. */
    public XrVector2f scale() { return nscale(address()); }
    /** @return a {@link XrVector2f} view of the {@code bias} field. */
    public XrVector2f bias() { return nbias(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrCompositionLayerEquirectKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrCompositionLayerEquirectKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code layerFlags} field. */
    public XrCompositionLayerEquirectKHR layerFlags(@NativeType("XrCompositionLayerFlags") long value) { nlayerFlags(address(), value); return this; }
    /** Sets the specified value to the {@code space} field. */
    public XrCompositionLayerEquirectKHR space(XrSpace value) { nspace(address(), value); return this; }
    /** Sets the specified value to the {@code eyeVisibility} field. */
    public XrCompositionLayerEquirectKHR eyeVisibility(@NativeType("XrEyeVisibility") int value) { neyeVisibility(address(), value); return this; }
    /** Copies the specified {@link XrSwapchainSubImage} to the {@code subImage} field. */
    public XrCompositionLayerEquirectKHR subImage(XrSwapchainSubImage value) { nsubImage(address(), value); return this; }
    /** Passes the {@code subImage} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerEquirectKHR subImage(java.util.function.Consumer<XrSwapchainSubImage> consumer) { consumer.accept(subImage()); return this; }
    /** Copies the specified {@link XrPosef} to the {@code pose} field. */
    public XrCompositionLayerEquirectKHR pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerEquirectKHR pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
    /** Sets the specified value to the {@code radius} field. */
    public XrCompositionLayerEquirectKHR radius(float value) { nradius(address(), value); return this; }
    /** Copies the specified {@link XrVector2f} to the {@code scale} field. */
    public XrCompositionLayerEquirectKHR scale(XrVector2f value) { nscale(address(), value); return this; }
    /** Passes the {@code scale} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerEquirectKHR scale(java.util.function.Consumer<XrVector2f> consumer) { consumer.accept(scale()); return this; }
    /** Copies the specified {@link XrVector2f} to the {@code bias} field. */
    public XrCompositionLayerEquirectKHR bias(XrVector2f value) { nbias(address(), value); return this; }
    /** Passes the {@code bias} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrCompositionLayerEquirectKHR bias(java.util.function.Consumer<XrVector2f> consumer) { consumer.accept(bias()); return this; }

    /** Initializes this struct with the specified values. */
    public XrCompositionLayerEquirectKHR set(
        int type,
        long next,
        long layerFlags,
        XrSpace space,
        int eyeVisibility,
        XrSwapchainSubImage subImage,
        XrPosef pose,
        float radius,
        XrVector2f scale,
        XrVector2f bias
    ) {
        type(type);
        next(next);
        layerFlags(layerFlags);
        space(space);
        eyeVisibility(eyeVisibility);
        subImage(subImage);
        pose(pose);
        radius(radius);
        scale(scale);
        bias(bias);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCompositionLayerEquirectKHR set(XrCompositionLayerEquirectKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerEquirectKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerEquirectKHR malloc() {
        return wrap(XrCompositionLayerEquirectKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerEquirectKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerEquirectKHR calloc() {
        return wrap(XrCompositionLayerEquirectKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrCompositionLayerEquirectKHR} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerEquirectKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrCompositionLayerEquirectKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerEquirectKHR} instance for the specified memory address. */
    public static XrCompositionLayerEquirectKHR create(long address) {
        return wrap(XrCompositionLayerEquirectKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerEquirectKHR createSafe(long address) {
        return address == NULL ? null : wrap(XrCompositionLayerEquirectKHR.class, address);
    }

    /**
     * Returns a new {@link XrCompositionLayerEquirectKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerEquirectKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerEquirectKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerEquirectKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerEquirectKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerEquirectKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrCompositionLayerEquirectKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerEquirectKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrCompositionLayerEquirectKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerEquirectKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrCompositionLayerEquirectKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrCompositionLayerEquirectKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrCompositionLayerEquirectKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrCompositionLayerEquirectKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerEquirectKHR mallocStack(MemoryStack stack) {
        return wrap(XrCompositionLayerEquirectKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrCompositionLayerEquirectKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerEquirectKHR callocStack(MemoryStack stack) {
        return wrap(XrCompositionLayerEquirectKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrCompositionLayerEquirectKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerEquirectKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrCompositionLayerEquirectKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerEquirectKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrCompositionLayerEquirectKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerEquirectKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerEquirectKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerEquirectKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerEquirectKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerEquirectKHR.NEXT); }
    /** Unsafe version of {@link #layerFlags}. */
    public static long nlayerFlags(long struct) { return UNSAFE.getLong(null, struct + XrCompositionLayerEquirectKHR.LAYERFLAGS); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrCompositionLayerEquirectKHR.SPACE); }
    /** Unsafe version of {@link #eyeVisibility}. */
    public static int neyeVisibility(long struct) { return UNSAFE.getInt(null, struct + XrCompositionLayerEquirectKHR.EYEVISIBILITY); }
    /** Unsafe version of {@link #subImage}. */
    public static XrSwapchainSubImage nsubImage(long struct) { return XrSwapchainSubImage.create(struct + XrCompositionLayerEquirectKHR.SUBIMAGE); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrCompositionLayerEquirectKHR.POSE); }
    /** Unsafe version of {@link #radius}. */
    public static float nradius(long struct) { return UNSAFE.getFloat(null, struct + XrCompositionLayerEquirectKHR.RADIUS); }
    /** Unsafe version of {@link #scale}. */
    public static XrVector2f nscale(long struct) { return XrVector2f.create(struct + XrCompositionLayerEquirectKHR.SCALE); }
    /** Unsafe version of {@link #bias}. */
    public static XrVector2f nbias(long struct) { return XrVector2f.create(struct + XrCompositionLayerEquirectKHR.BIAS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerEquirectKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerEquirectKHR.NEXT, value); }
    /** Unsafe version of {@link #layerFlags(long) layerFlags}. */
    public static void nlayerFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrCompositionLayerEquirectKHR.LAYERFLAGS, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrCompositionLayerEquirectKHR.SPACE, value.address()); }
    /** Unsafe version of {@link #eyeVisibility(int) eyeVisibility}. */
    public static void neyeVisibility(long struct, int value) { UNSAFE.putInt(null, struct + XrCompositionLayerEquirectKHR.EYEVISIBILITY, value); }
    /** Unsafe version of {@link #subImage(XrSwapchainSubImage) subImage}. */
    public static void nsubImage(long struct, XrSwapchainSubImage value) { memCopy(value.address(), struct + XrCompositionLayerEquirectKHR.SUBIMAGE, XrSwapchainSubImage.SIZEOF); }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrCompositionLayerEquirectKHR.POSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #radius(float) radius}. */
    public static void nradius(long struct, float value) { UNSAFE.putFloat(null, struct + XrCompositionLayerEquirectKHR.RADIUS, value); }
    /** Unsafe version of {@link #scale(XrVector2f) scale}. */
    public static void nscale(long struct, XrVector2f value) { memCopy(value.address(), struct + XrCompositionLayerEquirectKHR.SCALE, XrVector2f.SIZEOF); }
    /** Unsafe version of {@link #bias(XrVector2f) bias}. */
    public static void nbias(long struct, XrVector2f value) { memCopy(value.address(), struct + XrCompositionLayerEquirectKHR.BIAS, XrVector2f.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrCompositionLayerEquirectKHR.SPACE));
        XrSwapchainSubImage.validate(struct + XrCompositionLayerEquirectKHR.SUBIMAGE);
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

    /** An array of {@link XrCompositionLayerEquirectKHR} structs. */
    public static class Buffer extends StructBuffer<XrCompositionLayerEquirectKHR, Buffer> implements NativeResource {

        private static final XrCompositionLayerEquirectKHR ELEMENT_FACTORY = XrCompositionLayerEquirectKHR.create(-1L);

        /**
         * Creates a new {@code XrCompositionLayerEquirectKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerEquirectKHR#SIZEOF}, and its mark will be undefined.
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
        protected XrCompositionLayerEquirectKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerEquirectKHR.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrCompositionLayerEquirectKHR.nnext(address()); }
        /** @return the value of the {@code layerFlags} field. */
        @NativeType("XrCompositionLayerFlags")
        public long layerFlags() { return XrCompositionLayerEquirectKHR.nlayerFlags(address()); }
        /** @return the value of the {@code space} field. */
        @NativeType("XrSpace")
        public long space() { return XrCompositionLayerEquirectKHR.nspace(address()); }
        /** @return the value of the {@code eyeVisibility} field. */
        @NativeType("XrEyeVisibility")
        public int eyeVisibility() { return XrCompositionLayerEquirectKHR.neyeVisibility(address()); }
        /** @return a {@link XrSwapchainSubImage} view of the {@code subImage} field. */
        public XrSwapchainSubImage subImage() { return XrCompositionLayerEquirectKHR.nsubImage(address()); }
        /** @return a {@link XrPosef} view of the {@code pose} field. */
        public XrPosef pose() { return XrCompositionLayerEquirectKHR.npose(address()); }
        /** @return the value of the {@code radius} field. */
        public float radius() { return XrCompositionLayerEquirectKHR.nradius(address()); }
        /** @return a {@link XrVector2f} view of the {@code scale} field. */
        public XrVector2f scale() { return XrCompositionLayerEquirectKHR.nscale(address()); }
        /** @return a {@link XrVector2f} view of the {@code bias} field. */
        public XrVector2f bias() { return XrCompositionLayerEquirectKHR.nbias(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrCompositionLayerEquirectKHR.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerEquirectKHR.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrCompositionLayerEquirectKHR.Buffer next(@NativeType("void const *") long value) { XrCompositionLayerEquirectKHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code layerFlags} field. */
        public XrCompositionLayerEquirectKHR.Buffer layerFlags(@NativeType("XrCompositionLayerFlags") long value) { XrCompositionLayerEquirectKHR.nlayerFlags(address(), value); return this; }
        /** Sets the specified value to the {@code space} field. */
        public XrCompositionLayerEquirectKHR.Buffer space(XrSpace value) { XrCompositionLayerEquirectKHR.nspace(address(), value); return this; }
        /** Sets the specified value to the {@code eyeVisibility} field. */
        public XrCompositionLayerEquirectKHR.Buffer eyeVisibility(@NativeType("XrEyeVisibility") int value) { XrCompositionLayerEquirectKHR.neyeVisibility(address(), value); return this; }
        /** Copies the specified {@link XrSwapchainSubImage} to the {@code subImage} field. */
        public XrCompositionLayerEquirectKHR.Buffer subImage(XrSwapchainSubImage value) { XrCompositionLayerEquirectKHR.nsubImage(address(), value); return this; }
        /** Passes the {@code subImage} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerEquirectKHR.Buffer subImage(java.util.function.Consumer<XrSwapchainSubImage> consumer) { consumer.accept(subImage()); return this; }
        /** Copies the specified {@link XrPosef} to the {@code pose} field. */
        public XrCompositionLayerEquirectKHR.Buffer pose(XrPosef value) { XrCompositionLayerEquirectKHR.npose(address(), value); return this; }
        /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerEquirectKHR.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
        /** Sets the specified value to the {@code radius} field. */
        public XrCompositionLayerEquirectKHR.Buffer radius(float value) { XrCompositionLayerEquirectKHR.nradius(address(), value); return this; }
        /** Copies the specified {@link XrVector2f} to the {@code scale} field. */
        public XrCompositionLayerEquirectKHR.Buffer scale(XrVector2f value) { XrCompositionLayerEquirectKHR.nscale(address(), value); return this; }
        /** Passes the {@code scale} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerEquirectKHR.Buffer scale(java.util.function.Consumer<XrVector2f> consumer) { consumer.accept(scale()); return this; }
        /** Copies the specified {@link XrVector2f} to the {@code bias} field. */
        public XrCompositionLayerEquirectKHR.Buffer bias(XrVector2f value) { XrCompositionLayerEquirectKHR.nbias(address(), value); return this; }
        /** Passes the {@code bias} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrCompositionLayerEquirectKHR.Buffer bias(java.util.function.Consumer<XrVector2f> consumer) { consumer.accept(bias()); return this; }

    }

}