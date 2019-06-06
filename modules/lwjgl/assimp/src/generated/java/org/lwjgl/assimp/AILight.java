/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Helper structure to describe a light source.
 * 
 * <p>Assimp supports multiple sorts of light sources, including directional, point and spot lights. All of them are defined with just a single structure and
 * distinguished by their parameters. Note - some file formats (such as 3DS, ASE) export a "target point" - the point a spot light is looking at (it can
 * even be animated). Assimp writes the target point as a subnode of a spotlights's main node, called "&lt;spotName&gt;.Target". However, this is just
 * additional information then, the transformation tracks of the main node make the spot light already point in the right direction.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mName} &ndash; 
 * The name of the light source. There must be a node in the scenegraph with the same name. This node specifies the position of the light in the scene
 * hierarchy and can be animated.</li>
 * <li>{@code mType} &ndash; The type of the light source. {@link Assimp#aiLightSource_UNDEFINED LightSource_UNDEFINED} is not a valid value for this member. One of:<br><table><tr><td>{@link Assimp#aiLightSource_DIRECTIONAL LightSource_DIRECTIONAL}</td><td>{@link Assimp#aiLightSource_POINT LightSource_POINT}</td><td>{@link Assimp#aiLightSource_SPOT LightSource_SPOT}</td><td>{@link Assimp#aiLightSource_AMBIENT LightSource_AMBIENT}</td></tr><tr><td>{@link Assimp#aiLightSource_AREA LightSource_AREA}</td></tr></table></li>
 * <li>{@code mPosition} &ndash; 
 * Position of the light source in space. Relative to the transformation of the node corresponding to the light. The position is undefined for directional
 * lights.</li>
 * <li>{@code mDirection} &ndash; 
 * Direction of the light source in space. Relative to the transformation of the node corresponding to the light. The direction is undefined for point
 * lights. The vector may be normalized, but it needn't.</li>
 * <li>{@code mUp} &ndash; 
 * Up direction of the light source in space. Relative to the transformation of the node corresponding to the light. The direction is undefined for point
 * lights. The vector may be normalized, but it needn't.</li>
 * <li>{@code mAttenuationConstant} &ndash; 
 * Constant light attenuation factor. The intensity of the light source at a given distance 'd' from the light's position is
 * {@code Atten = 1/( att0 + att1 * d + att2 * d*d)}. This member corresponds to the att0 variable in the equation. Naturally undefined for directional
 * lights.</li>
 * <li>{@code mAttenuationLinear} &ndash; 
 * Linear light attenuation factor. The intensity of the light source at a given distance 'd' from the light's position is
 * {@code Atten = 1/( att0 + att1 * d + att2 * d*d)}. This member corresponds to the att1 variable in the equation. Naturally undefined for directional
 * lights.</li>
 * <li>{@code mAttenuationQuadratic} &ndash; 
 * Quadratic light attenuation factor. The intensity of the light source at a given distance 'd' from the light's position is
 * {@code Atten = 1/( att0 + att1 * d + att2 * d*d)}. This member corresponds to the att2 variable in the equation. Naturally undefined for directional
 * lights.</li>
 * <li>{@code mColorDiffuse} &ndash; 
 * Diffuse color of the light source. The diffuse light color is multiplied with the diffuse material color to obtain the final color that contributes to
 * the diffuse shading term.</li>
 * <li>{@code mColorSpecular} &ndash; 
 * Specular color of the light source. The specular light color is multiplied with the specular material color to obtain the final color that contributes
 * to the specular shading term.</li>
 * <li>{@code mColorAmbient} &ndash; 
 * Ambient color of the light source. The ambient light color is multiplied with the ambient material color to obtain the final color that contributes to
 * the ambient shading term. Most renderers will ignore this value it, is just a remaining of the fixed-function pipeline that is still supported by quite
 * many file formats.</li>
 * <li>{@code mAngleInnerCone} &ndash; 
 * Inner angle of a spot light's light cone. The spot light has maximum influence on objects inside this angle. The angle is given in radians. It is 2PI
 * for point lights and undefined for directional lights.</li>
 * <li>{@code mAngleOuterCone} &ndash; 
 * Outer angle of a spot light's light cone. The spot light does not affect objects outside this angle. The angle is given in radians. It is 2PI for point
 * lights and undefined for directional lights. The outer angle must be greater than or equal to the inner angle. It is assumed that the application uses
 * a smooth interpolation between the inner and the outer cone of the spot light.</li>
 * <li>{@code mSize} &ndash; Size of area light source.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
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
 * }</code></pre>
 */
@NativeType("struct aiLight")
public class AILight extends Struct {

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

    /** Returns a {@link AIString} view of the {@code mName} field. */
    @NativeType("struct aiString")
    public AIString mName() { return nmName(address()); }
    /** Returns the value of the {@code mType} field. */
    @NativeType("aiLightSourceType")
    public int mType() { return nmType(address()); }
    /** Returns a {@link AIVector3D} view of the {@code mPosition} field. */
    @NativeType("struct aiVector3D")
    public AIVector3D mPosition() { return nmPosition(address()); }
    /** Returns a {@link AIVector3D} view of the {@code mDirection} field. */
    @NativeType("struct aiVector3D")
    public AIVector3D mDirection() { return nmDirection(address()); }
    /** Returns a {@link AIVector3D} view of the {@code mUp} field. */
    @NativeType("struct aiVector3D")
    public AIVector3D mUp() { return nmUp(address()); }
    /** Returns the value of the {@code mAttenuationConstant} field. */
    public float mAttenuationConstant() { return nmAttenuationConstant(address()); }
    /** Returns the value of the {@code mAttenuationLinear} field. */
    public float mAttenuationLinear() { return nmAttenuationLinear(address()); }
    /** Returns the value of the {@code mAttenuationQuadratic} field. */
    public float mAttenuationQuadratic() { return nmAttenuationQuadratic(address()); }
    /** Returns a {@link AIColor3D} view of the {@code mColorDiffuse} field. */
    @NativeType("struct aiColor3D")
    public AIColor3D mColorDiffuse() { return nmColorDiffuse(address()); }
    /** Returns a {@link AIColor3D} view of the {@code mColorSpecular} field. */
    @NativeType("struct aiColor3D")
    public AIColor3D mColorSpecular() { return nmColorSpecular(address()); }
    /** Returns a {@link AIColor3D} view of the {@code mColorAmbient} field. */
    @NativeType("struct aiColor3D")
    public AIColor3D mColorAmbient() { return nmColorAmbient(address()); }
    /** Returns the value of the {@code mAngleInnerCone} field. */
    public float mAngleInnerCone() { return nmAngleInnerCone(address()); }
    /** Returns the value of the {@code mAngleOuterCone} field. */
    public float mAngleOuterCone() { return nmAngleOuterCone(address()); }
    /** Returns a {@link AIVector2D} view of the {@code mSize} field. */
    @NativeType("struct aiVector2D")
    public AIVector2D mSize() { return nmSize(address()); }

    // -----------------------------------

    /** Returns a new {@code AILight} instance for the specified memory address. */
    public static AILight create(long address) {
        return wrap(AILight.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AILight createSafe(long address) {
        return address == NULL ? null : wrap(AILight.class, address);
    }

    /**
     * Create a {@link AILight.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AILight.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AILight.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mName}. */
    public static AIString nmName(long struct) { return AIString.create(struct + AILight.MNAME); }
    /** Unsafe version of {@link #mType}. */
    public static int nmType(long struct) { return UNSAFE.getInt(null, struct + AILight.MTYPE); }
    /** Unsafe version of {@link #mPosition}. */
    public static AIVector3D nmPosition(long struct) { return AIVector3D.create(struct + AILight.MPOSITION); }
    /** Unsafe version of {@link #mDirection}. */
    public static AIVector3D nmDirection(long struct) { return AIVector3D.create(struct + AILight.MDIRECTION); }
    /** Unsafe version of {@link #mUp}. */
    public static AIVector3D nmUp(long struct) { return AIVector3D.create(struct + AILight.MUP); }
    /** Unsafe version of {@link #mAttenuationConstant}. */
    public static float nmAttenuationConstant(long struct) { return UNSAFE.getFloat(null, struct + AILight.MATTENUATIONCONSTANT); }
    /** Unsafe version of {@link #mAttenuationLinear}. */
    public static float nmAttenuationLinear(long struct) { return UNSAFE.getFloat(null, struct + AILight.MATTENUATIONLINEAR); }
    /** Unsafe version of {@link #mAttenuationQuadratic}. */
    public static float nmAttenuationQuadratic(long struct) { return UNSAFE.getFloat(null, struct + AILight.MATTENUATIONQUADRATIC); }
    /** Unsafe version of {@link #mColorDiffuse}. */
    public static AIColor3D nmColorDiffuse(long struct) { return AIColor3D.create(struct + AILight.MCOLORDIFFUSE); }
    /** Unsafe version of {@link #mColorSpecular}. */
    public static AIColor3D nmColorSpecular(long struct) { return AIColor3D.create(struct + AILight.MCOLORSPECULAR); }
    /** Unsafe version of {@link #mColorAmbient}. */
    public static AIColor3D nmColorAmbient(long struct) { return AIColor3D.create(struct + AILight.MCOLORAMBIENT); }
    /** Unsafe version of {@link #mAngleInnerCone}. */
    public static float nmAngleInnerCone(long struct) { return UNSAFE.getFloat(null, struct + AILight.MANGLEINNERCONE); }
    /** Unsafe version of {@link #mAngleOuterCone}. */
    public static float nmAngleOuterCone(long struct) { return UNSAFE.getFloat(null, struct + AILight.MANGLEOUTERCONE); }
    /** Unsafe version of {@link #mSize}. */
    public static AIVector2D nmSize(long struct) { return AIVector2D.create(struct + AILight.MSIZE); }

    // -----------------------------------

    /** An array of {@link AILight} structs. */
    public static class Buffer extends StructBuffer<AILight, Buffer> {

        private static final AILight ELEMENT_FACTORY = AILight.create(-1L);

        /**
         * Creates a new {@code AILight.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AILight#SIZEOF}, and its mark will be undefined.
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
        protected AILight getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link AIString} view of the {@code mName} field. */
        @NativeType("struct aiString")
        public AIString mName() { return AILight.nmName(address()); }
        /** Returns the value of the {@code mType} field. */
        @NativeType("aiLightSourceType")
        public int mType() { return AILight.nmType(address()); }
        /** Returns a {@link AIVector3D} view of the {@code mPosition} field. */
        @NativeType("struct aiVector3D")
        public AIVector3D mPosition() { return AILight.nmPosition(address()); }
        /** Returns a {@link AIVector3D} view of the {@code mDirection} field. */
        @NativeType("struct aiVector3D")
        public AIVector3D mDirection() { return AILight.nmDirection(address()); }
        /** Returns a {@link AIVector3D} view of the {@code mUp} field. */
        @NativeType("struct aiVector3D")
        public AIVector3D mUp() { return AILight.nmUp(address()); }
        /** Returns the value of the {@code mAttenuationConstant} field. */
        public float mAttenuationConstant() { return AILight.nmAttenuationConstant(address()); }
        /** Returns the value of the {@code mAttenuationLinear} field. */
        public float mAttenuationLinear() { return AILight.nmAttenuationLinear(address()); }
        /** Returns the value of the {@code mAttenuationQuadratic} field. */
        public float mAttenuationQuadratic() { return AILight.nmAttenuationQuadratic(address()); }
        /** Returns a {@link AIColor3D} view of the {@code mColorDiffuse} field. */
        @NativeType("struct aiColor3D")
        public AIColor3D mColorDiffuse() { return AILight.nmColorDiffuse(address()); }
        /** Returns a {@link AIColor3D} view of the {@code mColorSpecular} field. */
        @NativeType("struct aiColor3D")
        public AIColor3D mColorSpecular() { return AILight.nmColorSpecular(address()); }
        /** Returns a {@link AIColor3D} view of the {@code mColorAmbient} field. */
        @NativeType("struct aiColor3D")
        public AIColor3D mColorAmbient() { return AILight.nmColorAmbient(address()); }
        /** Returns the value of the {@code mAngleInnerCone} field. */
        public float mAngleInnerCone() { return AILight.nmAngleInnerCone(address()); }
        /** Returns the value of the {@code mAngleOuterCone} field. */
        public float mAngleOuterCone() { return AILight.nmAngleOuterCone(address()); }
        /** Returns a {@link AIVector2D} view of the {@code mSize} field. */
        @NativeType("struct aiVector2D")
        public AIVector2D mSize() { return AILight.nmSize(address()); }

    }

}