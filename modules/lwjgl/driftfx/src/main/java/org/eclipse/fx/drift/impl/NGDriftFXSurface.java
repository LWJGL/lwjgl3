/*******************************************************************************
 * Copyright (c) 2019 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks <ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.drift.impl;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

import org.eclipse.fx.drift.DriftFXSurface;
import org.eclipse.fx.drift.internal.FPSCounter;
import org.eclipse.fx.drift.internal.Frame;
import org.eclipse.fx.drift.internal.FrameProfiler;
import org.eclipse.fx.drift.internal.GPUSyncUtil.WaitSyncResult;
import org.eclipse.fx.drift.internal.GraphicsPipelineUtil;
import org.eclipse.fx.drift.internal.Log;
import org.eclipse.fx.drift.internal.NativeAPI;
import org.eclipse.fx.drift.internal.Placement;
import org.eclipse.fx.drift.internal.QuantumRendererHelper;
import org.eclipse.fx.drift.internal.QuantumRendererHelper.WithFence;
import org.eclipse.fx.drift.internal.SurfaceData;

import com.sun.javafx.font.FontStrike;
import com.sun.javafx.font.PGFont;
import com.sun.javafx.geom.Point2D;
import com.sun.javafx.geom.transform.BaseTransform;
import com.sun.javafx.scene.text.GlyphList;
import com.sun.javafx.scene.text.TextLayout;
import com.sun.javafx.scene.text.TextLayoutFactory;
import com.sun.javafx.sg.prism.NGNode;
import com.sun.javafx.tk.Toolkit;
import com.sun.prism.Graphics;
import com.sun.prism.PixelFormat;
import com.sun.prism.ResourceFactory;
import com.sun.prism.Texture;
import com.sun.prism.paint.Color;
import com.sun.prism.paint.Paint;

import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

// Note: this implementation is against internal JavafX API
@SuppressWarnings("restriction")
public class NGDriftFXSurface extends NGNode {

	private long nativeSurfaceHandle;
	
	private SurfaceData surfaceData;
	
	private ResourceFactory resourceFactory;
	private DriftFXSurface node;
	
	
	private int currentFrameDataHash;
	private Texture currentTexture;
	
	private Frame currentFrame;
	
	private int renderedHash;
	private Texture renderedTexture;
	
	private Queue<Frame> nextFrame = new ConcurrentLinkedQueue<>();
	
	private final static boolean showFPS = Boolean.getBoolean("driftfx.showfps");
	FPSCounter renderContent = new FPSCounter();
	FPSCounter renderTexture = new FPSCounter();
	
	public void present(Frame frame) {
		nextFrame.offer(frame);
	}
	
	private static boolean profile = Boolean.getBoolean("driftfx.profile");
	
	private void dispose(Frame frame) {
		if (profile) FrameProfiler.addFrame(frame);
		NativeAPI.disposeFrame(frame);
	}
	
	public NGDriftFXSurface(DriftFXSurface node, long nativeSurfaceId) {
		this.node = node;
		this.nativeSurfaceHandle = nativeSurfaceId;
		Log.debug("NGNativeSurface got handle: " + this.nativeSurfaceHandle);
		this.resourceFactory = GraphicsPipelineUtil.getResourceFactory();
	}
	
	public void destroy() {
		NativeAPI.destroyNativeSurface(this.nativeSurfaceHandle);
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		destroy();
	}
	
	// TODO output some kind of placeholder info
	private void renderPlaceholder(Graphics g)
	{
		float width = (float) surfaceData.width;
		float height = (float) surfaceData.height;
		
//		Paint white = (Paint)Toolkit.getPaintAccessor().getPlatformPaint(javafx.scene.paint.Color.WHITE);
//		g.setPaint(white);
//		g.fillQuad(0, 0, width, height);

		Paint red = (Paint)Toolkit.getPaintAccessor().getPlatformPaint(javafx.scene.paint.Color.RED);
		g.setPaint(red);
		g.drawRect(0, 0, width - 1, height - 1);
	}

	private Texture createTexture(Graphics g, Frame frame) {
		if (showFPS) renderTexture.frame();
		frame.begin("NGDriftFXSurface#renderTexture");

		int w = frame.textureWidth;
		int h = frame.textureHeight;
		
		Texture texture = resourceFactory.createTexture(PixelFormat.BYTE_BGRA_PRE, Texture.Usage.DYNAMIC, Texture.WrapMode.CLAMP_NOT_NEEDED, w, h);
		if (texture == null) {
			Log.error("[J] Allocation of requested texture failed! This is FATAL! requested size was " + w + "x" + h);
			return null;
		}
		texture.makePermanent();
		Log.debug("Created Texture @ " + texture.getContentWidth() + " x " + texture.getContentHeight());
		
		//int result = QuantumRendererHelper.syncExecute(() -> GraphicsPipelineUtil.onTextureCreated(texture, frame));
		
		WithFence<Integer> exec = QuantumRendererHelper.syncExecuteWithFence(() -> GraphicsPipelineUtil.onTextureCreated(texture, frame) );
		
		//exec.getFence().ClientWaitSync(Duration.ZERO);
		exec.getFence().WaitSync();
		exec.getFence().Delete();
		
		int result = exec.getResult();
		
		frame.end("NGDriftFXSurface#renderTexture");
		if (result == 0) {
			// once the texture is ready we want to dispose the frame
			dispose(frame);
			return texture;
		}
		else {
			Log.error("[J] Could not connect the texture to actual data.");
			texture.dispose();
			return null;
		}
	}
	
	
	private int toPixels(double value) {
		return (int) Math.ceil(value);
	}
	
	private float center(float dst, float src) {
		return (dst - src) / 2f;
	}
	private float end(float dst, float src) {
		return dst - src;
	}
	
	static class Pos {
		float x;
		float width;
		float y;
		float height;
		Pos(float x, float width, float y, float height) {
			this.x = x;
			this.width = width;
			this.y = y;
			this.height = height;
		}
	}
	
	private Pos computeCover(float dstWidth, float dstHeight, float srcWidth, float srcHeight) {
		float dstRatio = dstWidth / dstHeight;
		float srcRatio = srcWidth / srcHeight;
		float width, height;
		if (dstRatio > srcRatio) {
			width = dstWidth;
			height = width / srcRatio;
		}
		else {
			height = dstHeight;
			width = height * srcRatio;
		}
		return new Pos(center(dstWidth, width), width, center(dstHeight, height), height);
		
	}
	private Pos computeContain(float dstWidth, float dstHeight, float srcWidth, float srcHeight)  {
		float dstRatio = dstWidth / dstHeight;
		float srcRatio = srcWidth / srcHeight;
		float width, height;
		if (srcRatio <= dstRatio) {
			height = dstHeight;
			width = height * srcRatio;
		}
		else {
			width = dstWidth;
			height = width / srcRatio;
		}
		return new Pos(center(dstWidth, width), width, center(dstHeight, height), height);
	}
	private Pos computeCenter(float dstWidth, float dstHeight, float srcWidth, float srcHeight) {
		return new Pos(center(dstWidth, srcWidth), srcWidth, center(dstHeight, srcHeight), srcHeight);
	}
	private Pos computeTopLeft(float dstWidth, float dstHeight, float srcWidth, float srcHeight) {
		return new Pos(0, srcWidth, 0, srcHeight);
	}
	private Pos computeTopCenter(float dstWidth, float dstHeight, float srcWidth, float srcHeight) {
		return new Pos(center(dstWidth, srcWidth), srcWidth, 0, srcHeight);
	}
	private Pos computeTopRight(float dstWidth, float dstHeight, float srcWidth, float srcHeight) {
		return new Pos(end(dstWidth, srcWidth), srcWidth, 0, srcHeight);
	}
	private Pos computeCenterLeft(float dstWidth, float dstHeight, float srcWidth, float srcHeight) {
		return new Pos(0, srcWidth, center(dstHeight, srcHeight), srcHeight);
	}
	private Pos computeCenterRight(float dstWidth, float dstHeight, float srcWidth, float srcHeight) {
		return new Pos(end (dstWidth, srcWidth), srcWidth, center(dstHeight, srcHeight), srcHeight);
	}
	private Pos computeBottomLeft(float dstWidth, float dstHeight, float srcWidth, float srcHeight) {
		return new Pos(0, srcWidth, end(dstHeight, srcHeight), srcHeight);
	}
	private Pos computeBottomCenter(float dstWidth, float dstHeight, float srcWidth, float srcHeight) {
		return new Pos(center(dstWidth, srcWidth), srcWidth, end(dstHeight, srcHeight), srcHeight);
	}
	private Pos computeBottomRight(float dstWidth, float dstHeight, float srcWidth, float srcHeight) {
		return new Pos(end(dstWidth, srcWidth), srcWidth, end(dstHeight, srcHeight), srcHeight);
	}
	
	private Pos computePlacement(Placement placement, float dstWidth, float dstHeight, float srcWidth, float srcHeight) {
		switch (placement) {
		case COVER: return computeCover(dstWidth, dstHeight, srcWidth, srcHeight);
		case CONTAIN: return computeContain(dstWidth, dstHeight, srcWidth, srcHeight);
		case TOP_LEFT: return computeTopLeft(dstWidth, dstHeight, srcWidth, srcHeight);
		case TOP_CENTER: return computeTopCenter(dstWidth, dstHeight, srcWidth, srcHeight);
		case TOP_RIGHT: return computeTopRight(dstWidth, dstHeight, srcWidth, srcHeight);
		case CENTER_LEFT: return computeCenterLeft(dstWidth, dstHeight, srcWidth, srcHeight);
		case CENTER_RIGHT: return computeCenterRight(dstWidth, dstHeight, srcWidth, srcHeight);
		case BOTTOM_LEFT: return computeBottomLeft(dstWidth, dstHeight, srcWidth, srcHeight);
		case BOTTOM_CENTER: return computeBottomCenter(dstWidth, dstHeight, srcWidth, srcHeight);
		case BOTTOM_RIGHT: return computeBottomRight(dstWidth, dstHeight, srcWidth, srcHeight);
		case CENTER:
			default:
				return computeCenter(dstWidth, dstHeight, srcWidth, srcHeight);
		}
	}
	
	private Placement toPlacement(int placement) {
		if (placement < 0 || placement >= Placement.values().length) {
			return Placement.CENTER;
		}
		return Placement.values()[placement];
	}
	
	private void renderFrame(Graphics g, Frame frame) {
		if (frame == null) {
			return;
		}
		
		if (renderedHash != frame.hashCode()) {
			// re-create texture
			
			
			Texture texture = createTexture(g, frame);
			if (texture != null) {
				if (renderedTexture != null) {
					renderedTexture.dispose();
				}
				renderedTexture = texture;
				renderedHash = frame.hashCode();
			}
			else {
				// failed frame
				currentFrame = null;
			}
		}
		
		if (renderedTexture != null) {
			drawTexture(g, currentFrame, renderedTexture);
		}
		
	}
	

	
	private void drawStats(Graphics g) {
		
		String stats0;
		if (currentFrame != null) {
			stats0 = String.format("%d.%d (%d x %d)", nativeSurfaceHandle, currentFrame.frameId, currentFrame.textureWidth, currentFrame.textureHeight);
		}
		else {
			stats0 = "" + nativeSurfaceHandle;
		}
		
		String stats = String.format("%s\nfx:  %5.1ffps\ntex: %5.1ffps", stats0, renderContent.avgFps(), renderTexture.avgFps());
		
		Font font = Font.font(18);
		PGFont pgFont = (PGFont) font.impl_getNativeFont();
		
		FontStrike strike = pgFont.getStrike(BaseTransform.IDENTITY_TRANSFORM);
		
		TextLayoutFactory factory = Toolkit.getToolkit().getTextLayoutFactory();
		TextLayout layout = factory.createLayout();
		
		layout.setContent(stats, pgFont);
		layout.setAlignment(TextAlignment.LEFT.ordinal());
		layout.setLineSpacing(0);
		layout.setWrapWidth(0);
		
		GlyphList[] runs = layout.getRuns();
		
		float layoutX = 0;
		float layoutY = -pgFont.getSize();
		
		g.setPaint(Color.RED);
		for (int i = 0; i < runs.length; i++) {
			GlyphList run = runs[i];
			Point2D pt = run.getLocation();
            float x = pt.x- layoutX;
            float y = pt.y - layoutY;
			BaseTransform t = BaseTransform.getTranslateInstance(x, y);
			g.fill(strike.getOutline(run,  t));
		}

	}
	
	private void drawTexture(Graphics g, Frame frame, Texture t) {
		float frameContainerWidth = frame.surfaceData.width;
		float frameContainerHeight = frame.surfaceData.height;
		
		Placement placement = toPlacement(frame.presentationHint);
		
		float textureRatio = t.getContentWidth() / (float) t.getContentHeight();
		float frameRatio = frame.surfaceData.width / frame.surfaceData.height;
		
		Pos framePos = new Pos(0, frameContainerWidth, 0, frameContainerHeight);
		
		if (Math.abs(textureRatio - frameRatio) > 0.001f) {
			// aspect ratio is not matching, we need to do compute the position within the frame container
			framePos = computeContain(frameContainerWidth, frameContainerHeight, t.getContentWidth(), t.getContentHeight());
		}
		
		int frameTextureWidth = t.getContentWidth();
		int frameTextureHeight = t.getContentHeight();
		
		float currentContainerWidth = this.surfaceData.width;
		float currentContainerHeight = this.surfaceData.height;	

		Pos pos = computePlacement(placement, currentContainerWidth, currentContainerHeight, framePos.width, framePos.height);

		// flip it vertically
		g.scale(1, -1);
		g.translate(0, -currentContainerHeight);		
			
		pos.y = currentContainerHeight - pos.y - pos.height;

		g.drawTexture(t, pos.x, pos.y, 
				pos.x + pos.width, pos.y + pos.height, 0, 0, frameTextureWidth, frameTextureHeight);
	}
	
	private Frame getNextFrame() {
		Frame next = null;
		List<Frame> skipped = new LinkedList<>();
		do {
			if (next != null) {
				skipped.add(next);
			}
			next = nextFrame.poll();
			
		} while (!nextFrame.isEmpty());
		if (!skipped.isEmpty()) {
			Log.debug("Skipped " + skipped.size() + " frames! " + skipped);
			skipped.forEach(this::dispose);
		}
		return next;
	}
	
	@Override
	protected void renderContent(Graphics g) {
		if (showFPS) renderContent.frame();
		
		BaseTransform saved = g.getTransformNoClone().copy();
		
		Frame next = getNextFrame();
		if (next != null) {
			currentFrame = next;
		}
		
		if (currentFrame != null) {
			renderFrame(g, currentFrame);
		}
		
		g.setTransform(saved);
		
		if (showFPS) {
			drawStats(g);
		}
	}
	
	public void updateSurface(SurfaceData surfaceData)  {
		Log.debug("[J] NativeSurface updateSurface("+surfaceData+")");
		if (isValid(surfaceData)) {
			this.surfaceData = surfaceData;
			CompletableFuture.runAsync(() -> {
				NativeAPI.updateSurface(nativeSurfaceHandle, surfaceData);
			});
		}
	}
	
	private boolean isValid(SurfaceData data) {
		return true;
	}
	
	
	

	@Override
	protected boolean hasOverlappingContents() {
		return false;
	}

	

}
