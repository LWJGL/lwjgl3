package org.eclipse.fx.drift.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class FrameProfiler extends Stage {

	static interface El {
		
	}
	
	static class Surface implements El {
		long id;
		List<Frame> frames = new ArrayList<>();
		
		@Override
		public String toString() {
			return "Surface #" + id;
		}
	}
	
	static class Frame implements El  {
		Surface parent;
		long id;
		
		List<Timing> timings = new ArrayList<>();
		
		public Frame(Surface parent) {
			this.parent = parent;
			this.parent.frames.add(this);
		}
		
		@Override
		public String toString() {
			return "Frame " + parent.id + "." + id;
		}
	}
	
	static class Timing implements El  {
		String tag;
		long begin;
		long end;
		
		@Override
		public String toString() {
			return String.format("%5.3f", (end-begin) / 1_000_000d) + "ms for " + tag + " needed";// (" + begin + " - " + end + ")"; 
		}
	}
	
	static Map<Long, Surface> surfaces = new HashMap<>();
	private ListView<El> list;
	private TreeView<El> tree;
	private long surfaceId;
	
	public static void addFrame(org.eclipse.fx.drift.internal.Frame frame) {
		Surface s = surfaces.computeIfAbsent(frame.surfaceId, id -> {
			Surface n = new Surface();
			n.id = id;
			return n;
		});
		
		Frame f = new Frame(s);
		f.id = frame.frameId;
		for (org.eclipse.fx.drift.internal.Frame.Timing timing : frame.getReport()) {
			Timing t = new Timing();
			t.tag = timing.tag;
			t.begin = timing.begin;
			t.end = timing.end;
			f.timings.add(t);
		}
	}
	
	public FrameProfiler(long surfaceId) {
		this.surfaceId = surfaceId;
		setTitle("FrameProfiler: Surface " + surfaceId);
		BorderPane root = new BorderPane();
		Scene s = new Scene(root);
		setScene(s);
		
		
//		list = new ListView<>();
//		root.setCenter(list);
		tree = new TreeView<>();
		root.setCenter(tree);
		
		Button update = new Button("update");
		update.setOnAction(e -> update());
		root.setBottom(update);
	}
	
	private TreeItem<El> tree(El el) {
		if (el instanceof Surface) {
			Surface s = (Surface) el;
			TreeItem<El> i = new TreeItem<El>(s);
			i.getChildren().addAll(s.frames.stream().map(this::tree).collect(Collectors.toList()));
			return i;
		}
		if (el instanceof Frame) {
			Frame f = (Frame) el;
			TreeItem<El> i = new TreeItem<El>(f);
			i.getChildren().addAll(f.timings.stream().map(this::tree).collect(Collectors.toList()));
			return i;
		}
		if (el instanceof Timing) {
			TreeItem<El> i = new TreeItem<El>(el);
			return i;
		}
		throw new RuntimeException();
	}
	
	private void update() {
		Surface s = surfaces.get(surfaceId);
		tree.setRoot(tree(s));
//		tree.setItems(FXCollections.observableArrayList(s.frames));
	}

	public static void open(long surfaceId) {
		
		FrameProfiler p = new FrameProfiler(surfaceId);
		p.show();
	}
	
}
