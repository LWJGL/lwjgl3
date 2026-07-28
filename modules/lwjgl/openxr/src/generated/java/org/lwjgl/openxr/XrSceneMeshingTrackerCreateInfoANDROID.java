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
 * struct XrSceneMeshingTrackerCreateInfoANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrSceneMeshSemanticLabelSetANDROID semanticLabelSet;
 *     XrBool32 enableNormals;
 * }}</pre>
 */
public class XrSceneMeshingTrackerCreateInfoANDROID extends Struct<XrSceneMeshingTrackerCreateInfoANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SEMANTICLABELSET,
        ENABLENORMALS;

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
        SEMANTICLABELSET = layout.offsetof(2);
        ENABLENORMALS = layout.offsetof(3);
    }

    protected XrSceneMeshingTrackerCreateInfoANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSceneMeshingTrackerCreateInfoANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSceneMeshingTrackerCreateInfoANDROID(address, container);
    }

    /**
     * Creates a {@code XrSceneMeshingTrackerCreateInfoANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneMeshingTrackerCreateInfoANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code semanticLabelSet} field. */
    @NativeType("XrSceneMeshSemanticLabelSetANDROID")
    public int semanticLabelSet() { return nsemanticLabelSet(address()); }
    /** @return the value of the {@code enableNormals} field. */
    @NativeType("XrBool32")
    public boolean enableNormals() { return nenableNormals(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSceneMeshingTrackerCreateInfoANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDSceneMeshing#XR_TYPE_SCENE_MESHING_TRACKER_CREATE_INFO_ANDROID TYPE_SCENE_MESHING_TRACKER_CREATE_INFO_ANDROID} value to the {@code type} field. */
    public XrSceneMeshingTrackerCreateInfoANDROID type$Default() { return type(ANDROIDSceneMeshing.XR_TYPE_SCENE_MESHING_TRACKER_CREATE_INFO_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSceneMeshingTrackerCreateInfoANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code semanticLabelSet} field. */
    public XrSceneMeshingTrackerCreateInfoANDROID semanticLabelSet(@NativeType("XrSceneMeshSemanticLabelSetANDROID") int value) { nsemanticLabelSet(address(), value); return this; }
    /** Sets the specified value to the {@code enableNormals} field. */
    public XrSceneMeshingTrackerCreateInfoANDROID enableNormals(@NativeType("XrBool32") boolean value) { nenableNormals(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneMeshingTrackerCreateInfoANDROID set(
        int type,
        long next,
        int semanticLabelSet,
        boolean enableNormals
    ) {
        type(type);
        next(next);
        semanticLabelSet(semanticLabelSet);
        enableNormals(enableNormals);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSceneMeshingTrackerCreateInfoANDROID set(XrSceneMeshingTrackerCreateInfoANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneMeshingTrackerCreateInfoANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneMeshingTrackerCreateInfoANDROID malloc() {
        return new XrSceneMeshingTrackerCreateInfoANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSceneMeshingTrackerCreateInfoANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneMeshingTrackerCreateInfoANDROID calloc() {
        return new XrSceneMeshingTrackerCreateInfoANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSceneMeshingTrackerCreateInfoANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSceneMeshingTrackerCreateInfoANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSceneMeshingTrackerCreateInfoANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSceneMeshingTrackerCreateInfoANDROID} instance for the specified memory address. */
    public static XrSceneMeshingTrackerCreateInfoANDROID create(long address) {
        return new XrSceneMeshingTrackerCreateInfoANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSceneMeshingTrackerCreateInfoANDROID createSafe(long address) {
        return address == NULL ? null : new XrSceneMeshingTrackerCreateInfoANDROID(address, null);
    }

    /**
     * Returns a new {@link XrSceneMeshingTrackerCreateInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshingTrackerCreateInfoANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneMeshingTrackerCreateInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshingTrackerCreateInfoANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneMeshingTrackerCreateInfoANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshingTrackerCreateInfoANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSceneMeshingTrackerCreateInfoANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshingTrackerCreateInfoANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSceneMeshingTrackerCreateInfoANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSceneMeshingTrackerCreateInfoANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneMeshingTrackerCreateInfoANDROID malloc(MemoryStack stack) {
        return new XrSceneMeshingTrackerCreateInfoANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSceneMeshingTrackerCreateInfoANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneMeshingTrackerCreateInfoANDROID calloc(MemoryStack stack) {
        return new XrSceneMeshingTrackerCreateInfoANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSceneMeshingTrackerCreateInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshingTrackerCreateInfoANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneMeshingTrackerCreateInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneMeshingTrackerCreateInfoANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSceneMeshingTrackerCreateInfoANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSceneMeshingTrackerCreateInfoANDROID.NEXT); }
    /** Unsafe version of {@link #semanticLabelSet}. */
    public static int nsemanticLabelSet(long struct) { return memGetInt(struct + XrSceneMeshingTrackerCreateInfoANDROID.SEMANTICLABELSET); }
    /** Unsafe version of {@link #enableNormals}. */
    public static int nenableNormals(long struct) { return memGetInt(struct + XrSceneMeshingTrackerCreateInfoANDROID.ENABLENORMALS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSceneMeshingTrackerCreateInfoANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSceneMeshingTrackerCreateInfoANDROID.NEXT, value); }
    /** Unsafe version of {@link #semanticLabelSet(int) semanticLabelSet}. */
    public static void nsemanticLabelSet(long struct, int value) { memPutInt(struct + XrSceneMeshingTrackerCreateInfoANDROID.SEMANTICLABELSET, value); }
    /** Unsafe version of {@link #enableNormals(boolean) enableNormals}. */
    public static void nenableNormals(long struct, int value) { memPutInt(struct + XrSceneMeshingTrackerCreateInfoANDROID.ENABLENORMALS, value); }

    // -----------------------------------

    /** An array of {@link XrSceneMeshingTrackerCreateInfoANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSceneMeshingTrackerCreateInfoANDROID, Buffer> implements NativeResource {

        private static final XrSceneMeshingTrackerCreateInfoANDROID ELEMENT_FACTORY = XrSceneMeshingTrackerCreateInfoANDROID.create(-1L);

        /**
         * Creates a new {@code XrSceneMeshingTrackerCreateInfoANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneMeshingTrackerCreateInfoANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSceneMeshingTrackerCreateInfoANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSceneMeshingTrackerCreateInfoANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSceneMeshingTrackerCreateInfoANDROID.nnext(address()); }
        /** @return the value of the {@code semanticLabelSet} field. */
        @NativeType("XrSceneMeshSemanticLabelSetANDROID")
        public int semanticLabelSet() { return XrSceneMeshingTrackerCreateInfoANDROID.nsemanticLabelSet(address()); }
        /** @return the value of the {@code enableNormals} field. */
        @NativeType("XrBool32")
        public boolean enableNormals() { return XrSceneMeshingTrackerCreateInfoANDROID.nenableNormals(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSceneMeshingTrackerCreateInfoANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSceneMeshingTrackerCreateInfoANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDSceneMeshing#XR_TYPE_SCENE_MESHING_TRACKER_CREATE_INFO_ANDROID TYPE_SCENE_MESHING_TRACKER_CREATE_INFO_ANDROID} value to the {@code type} field. */
        public XrSceneMeshingTrackerCreateInfoANDROID.Buffer type$Default() { return type(ANDROIDSceneMeshing.XR_TYPE_SCENE_MESHING_TRACKER_CREATE_INFO_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSceneMeshingTrackerCreateInfoANDROID.Buffer next(@NativeType("void const *") long value) { XrSceneMeshingTrackerCreateInfoANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code semanticLabelSet} field. */
        public XrSceneMeshingTrackerCreateInfoANDROID.Buffer semanticLabelSet(@NativeType("XrSceneMeshSemanticLabelSetANDROID") int value) { XrSceneMeshingTrackerCreateInfoANDROID.nsemanticLabelSet(address(), value); return this; }
        /** Sets the specified value to the {@code enableNormals} field. */
        public XrSceneMeshingTrackerCreateInfoANDROID.Buffer enableNormals(@NativeType("XrBool32") boolean value) { XrSceneMeshingTrackerCreateInfoANDROID.nenableNormals(address(), value ? 1 : 0); return this; }

    }

}