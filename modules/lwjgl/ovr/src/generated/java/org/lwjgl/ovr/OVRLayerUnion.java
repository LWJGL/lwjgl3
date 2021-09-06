/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Union that combines {@code ovrLayer} types in a way that allows them to be used in a polymorphic way.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * union ovrLayer_Union {
 *     {@link OVRLayerHeader ovrLayerHeader} {@link #Header};
 *     {@link OVRLayerEyeFov ovrLayerEyeFov} EyeFov;
 *     {@link OVRLayerEyeFovDepth ovrLayerEyeFovDepth} EyeFovDepth;
 *     {@link OVRLayerEyeMatrix ovrLayerEyeMatrix} EyeMatrix;
 *     {@link OVRLayerEyeFovMultires ovrLayerEyeFovMultires} Multires;
 *     {@link OVRLayerCylinder ovrLayerCylinder} Cylinder;
 *     {@link OVRLayerCube ovrLayerCube} Cube;
 *     {@link OVRLayerQuad ovrLayerQuad} Quad;
 * }</code></pre>
 */
@NativeType("union ovrLayer_Union")
public class OVRLayerUnion extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEADER,
        EYEFOV,
        EYEFOVDEPTH,
        EYEMATRIX,
        MULTIRES,
        CYLINDER,
        CUBE,
        QUAD;

    static {
        Layout layout = __union(
            __member(OVRLayerHeader.SIZEOF, OVRLayerHeader.ALIGNOF, true),
            __member(OVRLayerEyeFov.SIZEOF, OVRLayerEyeFov.ALIGNOF),
            __member(OVRLayerEyeFovDepth.SIZEOF, OVRLayerEyeFovDepth.ALIGNOF),
            __member(OVRLayerEyeMatrix.SIZEOF, OVRLayerEyeMatrix.ALIGNOF),
            __member(OVRLayerEyeFovMultires.SIZEOF, OVRLayerEyeFovMultires.ALIGNOF),
            __member(OVRLayerCylinder.SIZEOF, OVRLayerCylinder.ALIGNOF),
            __member(OVRLayerCube.SIZEOF, OVRLayerCube.ALIGNOF),
            __member(OVRLayerQuad.SIZEOF, OVRLayerQuad.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEADER = layout.offsetof(0);
        EYEFOV = layout.offsetof(1);
        EYEFOVDEPTH = layout.offsetof(2);
        EYEMATRIX = layout.offsetof(3);
        MULTIRES = layout.offsetof(4);
        CYLINDER = layout.offsetof(5);
        CUBE = layout.offsetof(6);
        QUAD = layout.offsetof(7);
    }

    /**
     * Creates a {@code OVRLayerUnion} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRLayerUnion(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the layer header */
    @NativeType("ovrLayerHeader")
    public OVRLayerHeader Header() { return nHeader(address()); }
    /** @return a {@link OVRLayerEyeFov} view of the {@code EyeFov} field. */
    @NativeType("ovrLayerEyeFov")
    public OVRLayerEyeFov EyeFov() { return nEyeFov(address()); }
    /** @return a {@link OVRLayerEyeFovDepth} view of the {@code EyeFovDepth} field. */
    @NativeType("ovrLayerEyeFovDepth")
    public OVRLayerEyeFovDepth EyeFovDepth() { return nEyeFovDepth(address()); }
    /** @return a {@link OVRLayerEyeMatrix} view of the {@code EyeMatrix} field. */
    @NativeType("ovrLayerEyeMatrix")
    public OVRLayerEyeMatrix EyeMatrix() { return nEyeMatrix(address()); }
    /** @return a {@link OVRLayerEyeFovMultires} view of the {@code Multires} field. */
    @NativeType("ovrLayerEyeFovMultires")
    public OVRLayerEyeFovMultires Multires() { return nMultires(address()); }
    /** @return a {@link OVRLayerCylinder} view of the {@code Cylinder} field. */
    @NativeType("ovrLayerCylinder")
    public OVRLayerCylinder Cylinder() { return nCylinder(address()); }
    /** @return a {@link OVRLayerCube} view of the {@code Cube} field. */
    @NativeType("ovrLayerCube")
    public OVRLayerCube Cube() { return nCube(address()); }
    /** @return a {@link OVRLayerQuad} view of the {@code Quad} field. */
    @NativeType("ovrLayerQuad")
    public OVRLayerQuad Quad() { return nQuad(address()); }

    /** Copies the specified {@link OVRLayerHeader} to the {@link #Header} field. */
    public OVRLayerUnion Header(@NativeType("ovrLayerHeader") OVRLayerHeader value) { nHeader(address(), value); return this; }
    /** Passes the {@link #Header} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerUnion Header(java.util.function.Consumer<OVRLayerHeader> consumer) { consumer.accept(Header()); return this; }
    /** Copies the specified {@link OVRLayerEyeFov} to the {@code EyeFov} field. */
    public OVRLayerUnion EyeFov(@NativeType("ovrLayerEyeFov") OVRLayerEyeFov value) { nEyeFov(address(), value); return this; }
    /** Passes the {@code EyeFov} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerUnion EyeFov(java.util.function.Consumer<OVRLayerEyeFov> consumer) { consumer.accept(EyeFov()); return this; }
    /** Copies the specified {@link OVRLayerEyeFovDepth} to the {@code EyeFovDepth} field. */
    public OVRLayerUnion EyeFovDepth(@NativeType("ovrLayerEyeFovDepth") OVRLayerEyeFovDepth value) { nEyeFovDepth(address(), value); return this; }
    /** Passes the {@code EyeFovDepth} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerUnion EyeFovDepth(java.util.function.Consumer<OVRLayerEyeFovDepth> consumer) { consumer.accept(EyeFovDepth()); return this; }
    /** Copies the specified {@link OVRLayerEyeMatrix} to the {@code EyeMatrix} field. */
    public OVRLayerUnion EyeMatrix(@NativeType("ovrLayerEyeMatrix") OVRLayerEyeMatrix value) { nEyeMatrix(address(), value); return this; }
    /** Passes the {@code EyeMatrix} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerUnion EyeMatrix(java.util.function.Consumer<OVRLayerEyeMatrix> consumer) { consumer.accept(EyeMatrix()); return this; }
    /** Copies the specified {@link OVRLayerEyeFovMultires} to the {@code Multires} field. */
    public OVRLayerUnion Multires(@NativeType("ovrLayerEyeFovMultires") OVRLayerEyeFovMultires value) { nMultires(address(), value); return this; }
    /** Passes the {@code Multires} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerUnion Multires(java.util.function.Consumer<OVRLayerEyeFovMultires> consumer) { consumer.accept(Multires()); return this; }
    /** Copies the specified {@link OVRLayerCylinder} to the {@code Cylinder} field. */
    public OVRLayerUnion Cylinder(@NativeType("ovrLayerCylinder") OVRLayerCylinder value) { nCylinder(address(), value); return this; }
    /** Passes the {@code Cylinder} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerUnion Cylinder(java.util.function.Consumer<OVRLayerCylinder> consumer) { consumer.accept(Cylinder()); return this; }
    /** Copies the specified {@link OVRLayerCube} to the {@code Cube} field. */
    public OVRLayerUnion Cube(@NativeType("ovrLayerCube") OVRLayerCube value) { nCube(address(), value); return this; }
    /** Passes the {@code Cube} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerUnion Cube(java.util.function.Consumer<OVRLayerCube> consumer) { consumer.accept(Cube()); return this; }
    /** Copies the specified {@link OVRLayerQuad} to the {@code Quad} field. */
    public OVRLayerUnion Quad(@NativeType("ovrLayerQuad") OVRLayerQuad value) { nQuad(address(), value); return this; }
    /** Passes the {@code Quad} field to the specified {@link java.util.function.Consumer Consumer}. */
    public OVRLayerUnion Quad(java.util.function.Consumer<OVRLayerQuad> consumer) { consumer.accept(Quad()); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRLayerUnion set(OVRLayerUnion src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OVRLayerUnion} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRLayerUnion malloc() {
        return wrap(OVRLayerUnion.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRLayerUnion} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRLayerUnion calloc() {
        return wrap(OVRLayerUnion.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRLayerUnion} instance allocated with {@link BufferUtils}. */
    public static OVRLayerUnion create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRLayerUnion.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRLayerUnion} instance for the specified memory address. */
    public static OVRLayerUnion create(long address) {
        return wrap(OVRLayerUnion.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRLayerUnion createSafe(long address) {
        return address == NULL ? null : wrap(OVRLayerUnion.class, address);
    }

    /**
     * Returns a new {@link OVRLayerUnion.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerUnion.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRLayerUnion.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerUnion.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerUnion.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerUnion.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRLayerUnion.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRLayerUnion.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRLayerUnion.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerUnion mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerUnion callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerUnion mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRLayerUnion callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerUnion.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerUnion.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerUnion.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRLayerUnion.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRLayerUnion} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRLayerUnion malloc(MemoryStack stack) {
        return wrap(OVRLayerUnion.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRLayerUnion} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRLayerUnion calloc(MemoryStack stack) {
        return wrap(OVRLayerUnion.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRLayerUnion.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRLayerUnion.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerUnion.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRLayerUnion.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Header}. */
    public static OVRLayerHeader nHeader(long struct) { return OVRLayerHeader.create(struct + OVRLayerUnion.HEADER); }
    /** Unsafe version of {@link #EyeFov}. */
    public static OVRLayerEyeFov nEyeFov(long struct) { return OVRLayerEyeFov.create(struct + OVRLayerUnion.EYEFOV); }
    /** Unsafe version of {@link #EyeFovDepth}. */
    public static OVRLayerEyeFovDepth nEyeFovDepth(long struct) { return OVRLayerEyeFovDepth.create(struct + OVRLayerUnion.EYEFOVDEPTH); }
    /** Unsafe version of {@link #EyeMatrix}. */
    public static OVRLayerEyeMatrix nEyeMatrix(long struct) { return OVRLayerEyeMatrix.create(struct + OVRLayerUnion.EYEMATRIX); }
    /** Unsafe version of {@link #Multires}. */
    public static OVRLayerEyeFovMultires nMultires(long struct) { return OVRLayerEyeFovMultires.create(struct + OVRLayerUnion.MULTIRES); }
    /** Unsafe version of {@link #Cylinder}. */
    public static OVRLayerCylinder nCylinder(long struct) { return OVRLayerCylinder.create(struct + OVRLayerUnion.CYLINDER); }
    /** Unsafe version of {@link #Cube}. */
    public static OVRLayerCube nCube(long struct) { return OVRLayerCube.create(struct + OVRLayerUnion.CUBE); }
    /** Unsafe version of {@link #Quad}. */
    public static OVRLayerQuad nQuad(long struct) { return OVRLayerQuad.create(struct + OVRLayerUnion.QUAD); }

    /** Unsafe version of {@link #Header(OVRLayerHeader) Header}. */
    public static void nHeader(long struct, OVRLayerHeader value) { memCopy(value.address(), struct + OVRLayerUnion.HEADER, OVRLayerHeader.SIZEOF); }
    /** Unsafe version of {@link #EyeFov(OVRLayerEyeFov) EyeFov}. */
    public static void nEyeFov(long struct, OVRLayerEyeFov value) { memCopy(value.address(), struct + OVRLayerUnion.EYEFOV, OVRLayerEyeFov.SIZEOF); }
    /** Unsafe version of {@link #EyeFovDepth(OVRLayerEyeFovDepth) EyeFovDepth}. */
    public static void nEyeFovDepth(long struct, OVRLayerEyeFovDepth value) { memCopy(value.address(), struct + OVRLayerUnion.EYEFOVDEPTH, OVRLayerEyeFovDepth.SIZEOF); }
    /** Unsafe version of {@link #EyeMatrix(OVRLayerEyeMatrix) EyeMatrix}. */
    public static void nEyeMatrix(long struct, OVRLayerEyeMatrix value) { memCopy(value.address(), struct + OVRLayerUnion.EYEMATRIX, OVRLayerEyeMatrix.SIZEOF); }
    /** Unsafe version of {@link #Multires(OVRLayerEyeFovMultires) Multires}. */
    public static void nMultires(long struct, OVRLayerEyeFovMultires value) { memCopy(value.address(), struct + OVRLayerUnion.MULTIRES, OVRLayerEyeFovMultires.SIZEOF); }
    /** Unsafe version of {@link #Cylinder(OVRLayerCylinder) Cylinder}. */
    public static void nCylinder(long struct, OVRLayerCylinder value) { memCopy(value.address(), struct + OVRLayerUnion.CYLINDER, OVRLayerCylinder.SIZEOF); }
    /** Unsafe version of {@link #Cube(OVRLayerCube) Cube}. */
    public static void nCube(long struct, OVRLayerCube value) { memCopy(value.address(), struct + OVRLayerUnion.CUBE, OVRLayerCube.SIZEOF); }
    /** Unsafe version of {@link #Quad(OVRLayerQuad) Quad}. */
    public static void nQuad(long struct, OVRLayerQuad value) { memCopy(value.address(), struct + OVRLayerUnion.QUAD, OVRLayerQuad.SIZEOF); }

    // -----------------------------------

    /** An array of {@link OVRLayerUnion} structs. */
    public static class Buffer extends StructBuffer<OVRLayerUnion, Buffer> implements NativeResource {

        private static final OVRLayerUnion ELEMENT_FACTORY = OVRLayerUnion.create(-1L);

        /**
         * Creates a new {@code OVRLayerUnion.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRLayerUnion#SIZEOF}, and its mark will be undefined.
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
        protected OVRLayerUnion getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link OVRLayerHeader} view of the {@link OVRLayerUnion#Header} field. */
        @NativeType("ovrLayerHeader")
        public OVRLayerHeader Header() { return OVRLayerUnion.nHeader(address()); }
        /** @return a {@link OVRLayerEyeFov} view of the {@code EyeFov} field. */
        @NativeType("ovrLayerEyeFov")
        public OVRLayerEyeFov EyeFov() { return OVRLayerUnion.nEyeFov(address()); }
        /** @return a {@link OVRLayerEyeFovDepth} view of the {@code EyeFovDepth} field. */
        @NativeType("ovrLayerEyeFovDepth")
        public OVRLayerEyeFovDepth EyeFovDepth() { return OVRLayerUnion.nEyeFovDepth(address()); }
        /** @return a {@link OVRLayerEyeMatrix} view of the {@code EyeMatrix} field. */
        @NativeType("ovrLayerEyeMatrix")
        public OVRLayerEyeMatrix EyeMatrix() { return OVRLayerUnion.nEyeMatrix(address()); }
        /** @return a {@link OVRLayerEyeFovMultires} view of the {@code Multires} field. */
        @NativeType("ovrLayerEyeFovMultires")
        public OVRLayerEyeFovMultires Multires() { return OVRLayerUnion.nMultires(address()); }
        /** @return a {@link OVRLayerCylinder} view of the {@code Cylinder} field. */
        @NativeType("ovrLayerCylinder")
        public OVRLayerCylinder Cylinder() { return OVRLayerUnion.nCylinder(address()); }
        /** @return a {@link OVRLayerCube} view of the {@code Cube} field. */
        @NativeType("ovrLayerCube")
        public OVRLayerCube Cube() { return OVRLayerUnion.nCube(address()); }
        /** @return a {@link OVRLayerQuad} view of the {@code Quad} field. */
        @NativeType("ovrLayerQuad")
        public OVRLayerQuad Quad() { return OVRLayerUnion.nQuad(address()); }

        /** Copies the specified {@link OVRLayerHeader} to the {@link OVRLayerUnion#Header} field. */
        public OVRLayerUnion.Buffer Header(@NativeType("ovrLayerHeader") OVRLayerHeader value) { OVRLayerUnion.nHeader(address(), value); return this; }
        /** Passes the {@link OVRLayerUnion#Header} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerUnion.Buffer Header(java.util.function.Consumer<OVRLayerHeader> consumer) { consumer.accept(Header()); return this; }
        /** Copies the specified {@link OVRLayerEyeFov} to the {@code EyeFov} field. */
        public OVRLayerUnion.Buffer EyeFov(@NativeType("ovrLayerEyeFov") OVRLayerEyeFov value) { OVRLayerUnion.nEyeFov(address(), value); return this; }
        /** Passes the {@code EyeFov} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerUnion.Buffer EyeFov(java.util.function.Consumer<OVRLayerEyeFov> consumer) { consumer.accept(EyeFov()); return this; }
        /** Copies the specified {@link OVRLayerEyeFovDepth} to the {@code EyeFovDepth} field. */
        public OVRLayerUnion.Buffer EyeFovDepth(@NativeType("ovrLayerEyeFovDepth") OVRLayerEyeFovDepth value) { OVRLayerUnion.nEyeFovDepth(address(), value); return this; }
        /** Passes the {@code EyeFovDepth} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerUnion.Buffer EyeFovDepth(java.util.function.Consumer<OVRLayerEyeFovDepth> consumer) { consumer.accept(EyeFovDepth()); return this; }
        /** Copies the specified {@link OVRLayerEyeMatrix} to the {@code EyeMatrix} field. */
        public OVRLayerUnion.Buffer EyeMatrix(@NativeType("ovrLayerEyeMatrix") OVRLayerEyeMatrix value) { OVRLayerUnion.nEyeMatrix(address(), value); return this; }
        /** Passes the {@code EyeMatrix} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerUnion.Buffer EyeMatrix(java.util.function.Consumer<OVRLayerEyeMatrix> consumer) { consumer.accept(EyeMatrix()); return this; }
        /** Copies the specified {@link OVRLayerEyeFovMultires} to the {@code Multires} field. */
        public OVRLayerUnion.Buffer Multires(@NativeType("ovrLayerEyeFovMultires") OVRLayerEyeFovMultires value) { OVRLayerUnion.nMultires(address(), value); return this; }
        /** Passes the {@code Multires} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerUnion.Buffer Multires(java.util.function.Consumer<OVRLayerEyeFovMultires> consumer) { consumer.accept(Multires()); return this; }
        /** Copies the specified {@link OVRLayerCylinder} to the {@code Cylinder} field. */
        public OVRLayerUnion.Buffer Cylinder(@NativeType("ovrLayerCylinder") OVRLayerCylinder value) { OVRLayerUnion.nCylinder(address(), value); return this; }
        /** Passes the {@code Cylinder} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerUnion.Buffer Cylinder(java.util.function.Consumer<OVRLayerCylinder> consumer) { consumer.accept(Cylinder()); return this; }
        /** Copies the specified {@link OVRLayerCube} to the {@code Cube} field. */
        public OVRLayerUnion.Buffer Cube(@NativeType("ovrLayerCube") OVRLayerCube value) { OVRLayerUnion.nCube(address(), value); return this; }
        /** Passes the {@code Cube} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerUnion.Buffer Cube(java.util.function.Consumer<OVRLayerCube> consumer) { consumer.accept(Cube()); return this; }
        /** Copies the specified {@link OVRLayerQuad} to the {@code Quad} field. */
        public OVRLayerUnion.Buffer Quad(@NativeType("ovrLayerQuad") OVRLayerQuad value) { OVRLayerUnion.nQuad(address(), value); return this; }
        /** Passes the {@code Quad} field to the specified {@link java.util.function.Consumer Consumer}. */
        public OVRLayerUnion.Buffer Quad(java.util.function.Consumer<OVRLayerQuad> consumer) { consumer.accept(Quad()); return this; }

    }

}