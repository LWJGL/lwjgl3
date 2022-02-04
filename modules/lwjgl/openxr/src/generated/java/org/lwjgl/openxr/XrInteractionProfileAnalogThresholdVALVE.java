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
 * Interaction profile dpad binding.
 * 
 * <h5>Description</h5>
 * 
 * <p>Applications can also chain a single {@link XrInteractionProfileAnalogThresholdVALVE} structure on the next chain of any {@link XR10#xrSuggestInteractionProfileBindings SuggestInteractionProfileBindings} call. Runtimes <b>must</b> support this kind of chaining. This method of specifying analog thresholds is deprecated however, and should not be used by any new applications.</p>
 * 
 * <p>If a threshold struct is present for a given conversion, the runtime <b>must</b> use those thresholds instead of applying its own whenever it is using the binding suggested by the application.</p>
 * 
 * <p>{@code onThreshold} and {@code offThreshold} permit allow the application to specify that it wants hysteresis to be applied to the threshold operation. If {@code onThreshold} is smaller than {@code offThreshold}, the runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}.</p>
 * 
 * <p>{@code onHaptic} and {@code offHaptic} allow the application to specify that it wants automatic haptic feedback to be generated when the boolean output of the threshold operation changes from false to true or vice versa. If these fields are not NULL, the runtime <b>must</b> trigger a haptic output with the specified characteristics. If the device has multiple haptic outputs, the runtime <b>should</b> use the haptic output that is most appropriate for the specified input path.</p>
 * 
 * <p>If a suggested binding with {@code action} and {@code binding} is not in the binding list for this interaction profile, the runtime <b>must</b> return {@link XR10#XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link VALVEAnalogThreshold XR_VALVE_analog_threshold} extension <b>must</b> be enabled prior to using {@link XrInteractionProfileAnalogThresholdVALVE}</li>
 * <li>{@code type} <b>must</b> be {@link VALVEAnalogThreshold#XR_TYPE_INTERACTION_PROFILE_ANALOG_THRESHOLD_VALVE TYPE_INTERACTION_PROFILE_ANALOG_THRESHOLD_VALVE}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code action} <b>must</b> be a valid {@code XrAction} handle</li>
 * <li>If {@code onHaptic} is not {@code NULL}, {@code onHaptic} <b>must</b> be a pointer to a valid {@link XrHapticBaseHeader}-based structure. See also: {@link XrHapticVibration}</li>
 * <li>If {@code offHaptic} is not {@code NULL}, {@code offHaptic} <b>must</b> be a pointer to a valid {@link XrHapticBaseHeader}-based structure. See also: {@link XrHapticVibration}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrHapticBaseHeader}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrInteractionProfileAnalogThresholdVALVE {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrAction {@link #action};
 *     XrPath {@link #binding};
 *     float {@link #onThreshold};
 *     float {@link #offThreshold};
 *     {@link XrHapticBaseHeader XrHapticBaseHeader} const * {@link #onHaptic};
 *     {@link XrHapticBaseHeader XrHapticBaseHeader} const * {@link #offHaptic};
 * }</code></pre>
 */
public class XrInteractionProfileAnalogThresholdVALVE extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ACTION,
        BINDING,
        ONTHRESHOLD,
        OFFTHRESHOLD,
        ONHAPTIC,
        OFFHAPTIC;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ACTION = layout.offsetof(2);
        BINDING = layout.offsetof(3);
        ONTHRESHOLD = layout.offsetof(4);
        OFFTHRESHOLD = layout.offsetof(5);
        ONHAPTIC = layout.offsetof(6);
        OFFHAPTIC = layout.offsetof(7);
    }

    /**
     * Creates a {@code XrInteractionProfileAnalogThresholdVALVE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrInteractionProfileAnalogThresholdVALVE(ByteBuffer container) {
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
    /** the handle of an action in the suggested binding list. */
    @NativeType("XrAction")
    public long action() { return naction(address()); }
    /** the input path used for the specified action in the suggested binding list. */
    @NativeType("XrPath")
    public long binding() { return nbinding(address()); }
    /** the value between 0.0 and 1.0 at which the runtime <b>must</b> consider the binding to be true. The binding must remain true until the input analog value falls below {@code offThreshold}. */
    public float onThreshold() { return nonThreshold(address()); }
    /** the value between 0.0 and 1.0 at which the runtime <b>must</b> consider the binding to be false if it was previous true. */
    public float offThreshold() { return noffThreshold(address()); }
    /** the haptic output that the runtime <b>must</b> trigger when the binding changes from false to true. If this field is NULL, the runtime <b>must</b> not trigger any haptic output on the threshold. This field <b>can</b> point to any supported sub-type of {@link XrHapticBaseHeader}. */
    @Nullable
    @NativeType("XrHapticBaseHeader const *")
    public XrHapticBaseHeader onHaptic() { return nonHaptic(address()); }
    /** the haptic output that the runtime <b>must</b> trigger when the binding changes from true to false. If this field is NULL, the runtime <b>must</b> not trigger any haptic output on the threshold. This field <b>can</b> point to any supported sub-type of {@link XrHapticBaseHeader}. */
    @Nullable
    @NativeType("XrHapticBaseHeader const *")
    public XrHapticBaseHeader offHaptic() { return noffHaptic(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrInteractionProfileAnalogThresholdVALVE type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link VALVEAnalogThreshold#XR_TYPE_INTERACTION_PROFILE_ANALOG_THRESHOLD_VALVE TYPE_INTERACTION_PROFILE_ANALOG_THRESHOLD_VALVE} value to the {@link #type} field. */
    public XrInteractionProfileAnalogThresholdVALVE type$Default() { return type(VALVEAnalogThreshold.XR_TYPE_INTERACTION_PROFILE_ANALOG_THRESHOLD_VALVE); }
    /** Sets the specified value to the {@link #next} field. */
    public XrInteractionProfileAnalogThresholdVALVE next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #action} field. */
    public XrInteractionProfileAnalogThresholdVALVE action(XrAction value) { naction(address(), value); return this; }
    /** Sets the specified value to the {@link #binding} field. */
    public XrInteractionProfileAnalogThresholdVALVE binding(@NativeType("XrPath") long value) { nbinding(address(), value); return this; }
    /** Sets the specified value to the {@link #onThreshold} field. */
    public XrInteractionProfileAnalogThresholdVALVE onThreshold(float value) { nonThreshold(address(), value); return this; }
    /** Sets the specified value to the {@link #offThreshold} field. */
    public XrInteractionProfileAnalogThresholdVALVE offThreshold(float value) { noffThreshold(address(), value); return this; }
    /** Sets the address of the specified {@link XrHapticBaseHeader} to the {@link #onHaptic} field. */
    public XrInteractionProfileAnalogThresholdVALVE onHaptic(@Nullable @NativeType("XrHapticBaseHeader const *") XrHapticBaseHeader value) { nonHaptic(address(), value); return this; }
    /** Sets the address of the specified {@link XrHapticBaseHeader} to the {@link #offHaptic} field. */
    public XrInteractionProfileAnalogThresholdVALVE offHaptic(@Nullable @NativeType("XrHapticBaseHeader const *") XrHapticBaseHeader value) { noffHaptic(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrInteractionProfileAnalogThresholdVALVE set(
        int type,
        long next,
        XrAction action,
        long binding,
        float onThreshold,
        float offThreshold,
        @Nullable XrHapticBaseHeader onHaptic,
        @Nullable XrHapticBaseHeader offHaptic
    ) {
        type(type);
        next(next);
        action(action);
        binding(binding);
        onThreshold(onThreshold);
        offThreshold(offThreshold);
        onHaptic(onHaptic);
        offHaptic(offHaptic);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrInteractionProfileAnalogThresholdVALVE set(XrInteractionProfileAnalogThresholdVALVE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrInteractionProfileAnalogThresholdVALVE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrInteractionProfileAnalogThresholdVALVE malloc() {
        return wrap(XrInteractionProfileAnalogThresholdVALVE.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrInteractionProfileAnalogThresholdVALVE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrInteractionProfileAnalogThresholdVALVE calloc() {
        return wrap(XrInteractionProfileAnalogThresholdVALVE.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrInteractionProfileAnalogThresholdVALVE} instance allocated with {@link BufferUtils}. */
    public static XrInteractionProfileAnalogThresholdVALVE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrInteractionProfileAnalogThresholdVALVE.class, memAddress(container), container);
    }

    /** Returns a new {@code XrInteractionProfileAnalogThresholdVALVE} instance for the specified memory address. */
    public static XrInteractionProfileAnalogThresholdVALVE create(long address) {
        return wrap(XrInteractionProfileAnalogThresholdVALVE.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrInteractionProfileAnalogThresholdVALVE createSafe(long address) {
        return address == NULL ? null : wrap(XrInteractionProfileAnalogThresholdVALVE.class, address);
    }

    /** Downcasts the specified {@code XrBindingModificationBaseHeaderKHR} instance to {@code XrInteractionProfileAnalogThresholdVALVE}. */
    public static XrInteractionProfileAnalogThresholdVALVE create(XrBindingModificationBaseHeaderKHR value) {
        return wrap(XrInteractionProfileAnalogThresholdVALVE.class, value);
    }

    /**
     * Returns a new {@link XrInteractionProfileAnalogThresholdVALVE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileAnalogThresholdVALVE.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrInteractionProfileAnalogThresholdVALVE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileAnalogThresholdVALVE.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrInteractionProfileAnalogThresholdVALVE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileAnalogThresholdVALVE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrInteractionProfileAnalogThresholdVALVE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileAnalogThresholdVALVE.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrInteractionProfileAnalogThresholdVALVE.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /** Downcasts the specified {@code XrBindingModificationBaseHeaderKHR.Buffer} instance to {@code XrInteractionProfileAnalogThresholdVALVE.Buffer}. */
    public static XrInteractionProfileAnalogThresholdVALVE.Buffer create(XrBindingModificationBaseHeaderKHR.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /**
     * Returns a new {@code XrInteractionProfileAnalogThresholdVALVE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrInteractionProfileAnalogThresholdVALVE malloc(MemoryStack stack) {
        return wrap(XrInteractionProfileAnalogThresholdVALVE.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrInteractionProfileAnalogThresholdVALVE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrInteractionProfileAnalogThresholdVALVE calloc(MemoryStack stack) {
        return wrap(XrInteractionProfileAnalogThresholdVALVE.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrInteractionProfileAnalogThresholdVALVE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileAnalogThresholdVALVE.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrInteractionProfileAnalogThresholdVALVE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrInteractionProfileAnalogThresholdVALVE.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrInteractionProfileAnalogThresholdVALVE.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrInteractionProfileAnalogThresholdVALVE.NEXT); }
    /** Unsafe version of {@link #action}. */
    public static long naction(long struct) { return memGetAddress(struct + XrInteractionProfileAnalogThresholdVALVE.ACTION); }
    /** Unsafe version of {@link #binding}. */
    public static long nbinding(long struct) { return UNSAFE.getLong(null, struct + XrInteractionProfileAnalogThresholdVALVE.BINDING); }
    /** Unsafe version of {@link #onThreshold}. */
    public static float nonThreshold(long struct) { return UNSAFE.getFloat(null, struct + XrInteractionProfileAnalogThresholdVALVE.ONTHRESHOLD); }
    /** Unsafe version of {@link #offThreshold}. */
    public static float noffThreshold(long struct) { return UNSAFE.getFloat(null, struct + XrInteractionProfileAnalogThresholdVALVE.OFFTHRESHOLD); }
    /** Unsafe version of {@link #onHaptic}. */
    @Nullable public static XrHapticBaseHeader nonHaptic(long struct) { return XrHapticBaseHeader.createSafe(memGetAddress(struct + XrInteractionProfileAnalogThresholdVALVE.ONHAPTIC)); }
    /** Unsafe version of {@link #offHaptic}. */
    @Nullable public static XrHapticBaseHeader noffHaptic(long struct) { return XrHapticBaseHeader.createSafe(memGetAddress(struct + XrInteractionProfileAnalogThresholdVALVE.OFFHAPTIC)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrInteractionProfileAnalogThresholdVALVE.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrInteractionProfileAnalogThresholdVALVE.NEXT, value); }
    /** Unsafe version of {@link #action(XrAction) action}. */
    public static void naction(long struct, XrAction value) { memPutAddress(struct + XrInteractionProfileAnalogThresholdVALVE.ACTION, value.address()); }
    /** Unsafe version of {@link #binding(long) binding}. */
    public static void nbinding(long struct, long value) { UNSAFE.putLong(null, struct + XrInteractionProfileAnalogThresholdVALVE.BINDING, value); }
    /** Unsafe version of {@link #onThreshold(float) onThreshold}. */
    public static void nonThreshold(long struct, float value) { UNSAFE.putFloat(null, struct + XrInteractionProfileAnalogThresholdVALVE.ONTHRESHOLD, value); }
    /** Unsafe version of {@link #offThreshold(float) offThreshold}. */
    public static void noffThreshold(long struct, float value) { UNSAFE.putFloat(null, struct + XrInteractionProfileAnalogThresholdVALVE.OFFTHRESHOLD, value); }
    /** Unsafe version of {@link #onHaptic(XrHapticBaseHeader) onHaptic}. */
    public static void nonHaptic(long struct, @Nullable XrHapticBaseHeader value) { memPutAddress(struct + XrInteractionProfileAnalogThresholdVALVE.ONHAPTIC, memAddressSafe(value)); }
    /** Unsafe version of {@link #offHaptic(XrHapticBaseHeader) offHaptic}. */
    public static void noffHaptic(long struct, @Nullable XrHapticBaseHeader value) { memPutAddress(struct + XrInteractionProfileAnalogThresholdVALVE.OFFHAPTIC, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrInteractionProfileAnalogThresholdVALVE.ACTION));
    }

    // -----------------------------------

    /** An array of {@link XrInteractionProfileAnalogThresholdVALVE} structs. */
    public static class Buffer extends StructBuffer<XrInteractionProfileAnalogThresholdVALVE, Buffer> implements NativeResource {

        private static final XrInteractionProfileAnalogThresholdVALVE ELEMENT_FACTORY = XrInteractionProfileAnalogThresholdVALVE.create(-1L);

        /**
         * Creates a new {@code XrInteractionProfileAnalogThresholdVALVE.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrInteractionProfileAnalogThresholdVALVE#SIZEOF}, and its mark will be undefined.
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
        protected XrInteractionProfileAnalogThresholdVALVE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrInteractionProfileAnalogThresholdVALVE#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrInteractionProfileAnalogThresholdVALVE.ntype(address()); }
        /** @return the value of the {@link XrInteractionProfileAnalogThresholdVALVE#next} field. */
        @NativeType("void const *")
        public long next() { return XrInteractionProfileAnalogThresholdVALVE.nnext(address()); }
        /** @return the value of the {@link XrInteractionProfileAnalogThresholdVALVE#action} field. */
        @NativeType("XrAction")
        public long action() { return XrInteractionProfileAnalogThresholdVALVE.naction(address()); }
        /** @return the value of the {@link XrInteractionProfileAnalogThresholdVALVE#binding} field. */
        @NativeType("XrPath")
        public long binding() { return XrInteractionProfileAnalogThresholdVALVE.nbinding(address()); }
        /** @return the value of the {@link XrInteractionProfileAnalogThresholdVALVE#onThreshold} field. */
        public float onThreshold() { return XrInteractionProfileAnalogThresholdVALVE.nonThreshold(address()); }
        /** @return the value of the {@link XrInteractionProfileAnalogThresholdVALVE#offThreshold} field. */
        public float offThreshold() { return XrInteractionProfileAnalogThresholdVALVE.noffThreshold(address()); }
        /** @return a {@link XrHapticBaseHeader} view of the struct pointed to by the {@link XrInteractionProfileAnalogThresholdVALVE#onHaptic} field. */
        @Nullable
        @NativeType("XrHapticBaseHeader const *")
        public XrHapticBaseHeader onHaptic() { return XrInteractionProfileAnalogThresholdVALVE.nonHaptic(address()); }
        /** @return a {@link XrHapticBaseHeader} view of the struct pointed to by the {@link XrInteractionProfileAnalogThresholdVALVE#offHaptic} field. */
        @Nullable
        @NativeType("XrHapticBaseHeader const *")
        public XrHapticBaseHeader offHaptic() { return XrInteractionProfileAnalogThresholdVALVE.noffHaptic(address()); }

        /** Sets the specified value to the {@link XrInteractionProfileAnalogThresholdVALVE#type} field. */
        public XrInteractionProfileAnalogThresholdVALVE.Buffer type(@NativeType("XrStructureType") int value) { XrInteractionProfileAnalogThresholdVALVE.ntype(address(), value); return this; }
        /** Sets the {@link VALVEAnalogThreshold#XR_TYPE_INTERACTION_PROFILE_ANALOG_THRESHOLD_VALVE TYPE_INTERACTION_PROFILE_ANALOG_THRESHOLD_VALVE} value to the {@link XrInteractionProfileAnalogThresholdVALVE#type} field. */
        public XrInteractionProfileAnalogThresholdVALVE.Buffer type$Default() { return type(VALVEAnalogThreshold.XR_TYPE_INTERACTION_PROFILE_ANALOG_THRESHOLD_VALVE); }
        /** Sets the specified value to the {@link XrInteractionProfileAnalogThresholdVALVE#next} field. */
        public XrInteractionProfileAnalogThresholdVALVE.Buffer next(@NativeType("void const *") long value) { XrInteractionProfileAnalogThresholdVALVE.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrInteractionProfileAnalogThresholdVALVE#action} field. */
        public XrInteractionProfileAnalogThresholdVALVE.Buffer action(XrAction value) { XrInteractionProfileAnalogThresholdVALVE.naction(address(), value); return this; }
        /** Sets the specified value to the {@link XrInteractionProfileAnalogThresholdVALVE#binding} field. */
        public XrInteractionProfileAnalogThresholdVALVE.Buffer binding(@NativeType("XrPath") long value) { XrInteractionProfileAnalogThresholdVALVE.nbinding(address(), value); return this; }
        /** Sets the specified value to the {@link XrInteractionProfileAnalogThresholdVALVE#onThreshold} field. */
        public XrInteractionProfileAnalogThresholdVALVE.Buffer onThreshold(float value) { XrInteractionProfileAnalogThresholdVALVE.nonThreshold(address(), value); return this; }
        /** Sets the specified value to the {@link XrInteractionProfileAnalogThresholdVALVE#offThreshold} field. */
        public XrInteractionProfileAnalogThresholdVALVE.Buffer offThreshold(float value) { XrInteractionProfileAnalogThresholdVALVE.noffThreshold(address(), value); return this; }
        /** Sets the address of the specified {@link XrHapticBaseHeader} to the {@link XrInteractionProfileAnalogThresholdVALVE#onHaptic} field. */
        public XrInteractionProfileAnalogThresholdVALVE.Buffer onHaptic(@Nullable @NativeType("XrHapticBaseHeader const *") XrHapticBaseHeader value) { XrInteractionProfileAnalogThresholdVALVE.nonHaptic(address(), value); return this; }
        /** Sets the address of the specified {@link XrHapticBaseHeader} to the {@link XrInteractionProfileAnalogThresholdVALVE#offHaptic} field. */
        public XrInteractionProfileAnalogThresholdVALVE.Buffer offHaptic(@Nullable @NativeType("XrHapticBaseHeader const *") XrHapticBaseHeader value) { XrInteractionProfileAnalogThresholdVALVE.noffHaptic(address(), value); return this; }

    }

}