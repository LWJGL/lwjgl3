/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

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
 * struct FMOD_ADVANCEDSETTINGS {
 *     int cbSize;
 *     int maxMPEGCodecs;
 *     int maxADPCMCodecs;
 *     int maxXMACodecs;
 *     int maxVorbisCodecs;
 *     int maxAT9Codecs;
 *     int maxFADPCMCodecs;
 *     int maxPCMCodecs;
 *     int ASIONumChannels;
 *     char ** ASIOChannelList;
 *     FMOD_SPEAKER * ASIOSpeakerList;
 *     float vol0virtualvol;
 *     unsigned int defaultDecodeBufferSize;
 *     unsigned short profilePort;
 *     unsigned int geometryMaxFadeTime;
 *     float distanceFilterCenterFreq;
 *     int reverb3Dinstance;
 *     int DSPBufferPoolSize;
 *     FMOD_DSP_RESAMPLER resamplerMethod;
 *     unsigned int randomSeed;
 *     int maxConvolutionThreads;
 *     int maxOpusCodecs;
 * }</code></pre>
 */
public class FMOD_ADVANCEDSETTINGS extends Struct<FMOD_ADVANCEDSETTINGS> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CBSIZE,
        MAXMPEGCODECS,
        MAXADPCMCODECS,
        MAXXMACODECS,
        MAXVORBISCODECS,
        MAXAT9CODECS,
        MAXFADPCMCODECS,
        MAXPCMCODECS,
        ASIONUMCHANNELS,
        ASIOCHANNELLIST,
        ASIOSPEAKERLIST,
        VOL0VIRTUALVOL,
        DEFAULTDECODEBUFFERSIZE,
        PROFILEPORT,
        GEOMETRYMAXFADETIME,
        DISTANCEFILTERCENTERFREQ,
        REVERB3DINSTANCE,
        DSPBUFFERPOOLSIZE,
        RESAMPLERMETHOD,
        RANDOMSEED,
        MAXCONVOLUTIONTHREADS,
        MAXOPUSCODECS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(2),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CBSIZE = layout.offsetof(0);
        MAXMPEGCODECS = layout.offsetof(1);
        MAXADPCMCODECS = layout.offsetof(2);
        MAXXMACODECS = layout.offsetof(3);
        MAXVORBISCODECS = layout.offsetof(4);
        MAXAT9CODECS = layout.offsetof(5);
        MAXFADPCMCODECS = layout.offsetof(6);
        MAXPCMCODECS = layout.offsetof(7);
        ASIONUMCHANNELS = layout.offsetof(8);
        ASIOCHANNELLIST = layout.offsetof(9);
        ASIOSPEAKERLIST = layout.offsetof(10);
        VOL0VIRTUALVOL = layout.offsetof(11);
        DEFAULTDECODEBUFFERSIZE = layout.offsetof(12);
        PROFILEPORT = layout.offsetof(13);
        GEOMETRYMAXFADETIME = layout.offsetof(14);
        DISTANCEFILTERCENTERFREQ = layout.offsetof(15);
        REVERB3DINSTANCE = layout.offsetof(16);
        DSPBUFFERPOOLSIZE = layout.offsetof(17);
        RESAMPLERMETHOD = layout.offsetof(18);
        RANDOMSEED = layout.offsetof(19);
        MAXCONVOLUTIONTHREADS = layout.offsetof(20);
        MAXOPUSCODECS = layout.offsetof(21);
    }

    protected FMOD_ADVANCEDSETTINGS(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_ADVANCEDSETTINGS create(long address, @Nullable ByteBuffer container) {
        return new FMOD_ADVANCEDSETTINGS(address, container);
    }

    /**
     * Creates a {@code FMOD_ADVANCEDSETTINGS} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_ADVANCEDSETTINGS(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code cbSize} field. */
    public int cbSize() { return ncbSize(address()); }
    /** @return the value of the {@code maxMPEGCodecs} field. */
    public int maxMPEGCodecs() { return nmaxMPEGCodecs(address()); }
    /** @return the value of the {@code maxADPCMCodecs} field. */
    public int maxADPCMCodecs() { return nmaxADPCMCodecs(address()); }
    /** @return the value of the {@code maxXMACodecs} field. */
    public int maxXMACodecs() { return nmaxXMACodecs(address()); }
    /** @return the value of the {@code maxVorbisCodecs} field. */
    public int maxVorbisCodecs() { return nmaxVorbisCodecs(address()); }
    /** @return the value of the {@code maxAT9Codecs} field. */
    public int maxAT9Codecs() { return nmaxAT9Codecs(address()); }
    /** @return the value of the {@code maxFADPCMCodecs} field. */
    public int maxFADPCMCodecs() { return nmaxFADPCMCodecs(address()); }
    /** @return the value of the {@code maxPCMCodecs} field. */
    public int maxPCMCodecs() { return nmaxPCMCodecs(address()); }
    /** @return the value of the {@code ASIONumChannels} field. */
    public int ASIONumChannels() { return nASIONumChannels(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code ASIOChannelList} field. */
    @NativeType("char **")
    public PointerBuffer ASIOChannelList() { return nASIOChannelList(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code ASIOSpeakerList} field. */
    @NativeType("FMOD_SPEAKER *")
    public IntBuffer ASIOSpeakerList() { return nASIOSpeakerList(address()); }
    /** @return the value of the {@code vol0virtualvol} field. */
    public float vol0virtualvol() { return nvol0virtualvol(address()); }
    /** @return the value of the {@code defaultDecodeBufferSize} field. */
    @NativeType("unsigned int")
    public int defaultDecodeBufferSize() { return ndefaultDecodeBufferSize(address()); }
    /** @return the value of the {@code profilePort} field. */
    @NativeType("unsigned short")
    public short profilePort() { return nprofilePort(address()); }
    /** @return the value of the {@code geometryMaxFadeTime} field. */
    @NativeType("unsigned int")
    public int geometryMaxFadeTime() { return ngeometryMaxFadeTime(address()); }
    /** @return the value of the {@code distanceFilterCenterFreq} field. */
    public float distanceFilterCenterFreq() { return ndistanceFilterCenterFreq(address()); }
    /** @return the value of the {@code reverb3Dinstance} field. */
    public int reverb3Dinstance() { return nreverb3Dinstance(address()); }
    /** @return the value of the {@code DSPBufferPoolSize} field. */
    public int DSPBufferPoolSize() { return nDSPBufferPoolSize(address()); }
    /** @return the value of the {@code resamplerMethod} field. */
    @NativeType("FMOD_DSP_RESAMPLER")
    public int resamplerMethod() { return nresamplerMethod(address()); }
    /** @return the value of the {@code randomSeed} field. */
    @NativeType("unsigned int")
    public int randomSeed() { return nrandomSeed(address()); }
    /** @return the value of the {@code maxConvolutionThreads} field. */
    public int maxConvolutionThreads() { return nmaxConvolutionThreads(address()); }
    /** @return the value of the {@code maxOpusCodecs} field. */
    public int maxOpusCodecs() { return nmaxOpusCodecs(address()); }

    /** Sets the specified value to the {@code cbSize} field. */
    public FMOD_ADVANCEDSETTINGS cbSize(int value) { ncbSize(address(), value); return this; }
    /** Sets the specified value to the {@code maxMPEGCodecs} field. */
    public FMOD_ADVANCEDSETTINGS maxMPEGCodecs(int value) { nmaxMPEGCodecs(address(), value); return this; }
    /** Sets the specified value to the {@code maxADPCMCodecs} field. */
    public FMOD_ADVANCEDSETTINGS maxADPCMCodecs(int value) { nmaxADPCMCodecs(address(), value); return this; }
    /** Sets the specified value to the {@code maxXMACodecs} field. */
    public FMOD_ADVANCEDSETTINGS maxXMACodecs(int value) { nmaxXMACodecs(address(), value); return this; }
    /** Sets the specified value to the {@code maxVorbisCodecs} field. */
    public FMOD_ADVANCEDSETTINGS maxVorbisCodecs(int value) { nmaxVorbisCodecs(address(), value); return this; }
    /** Sets the specified value to the {@code maxAT9Codecs} field. */
    public FMOD_ADVANCEDSETTINGS maxAT9Codecs(int value) { nmaxAT9Codecs(address(), value); return this; }
    /** Sets the specified value to the {@code maxFADPCMCodecs} field. */
    public FMOD_ADVANCEDSETTINGS maxFADPCMCodecs(int value) { nmaxFADPCMCodecs(address(), value); return this; }
    /** Sets the specified value to the {@code maxPCMCodecs} field. */
    public FMOD_ADVANCEDSETTINGS maxPCMCodecs(int value) { nmaxPCMCodecs(address(), value); return this; }
    /** Sets the specified value to the {@code ASIONumChannels} field. */
    public FMOD_ADVANCEDSETTINGS ASIONumChannels(int value) { nASIONumChannels(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code ASIOChannelList} field. */
    public FMOD_ADVANCEDSETTINGS ASIOChannelList(@NativeType("char **") PointerBuffer value) { nASIOChannelList(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code ASIOSpeakerList} field. */
    public FMOD_ADVANCEDSETTINGS ASIOSpeakerList(@NativeType("FMOD_SPEAKER *") IntBuffer value) { nASIOSpeakerList(address(), value); return this; }
    /** Sets the specified value to the {@code vol0virtualvol} field. */
    public FMOD_ADVANCEDSETTINGS vol0virtualvol(float value) { nvol0virtualvol(address(), value); return this; }
    /** Sets the specified value to the {@code defaultDecodeBufferSize} field. */
    public FMOD_ADVANCEDSETTINGS defaultDecodeBufferSize(@NativeType("unsigned int") int value) { ndefaultDecodeBufferSize(address(), value); return this; }
    /** Sets the specified value to the {@code profilePort} field. */
    public FMOD_ADVANCEDSETTINGS profilePort(@NativeType("unsigned short") short value) { nprofilePort(address(), value); return this; }
    /** Sets the specified value to the {@code geometryMaxFadeTime} field. */
    public FMOD_ADVANCEDSETTINGS geometryMaxFadeTime(@NativeType("unsigned int") int value) { ngeometryMaxFadeTime(address(), value); return this; }
    /** Sets the specified value to the {@code distanceFilterCenterFreq} field. */
    public FMOD_ADVANCEDSETTINGS distanceFilterCenterFreq(float value) { ndistanceFilterCenterFreq(address(), value); return this; }
    /** Sets the specified value to the {@code reverb3Dinstance} field. */
    public FMOD_ADVANCEDSETTINGS reverb3Dinstance(int value) { nreverb3Dinstance(address(), value); return this; }
    /** Sets the specified value to the {@code DSPBufferPoolSize} field. */
    public FMOD_ADVANCEDSETTINGS DSPBufferPoolSize(int value) { nDSPBufferPoolSize(address(), value); return this; }
    /** Sets the specified value to the {@code resamplerMethod} field. */
    public FMOD_ADVANCEDSETTINGS resamplerMethod(@NativeType("FMOD_DSP_RESAMPLER") int value) { nresamplerMethod(address(), value); return this; }
    /** Sets the specified value to the {@code randomSeed} field. */
    public FMOD_ADVANCEDSETTINGS randomSeed(@NativeType("unsigned int") int value) { nrandomSeed(address(), value); return this; }
    /** Sets the specified value to the {@code maxConvolutionThreads} field. */
    public FMOD_ADVANCEDSETTINGS maxConvolutionThreads(int value) { nmaxConvolutionThreads(address(), value); return this; }
    /** Sets the specified value to the {@code maxOpusCodecs} field. */
    public FMOD_ADVANCEDSETTINGS maxOpusCodecs(int value) { nmaxOpusCodecs(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_ADVANCEDSETTINGS set(
        int cbSize,
        int maxMPEGCodecs,
        int maxADPCMCodecs,
        int maxXMACodecs,
        int maxVorbisCodecs,
        int maxAT9Codecs,
        int maxFADPCMCodecs,
        int maxPCMCodecs,
        int ASIONumChannels,
        PointerBuffer ASIOChannelList,
        IntBuffer ASIOSpeakerList,
        float vol0virtualvol,
        int defaultDecodeBufferSize,
        short profilePort,
        int geometryMaxFadeTime,
        float distanceFilterCenterFreq,
        int reverb3Dinstance,
        int DSPBufferPoolSize,
        int resamplerMethod,
        int randomSeed,
        int maxConvolutionThreads,
        int maxOpusCodecs
    ) {
        cbSize(cbSize);
        maxMPEGCodecs(maxMPEGCodecs);
        maxADPCMCodecs(maxADPCMCodecs);
        maxXMACodecs(maxXMACodecs);
        maxVorbisCodecs(maxVorbisCodecs);
        maxAT9Codecs(maxAT9Codecs);
        maxFADPCMCodecs(maxFADPCMCodecs);
        maxPCMCodecs(maxPCMCodecs);
        ASIONumChannels(ASIONumChannels);
        ASIOChannelList(ASIOChannelList);
        ASIOSpeakerList(ASIOSpeakerList);
        vol0virtualvol(vol0virtualvol);
        defaultDecodeBufferSize(defaultDecodeBufferSize);
        profilePort(profilePort);
        geometryMaxFadeTime(geometryMaxFadeTime);
        distanceFilterCenterFreq(distanceFilterCenterFreq);
        reverb3Dinstance(reverb3Dinstance);
        DSPBufferPoolSize(DSPBufferPoolSize);
        resamplerMethod(resamplerMethod);
        randomSeed(randomSeed);
        maxConvolutionThreads(maxConvolutionThreads);
        maxOpusCodecs(maxOpusCodecs);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_ADVANCEDSETTINGS set(FMOD_ADVANCEDSETTINGS src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_ADVANCEDSETTINGS} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_ADVANCEDSETTINGS malloc() {
        return new FMOD_ADVANCEDSETTINGS(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_ADVANCEDSETTINGS} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_ADVANCEDSETTINGS calloc() {
        return new FMOD_ADVANCEDSETTINGS(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_ADVANCEDSETTINGS} instance allocated with {@link BufferUtils}. */
    public static FMOD_ADVANCEDSETTINGS create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_ADVANCEDSETTINGS(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_ADVANCEDSETTINGS} instance for the specified memory address. */
    public static FMOD_ADVANCEDSETTINGS create(long address) {
        return new FMOD_ADVANCEDSETTINGS(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_ADVANCEDSETTINGS createSafe(long address) {
        return address == NULL ? null : new FMOD_ADVANCEDSETTINGS(address, null);
    }

    /**
     * Returns a new {@link FMOD_ADVANCEDSETTINGS.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_ADVANCEDSETTINGS.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_ADVANCEDSETTINGS.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_ADVANCEDSETTINGS.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_ADVANCEDSETTINGS.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_ADVANCEDSETTINGS.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_ADVANCEDSETTINGS.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_ADVANCEDSETTINGS.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_ADVANCEDSETTINGS.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_ADVANCEDSETTINGS} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_ADVANCEDSETTINGS malloc(MemoryStack stack) {
        return new FMOD_ADVANCEDSETTINGS(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_ADVANCEDSETTINGS} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_ADVANCEDSETTINGS calloc(MemoryStack stack) {
        return new FMOD_ADVANCEDSETTINGS(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_ADVANCEDSETTINGS.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_ADVANCEDSETTINGS.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_ADVANCEDSETTINGS.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_ADVANCEDSETTINGS.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #cbSize}. */
    public static int ncbSize(long struct) { return UNSAFE.getInt(null, struct + FMOD_ADVANCEDSETTINGS.CBSIZE); }
    /** Unsafe version of {@link #maxMPEGCodecs}. */
    public static int nmaxMPEGCodecs(long struct) { return UNSAFE.getInt(null, struct + FMOD_ADVANCEDSETTINGS.MAXMPEGCODECS); }
    /** Unsafe version of {@link #maxADPCMCodecs}. */
    public static int nmaxADPCMCodecs(long struct) { return UNSAFE.getInt(null, struct + FMOD_ADVANCEDSETTINGS.MAXADPCMCODECS); }
    /** Unsafe version of {@link #maxXMACodecs}. */
    public static int nmaxXMACodecs(long struct) { return UNSAFE.getInt(null, struct + FMOD_ADVANCEDSETTINGS.MAXXMACODECS); }
    /** Unsafe version of {@link #maxVorbisCodecs}. */
    public static int nmaxVorbisCodecs(long struct) { return UNSAFE.getInt(null, struct + FMOD_ADVANCEDSETTINGS.MAXVORBISCODECS); }
    /** Unsafe version of {@link #maxAT9Codecs}. */
    public static int nmaxAT9Codecs(long struct) { return UNSAFE.getInt(null, struct + FMOD_ADVANCEDSETTINGS.MAXAT9CODECS); }
    /** Unsafe version of {@link #maxFADPCMCodecs}. */
    public static int nmaxFADPCMCodecs(long struct) { return UNSAFE.getInt(null, struct + FMOD_ADVANCEDSETTINGS.MAXFADPCMCODECS); }
    /** Unsafe version of {@link #maxPCMCodecs}. */
    public static int nmaxPCMCodecs(long struct) { return UNSAFE.getInt(null, struct + FMOD_ADVANCEDSETTINGS.MAXPCMCODECS); }
    /** Unsafe version of {@link #ASIONumChannels}. */
    public static int nASIONumChannels(long struct) { return UNSAFE.getInt(null, struct + FMOD_ADVANCEDSETTINGS.ASIONUMCHANNELS); }
    /** Unsafe version of {@link #ASIOChannelList() ASIOChannelList}. */
    public static PointerBuffer nASIOChannelList(long struct) { return memPointerBuffer(memGetAddress(struct + FMOD_ADVANCEDSETTINGS.ASIOCHANNELLIST), nASIONumChannels(struct)); }
    /** Unsafe version of {@link #ASIOSpeakerList() ASIOSpeakerList}. */
    public static IntBuffer nASIOSpeakerList(long struct) { return memIntBuffer(memGetAddress(struct + FMOD_ADVANCEDSETTINGS.ASIOSPEAKERLIST), nASIONumChannels(struct)); }
    /** Unsafe version of {@link #vol0virtualvol}. */
    public static float nvol0virtualvol(long struct) { return UNSAFE.getFloat(null, struct + FMOD_ADVANCEDSETTINGS.VOL0VIRTUALVOL); }
    /** Unsafe version of {@link #defaultDecodeBufferSize}. */
    public static int ndefaultDecodeBufferSize(long struct) { return UNSAFE.getInt(null, struct + FMOD_ADVANCEDSETTINGS.DEFAULTDECODEBUFFERSIZE); }
    /** Unsafe version of {@link #profilePort}. */
    public static short nprofilePort(long struct) { return UNSAFE.getShort(null, struct + FMOD_ADVANCEDSETTINGS.PROFILEPORT); }
    /** Unsafe version of {@link #geometryMaxFadeTime}. */
    public static int ngeometryMaxFadeTime(long struct) { return UNSAFE.getInt(null, struct + FMOD_ADVANCEDSETTINGS.GEOMETRYMAXFADETIME); }
    /** Unsafe version of {@link #distanceFilterCenterFreq}. */
    public static float ndistanceFilterCenterFreq(long struct) { return UNSAFE.getFloat(null, struct + FMOD_ADVANCEDSETTINGS.DISTANCEFILTERCENTERFREQ); }
    /** Unsafe version of {@link #reverb3Dinstance}. */
    public static int nreverb3Dinstance(long struct) { return UNSAFE.getInt(null, struct + FMOD_ADVANCEDSETTINGS.REVERB3DINSTANCE); }
    /** Unsafe version of {@link #DSPBufferPoolSize}. */
    public static int nDSPBufferPoolSize(long struct) { return UNSAFE.getInt(null, struct + FMOD_ADVANCEDSETTINGS.DSPBUFFERPOOLSIZE); }
    /** Unsafe version of {@link #resamplerMethod}. */
    public static int nresamplerMethod(long struct) { return UNSAFE.getInt(null, struct + FMOD_ADVANCEDSETTINGS.RESAMPLERMETHOD); }
    /** Unsafe version of {@link #randomSeed}. */
    public static int nrandomSeed(long struct) { return UNSAFE.getInt(null, struct + FMOD_ADVANCEDSETTINGS.RANDOMSEED); }
    /** Unsafe version of {@link #maxConvolutionThreads}. */
    public static int nmaxConvolutionThreads(long struct) { return UNSAFE.getInt(null, struct + FMOD_ADVANCEDSETTINGS.MAXCONVOLUTIONTHREADS); }
    /** Unsafe version of {@link #maxOpusCodecs}. */
    public static int nmaxOpusCodecs(long struct) { return UNSAFE.getInt(null, struct + FMOD_ADVANCEDSETTINGS.MAXOPUSCODECS); }

    /** Unsafe version of {@link #cbSize(int) cbSize}. */
    public static void ncbSize(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_ADVANCEDSETTINGS.CBSIZE, value); }
    /** Unsafe version of {@link #maxMPEGCodecs(int) maxMPEGCodecs}. */
    public static void nmaxMPEGCodecs(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_ADVANCEDSETTINGS.MAXMPEGCODECS, value); }
    /** Unsafe version of {@link #maxADPCMCodecs(int) maxADPCMCodecs}. */
    public static void nmaxADPCMCodecs(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_ADVANCEDSETTINGS.MAXADPCMCODECS, value); }
    /** Unsafe version of {@link #maxXMACodecs(int) maxXMACodecs}. */
    public static void nmaxXMACodecs(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_ADVANCEDSETTINGS.MAXXMACODECS, value); }
    /** Unsafe version of {@link #maxVorbisCodecs(int) maxVorbisCodecs}. */
    public static void nmaxVorbisCodecs(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_ADVANCEDSETTINGS.MAXVORBISCODECS, value); }
    /** Unsafe version of {@link #maxAT9Codecs(int) maxAT9Codecs}. */
    public static void nmaxAT9Codecs(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_ADVANCEDSETTINGS.MAXAT9CODECS, value); }
    /** Unsafe version of {@link #maxFADPCMCodecs(int) maxFADPCMCodecs}. */
    public static void nmaxFADPCMCodecs(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_ADVANCEDSETTINGS.MAXFADPCMCODECS, value); }
    /** Unsafe version of {@link #maxPCMCodecs(int) maxPCMCodecs}. */
    public static void nmaxPCMCodecs(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_ADVANCEDSETTINGS.MAXPCMCODECS, value); }
    /** Sets the specified value to the {@code ASIONumChannels} field of the specified {@code struct}. */
    public static void nASIONumChannels(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_ADVANCEDSETTINGS.ASIONUMCHANNELS, value); }
    /** Unsafe version of {@link #ASIOChannelList(PointerBuffer) ASIOChannelList}. */
    public static void nASIOChannelList(long struct, PointerBuffer value) { memPutAddress(struct + FMOD_ADVANCEDSETTINGS.ASIOCHANNELLIST, memAddress(value)); }
    /** Unsafe version of {@link #ASIOSpeakerList(IntBuffer) ASIOSpeakerList}. */
    public static void nASIOSpeakerList(long struct, IntBuffer value) { memPutAddress(struct + FMOD_ADVANCEDSETTINGS.ASIOSPEAKERLIST, memAddress(value)); }
    /** Unsafe version of {@link #vol0virtualvol(float) vol0virtualvol}. */
    public static void nvol0virtualvol(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_ADVANCEDSETTINGS.VOL0VIRTUALVOL, value); }
    /** Unsafe version of {@link #defaultDecodeBufferSize(int) defaultDecodeBufferSize}. */
    public static void ndefaultDecodeBufferSize(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_ADVANCEDSETTINGS.DEFAULTDECODEBUFFERSIZE, value); }
    /** Unsafe version of {@link #profilePort(short) profilePort}. */
    public static void nprofilePort(long struct, short value) { UNSAFE.putShort(null, struct + FMOD_ADVANCEDSETTINGS.PROFILEPORT, value); }
    /** Unsafe version of {@link #geometryMaxFadeTime(int) geometryMaxFadeTime}. */
    public static void ngeometryMaxFadeTime(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_ADVANCEDSETTINGS.GEOMETRYMAXFADETIME, value); }
    /** Unsafe version of {@link #distanceFilterCenterFreq(float) distanceFilterCenterFreq}. */
    public static void ndistanceFilterCenterFreq(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_ADVANCEDSETTINGS.DISTANCEFILTERCENTERFREQ, value); }
    /** Unsafe version of {@link #reverb3Dinstance(int) reverb3Dinstance}. */
    public static void nreverb3Dinstance(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_ADVANCEDSETTINGS.REVERB3DINSTANCE, value); }
    /** Unsafe version of {@link #DSPBufferPoolSize(int) DSPBufferPoolSize}. */
    public static void nDSPBufferPoolSize(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_ADVANCEDSETTINGS.DSPBUFFERPOOLSIZE, value); }
    /** Unsafe version of {@link #resamplerMethod(int) resamplerMethod}. */
    public static void nresamplerMethod(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_ADVANCEDSETTINGS.RESAMPLERMETHOD, value); }
    /** Unsafe version of {@link #randomSeed(int) randomSeed}. */
    public static void nrandomSeed(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_ADVANCEDSETTINGS.RANDOMSEED, value); }
    /** Unsafe version of {@link #maxConvolutionThreads(int) maxConvolutionThreads}. */
    public static void nmaxConvolutionThreads(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_ADVANCEDSETTINGS.MAXCONVOLUTIONTHREADS, value); }
    /** Unsafe version of {@link #maxOpusCodecs(int) maxOpusCodecs}. */
    public static void nmaxOpusCodecs(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_ADVANCEDSETTINGS.MAXOPUSCODECS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FMOD_ADVANCEDSETTINGS.ASIOCHANNELLIST));
        check(memGetAddress(struct + FMOD_ADVANCEDSETTINGS.ASIOSPEAKERLIST));
    }

    // -----------------------------------

    /** An array of {@link FMOD_ADVANCEDSETTINGS} structs. */
    public static class Buffer extends StructBuffer<FMOD_ADVANCEDSETTINGS, Buffer> implements NativeResource {

        private static final FMOD_ADVANCEDSETTINGS ELEMENT_FACTORY = FMOD_ADVANCEDSETTINGS.create(-1L);

        /**
         * Creates a new {@code FMOD_ADVANCEDSETTINGS.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_ADVANCEDSETTINGS#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_ADVANCEDSETTINGS getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code cbSize} field. */
        public int cbSize() { return FMOD_ADVANCEDSETTINGS.ncbSize(address()); }
        /** @return the value of the {@code maxMPEGCodecs} field. */
        public int maxMPEGCodecs() { return FMOD_ADVANCEDSETTINGS.nmaxMPEGCodecs(address()); }
        /** @return the value of the {@code maxADPCMCodecs} field. */
        public int maxADPCMCodecs() { return FMOD_ADVANCEDSETTINGS.nmaxADPCMCodecs(address()); }
        /** @return the value of the {@code maxXMACodecs} field. */
        public int maxXMACodecs() { return FMOD_ADVANCEDSETTINGS.nmaxXMACodecs(address()); }
        /** @return the value of the {@code maxVorbisCodecs} field. */
        public int maxVorbisCodecs() { return FMOD_ADVANCEDSETTINGS.nmaxVorbisCodecs(address()); }
        /** @return the value of the {@code maxAT9Codecs} field. */
        public int maxAT9Codecs() { return FMOD_ADVANCEDSETTINGS.nmaxAT9Codecs(address()); }
        /** @return the value of the {@code maxFADPCMCodecs} field. */
        public int maxFADPCMCodecs() { return FMOD_ADVANCEDSETTINGS.nmaxFADPCMCodecs(address()); }
        /** @return the value of the {@code maxPCMCodecs} field. */
        public int maxPCMCodecs() { return FMOD_ADVANCEDSETTINGS.nmaxPCMCodecs(address()); }
        /** @return the value of the {@code ASIONumChannels} field. */
        public int ASIONumChannels() { return FMOD_ADVANCEDSETTINGS.nASIONumChannels(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code ASIOChannelList} field. */
        @NativeType("char **")
        public PointerBuffer ASIOChannelList() { return FMOD_ADVANCEDSETTINGS.nASIOChannelList(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code ASIOSpeakerList} field. */
        @NativeType("FMOD_SPEAKER *")
        public IntBuffer ASIOSpeakerList() { return FMOD_ADVANCEDSETTINGS.nASIOSpeakerList(address()); }
        /** @return the value of the {@code vol0virtualvol} field. */
        public float vol0virtualvol() { return FMOD_ADVANCEDSETTINGS.nvol0virtualvol(address()); }
        /** @return the value of the {@code defaultDecodeBufferSize} field. */
        @NativeType("unsigned int")
        public int defaultDecodeBufferSize() { return FMOD_ADVANCEDSETTINGS.ndefaultDecodeBufferSize(address()); }
        /** @return the value of the {@code profilePort} field. */
        @NativeType("unsigned short")
        public short profilePort() { return FMOD_ADVANCEDSETTINGS.nprofilePort(address()); }
        /** @return the value of the {@code geometryMaxFadeTime} field. */
        @NativeType("unsigned int")
        public int geometryMaxFadeTime() { return FMOD_ADVANCEDSETTINGS.ngeometryMaxFadeTime(address()); }
        /** @return the value of the {@code distanceFilterCenterFreq} field. */
        public float distanceFilterCenterFreq() { return FMOD_ADVANCEDSETTINGS.ndistanceFilterCenterFreq(address()); }
        /** @return the value of the {@code reverb3Dinstance} field. */
        public int reverb3Dinstance() { return FMOD_ADVANCEDSETTINGS.nreverb3Dinstance(address()); }
        /** @return the value of the {@code DSPBufferPoolSize} field. */
        public int DSPBufferPoolSize() { return FMOD_ADVANCEDSETTINGS.nDSPBufferPoolSize(address()); }
        /** @return the value of the {@code resamplerMethod} field. */
        @NativeType("FMOD_DSP_RESAMPLER")
        public int resamplerMethod() { return FMOD_ADVANCEDSETTINGS.nresamplerMethod(address()); }
        /** @return the value of the {@code randomSeed} field. */
        @NativeType("unsigned int")
        public int randomSeed() { return FMOD_ADVANCEDSETTINGS.nrandomSeed(address()); }
        /** @return the value of the {@code maxConvolutionThreads} field. */
        public int maxConvolutionThreads() { return FMOD_ADVANCEDSETTINGS.nmaxConvolutionThreads(address()); }
        /** @return the value of the {@code maxOpusCodecs} field. */
        public int maxOpusCodecs() { return FMOD_ADVANCEDSETTINGS.nmaxOpusCodecs(address()); }

        /** Sets the specified value to the {@code cbSize} field. */
        public FMOD_ADVANCEDSETTINGS.Buffer cbSize(int value) { FMOD_ADVANCEDSETTINGS.ncbSize(address(), value); return this; }
        /** Sets the specified value to the {@code maxMPEGCodecs} field. */
        public FMOD_ADVANCEDSETTINGS.Buffer maxMPEGCodecs(int value) { FMOD_ADVANCEDSETTINGS.nmaxMPEGCodecs(address(), value); return this; }
        /** Sets the specified value to the {@code maxADPCMCodecs} field. */
        public FMOD_ADVANCEDSETTINGS.Buffer maxADPCMCodecs(int value) { FMOD_ADVANCEDSETTINGS.nmaxADPCMCodecs(address(), value); return this; }
        /** Sets the specified value to the {@code maxXMACodecs} field. */
        public FMOD_ADVANCEDSETTINGS.Buffer maxXMACodecs(int value) { FMOD_ADVANCEDSETTINGS.nmaxXMACodecs(address(), value); return this; }
        /** Sets the specified value to the {@code maxVorbisCodecs} field. */
        public FMOD_ADVANCEDSETTINGS.Buffer maxVorbisCodecs(int value) { FMOD_ADVANCEDSETTINGS.nmaxVorbisCodecs(address(), value); return this; }
        /** Sets the specified value to the {@code maxAT9Codecs} field. */
        public FMOD_ADVANCEDSETTINGS.Buffer maxAT9Codecs(int value) { FMOD_ADVANCEDSETTINGS.nmaxAT9Codecs(address(), value); return this; }
        /** Sets the specified value to the {@code maxFADPCMCodecs} field. */
        public FMOD_ADVANCEDSETTINGS.Buffer maxFADPCMCodecs(int value) { FMOD_ADVANCEDSETTINGS.nmaxFADPCMCodecs(address(), value); return this; }
        /** Sets the specified value to the {@code maxPCMCodecs} field. */
        public FMOD_ADVANCEDSETTINGS.Buffer maxPCMCodecs(int value) { FMOD_ADVANCEDSETTINGS.nmaxPCMCodecs(address(), value); return this; }
        /** Sets the specified value to the {@code ASIONumChannels} field. */
        public FMOD_ADVANCEDSETTINGS.Buffer ASIONumChannels(int value) { FMOD_ADVANCEDSETTINGS.nASIONumChannels(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code ASIOChannelList} field. */
        public FMOD_ADVANCEDSETTINGS.Buffer ASIOChannelList(@NativeType("char **") PointerBuffer value) { FMOD_ADVANCEDSETTINGS.nASIOChannelList(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code ASIOSpeakerList} field. */
        public FMOD_ADVANCEDSETTINGS.Buffer ASIOSpeakerList(@NativeType("FMOD_SPEAKER *") IntBuffer value) { FMOD_ADVANCEDSETTINGS.nASIOSpeakerList(address(), value); return this; }
        /** Sets the specified value to the {@code vol0virtualvol} field. */
        public FMOD_ADVANCEDSETTINGS.Buffer vol0virtualvol(float value) { FMOD_ADVANCEDSETTINGS.nvol0virtualvol(address(), value); return this; }
        /** Sets the specified value to the {@code defaultDecodeBufferSize} field. */
        public FMOD_ADVANCEDSETTINGS.Buffer defaultDecodeBufferSize(@NativeType("unsigned int") int value) { FMOD_ADVANCEDSETTINGS.ndefaultDecodeBufferSize(address(), value); return this; }
        /** Sets the specified value to the {@code profilePort} field. */
        public FMOD_ADVANCEDSETTINGS.Buffer profilePort(@NativeType("unsigned short") short value) { FMOD_ADVANCEDSETTINGS.nprofilePort(address(), value); return this; }
        /** Sets the specified value to the {@code geometryMaxFadeTime} field. */
        public FMOD_ADVANCEDSETTINGS.Buffer geometryMaxFadeTime(@NativeType("unsigned int") int value) { FMOD_ADVANCEDSETTINGS.ngeometryMaxFadeTime(address(), value); return this; }
        /** Sets the specified value to the {@code distanceFilterCenterFreq} field. */
        public FMOD_ADVANCEDSETTINGS.Buffer distanceFilterCenterFreq(float value) { FMOD_ADVANCEDSETTINGS.ndistanceFilterCenterFreq(address(), value); return this; }
        /** Sets the specified value to the {@code reverb3Dinstance} field. */
        public FMOD_ADVANCEDSETTINGS.Buffer reverb3Dinstance(int value) { FMOD_ADVANCEDSETTINGS.nreverb3Dinstance(address(), value); return this; }
        /** Sets the specified value to the {@code DSPBufferPoolSize} field. */
        public FMOD_ADVANCEDSETTINGS.Buffer DSPBufferPoolSize(int value) { FMOD_ADVANCEDSETTINGS.nDSPBufferPoolSize(address(), value); return this; }
        /** Sets the specified value to the {@code resamplerMethod} field. */
        public FMOD_ADVANCEDSETTINGS.Buffer resamplerMethod(@NativeType("FMOD_DSP_RESAMPLER") int value) { FMOD_ADVANCEDSETTINGS.nresamplerMethod(address(), value); return this; }
        /** Sets the specified value to the {@code randomSeed} field. */
        public FMOD_ADVANCEDSETTINGS.Buffer randomSeed(@NativeType("unsigned int") int value) { FMOD_ADVANCEDSETTINGS.nrandomSeed(address(), value); return this; }
        /** Sets the specified value to the {@code maxConvolutionThreads} field. */
        public FMOD_ADVANCEDSETTINGS.Buffer maxConvolutionThreads(int value) { FMOD_ADVANCEDSETTINGS.nmaxConvolutionThreads(address(), value); return this; }
        /** Sets the specified value to the {@code maxOpusCodecs} field. */
        public FMOD_ADVANCEDSETTINGS.Buffer maxOpusCodecs(int value) { FMOD_ADVANCEDSETTINGS.nmaxOpusCodecs(address(), value); return this; }

    }

}