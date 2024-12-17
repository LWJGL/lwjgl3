/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct aiLight {
 *     {@link AIString struct aiString} mName;
 *     aiLightSourceType mType;
 *     {@link AIVector3D struct aiVector3D} mPosition;
 *     {@link AIVector3D struct aiVector3D} mDirection;
 *     {@link AIVector3D struct aiVector3D} mUp;
 *     float mAttenuationConstant;
 *     float mAttenuationLinear;
 *     float mAttenuationQuadratic;
 *     {@link AIColor3D struct aiColor3D} mColorDiffuse;
 *     {@link AIColor3D struct aiColor3D} mColorSpecular;
 *     {@link AIColor3D struct aiColor3D} mColorAmbient;
 *     float mAngleInnerCone;
 *     float mAngleOuterCone;
 *     {@link AIVector2D struct aiVector2D} mSize;
 * }}</pre>
 */
@NativeType("struct aiLight")
public class AILight extends Struct<AILight> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MNAME,
        MTYPE,
        MPOSITION,
        MDIRECTION,
        MUP,
        MATTENUATIONCONSTANT,
        MATTENUATIONLINEAR,
        MATTENUATIONQUADRATIC,
        MCOLORDIFFUSE,
        MCOLORSPECULAR,
        MCOLORAMBIENT,
        MANGLEINNERCONE,
        MANGLEOUTERCONE,
        MSIZE;

    static {
        Layout layout = __struct(
            __member(AIString.SIZEOF, AIString.ALIGNOF),
            __member(4),
            __member(AIVector3D.SIZEOF, AIVector3D.ALIGNOF),
            __member(AIVector3D.SIZEOF, AIVector3D.ALIGNOF),
            __member(AIVector3D.SIZEOF, AIVector3D.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(AIColor3D.SIZEOF, AIColor3D.ALIGNOF),
            __member(AIColor3D.SIZEOF, AIColor3D.ALIGNOF),
            __member(AIColor3D.SIZEOF, AIColor3D.ALIGNOF),
            __member(4),
            __member(4),
            __member(AIVector2D.SIZEOF, AIVector2D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MNAME = layout.offsetof(0);
        MTYPE = layout.offsetof(1);
        MPOSITION = layout.offsetof(2);
        MDIRECTION = layout.offsetof(3);
        MUP = layout.offsetof(4);
        MATTENUATIONCONSTANT = layout.offsetof(5);
        MATTENUATIONLINEAR = layout.offsetof(6);
        MATTENUATIONQUADRATIC = layout.offsetof(7);
        MCOLORDIFFUSE = layout.offsetof(8);
        MCOLORSPECULAR = layout.offsetof(9);
        MCOLORAMBIENT = layout.offsetof(10);
        MANGLEINNERCONE = layout.offsetof(11);
        MANGLEOUTERCONE = layout.offsetof(12);
        MSIZE = layout.offsetof(13);
    }

    protected AILight(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected AILight create(long address, @Nullable ByteBuffer container) {
        return new AILight(address, container);
    }

    /**
     * Creates a {@code AILight} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AILight(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link AIString} view of the {@code mName} field. */
    @NativeType("struct aiString")
    public AIString mName() { return nmName(address()); }
    /** @return the value of the {@code mType} field. */
    @NativeType("aiLightSourceType")
    public int mType() { return nmType(address()); }
    /** @return a {@link AIVector3D} view of the {@code mPosition} field. */
    @NativeType("struct aiVector3D")
    public AIVector3D mPosition() { return nmPosition(address()); }
    /** @return a {@link AIVector3D} view of the {@code mDirection} field. */
    @NativeType("struct aiVector3D")
    public AIVector3D mDirection() { return nmDirection(address()); }
    /** @return a {@link AIVector3D} view of the {@code mUp} field. */
    @NativeType("struct aiVector3D")
    public AIVector3D mUp() { return nmUp(address()); }
    /** @return the value of the {@code mAttenuationConstant} field. */
    public float mAttenuationConstant() { return nmAttenuationConstant(address()); }
    /** @return the value of the {@code mAttenuationLinear} field. */
    public float mAttenuationLinear() { return nmAttenuationLinear(address()); }
    /** @return the value of the {@code mAttenuationQuadratic} field. */
    public float mAttenuationQuadratic() { return nmAttenuationQuadratic(address()); }
    /** @return a {@link AIColor3D} view of the {@code mColorDiffuse} field. */
    @NativeType("struct aiColor3D")
    public AIColor3D mColorDiffuse() { return nmColorDiffuse(address()); }
    /** @return a {@link AIColor3D} view of the {@code mColorSpecular} field. */
    @NativeType("struct aiColor3D")
    public AIColor3D mColorSpecular() { return nmColorSpecular(address()); }
    /** @return a {@link AIColor3D} view of the {@code mColorAmbient} field. */
    @NativeType("struct aiColor3D")
    public AIColor3D mColorAmbient() { return nmColorAmbient(address()); }
    /** @return the value of the {@code mAngleInnerCone} field. */
    public float mAngleInnerCone() { return nmAngleInnerCone(address()); }
    /** @return the value of the {@code mAngleOuterCone} field. */
    public float mAngleOuterCone() { return nmAngleOuterCone(address()); }
    /** @return a {@link AIVector2D} view of the {@code mSize} field. */
    @NativeType("struct aiVector2D")
    public AIVector2D mSize() { return nmSize(address()); }

    // -----------------------------------

    /** Returns a new {@code AILight} instance for the specified memory address. */
    public static AILight create(long address) {
        return new AILight(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable AILight createSafe(long address) {
        return address == NULL ? null : new AILight(address, null);
    }

    /**
     * Create a {@link AILight.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AILight.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static AILight.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mName}. */
    public static AIString nmName(long struct) { return AIString.create(struct + AILight.MNAME); }
    /** Unsafe version of {@link #mType}. */
    public static int nmType(long struct) { return memGetInt(struct + AILight.MTYPE); }
    /** Unsafe version of {@link #mPosition}. */
    public static AIVector3D nmPosition(long struct) { return AIVector3D.create(struct + AILight.MPOSITION); }
    /** Unsafe version of {@link #mDirection}. */
    public static AIVector3D nmDirection(long struct) { return AIVector3D.create(struct + AILight.MDIRECTION); }
    /** Unsafe version of {@link #mUp}. */
    public static AIVector3D nmUp(long struct) { return AIVector3D.create(struct + AILight.MUP); }
    /** Unsafe version of {@link #mAttenuationConstant}. */
    public static float nmAttenuationConstant(long struct) { return memGetFloat(struct + AILight.MATTENUATIONCONSTANT); }
    /** Unsafe version of {@link #mAttenuationLinear}. */
    public static float nmAttenuationLinear(long struct) { return memGetFloat(struct + AILight.MATTENUATIONLINEAR); }
    /** Unsafe version of {@link #mAttenuationQuadratic}. */
    public static float nmAttenuationQuadratic(long struct) { return memGetFloat(struct + AILight.MATTENUATIONQUADRATIC); }
    /** Unsafe version of {@link #mColorDiffuse}. */
    public static AIColor3D nmColorDiffuse(long struct) { return AIColor3D.create(struct + AILight.MCOLORDIFFUSE); }
    /** Unsafe version of {@link #mColorSpecular}. */
    public static AIColor3D nmColorSpecular(long struct) { return AIColor3D.create(struct + AILight.MCOLORSPECULAR); }
    /** Unsafe version of {@link #mColorAmbient}. */
    public static AIColor3D nmColorAmbient(long struct) { return AIColor3D.create(struct + AILight.MCOLORAMBIENT); }
    /** Unsafe version of {@link #mAngleInnerCone}. */
    public static float nmAngleInnerCone(long struct) { return memGetFloat(struct + AILight.MANGLEINNERCONE); }
    /** Unsafe version of {@link #mAngleOuterCone}. */
    public static float nmAngleOuterCone(long struct) { return memGetFloat(struct + AILight.MANGLEOUTERCONE); }
    /** Unsafe version of {@link #mSize}. */
    public static AIVector2D nmSize(long struct) { return AIVector2D.create(struct + AILight.MSIZE); }

    // -----------------------------------

    /** An array of {@link AILight} structs. */
    public static class Buffer extends StructBuffer<AILight, Buffer> {

        private static final AILight ELEMENT_FACTORY = AILight.create(-1L);

        /**
         * Creates a new {@code AILight.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AILight#SIZEOF}, and its mark will be undefined.</p>
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
        protected AILight getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link AIString} view of the {@code mName} field. */
        @NativeType("struct aiString")
        public AIString mName() { return AILight.nmName(address()); }
        /** @return the value of the {@code mType} field. */
        @NativeType("aiLightSourceType")
        public int mType() { return AILight.nmType(address()); }
        /** @return a {@link AIVector3D} view of the {@code mPosition} field. */
        @NativeType("struct aiVector3D")
        public AIVector3D mPosition() { return AILight.nmPosition(address()); }
        /** @return a {@link AIVector3D} view of the {@code mDirection} field. */
        @NativeType("struct aiVector3D")
        public AIVector3D mDirection() { return AILight.nmDirection(address()); }
        /** @return a {@link AIVector3D} view of the {@code mUp} field. */
        @NativeType("struct aiVector3D")
        public AIVector3D mUp() { return AILight.nmUp(address()); }
        /** @return the value of the {@code mAttenuationConstant} field. */
        public float mAttenuationConstant() { return AILight.nmAttenuationConstant(address()); }
        /** @return the value of the {@code mAttenuationLinear} field. */
        public float mAttenuationLinear() { return AILight.nmAttenuationLinear(address()); }
        /** @return the value of the {@code mAttenuationQuadratic} field. */
        public float mAttenuationQuadratic() { return AILight.nmAttenuationQuadratic(address()); }
        /** @return a {@link AIColor3D} view of the {@code mColorDiffuse} field. */
        @NativeType("struct aiColor3D")
        public AIColor3D mColorDiffuse() { return AILight.nmColorDiffuse(address()); }
        /** @return a {@link AIColor3D} view of the {@code mColorSpecular} field. */
        @NativeType("struct aiColor3D")
        public AIColor3D mColorSpecular() { return AILight.nmColorSpecular(address()); }
        /** @return a {@link AIColor3D} view of the {@code mColorAmbient} field. */
        @NativeType("struct aiColor3D")
        public AIColor3D mColorAmbient() { return AILight.nmColorAmbient(address()); }
        /** @return the value of the {@code mAngleInnerCone} field. */
        public float mAngleInnerCone() { return AILight.nmAngleInnerCone(address()); }
        /** @return the value of the {@code mAngleOuterCone} field. */
        public float mAngleOuterCone() { return AILight.nmAngleOuterCone(address()); }
        /** @return a {@link AIVector2D} view of the {@code mSize} field. */
        @NativeType("struct aiVector2D")
        public AIVector2D mSize() { return AILight.nmSize(address()); }

    }

}