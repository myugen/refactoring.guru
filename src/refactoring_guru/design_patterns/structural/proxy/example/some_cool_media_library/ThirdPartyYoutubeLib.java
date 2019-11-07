package refactoring_guru.design_patterns.structural.proxy.example.some_cool_media_library;

import java.util.HashMap;

public interface ThirdPartyYoutubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
