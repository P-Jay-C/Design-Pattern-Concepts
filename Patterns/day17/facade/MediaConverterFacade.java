package day17.facade;

public class MediaConverterFacade {
    private VideoDecoder videoDecoder;
    private AudioExtractor audioExtractor;
    private FormatConverter formatConverter;

    public MediaConverterFacade() {
        this.videoDecoder = new VideoDecoder();
        this.audioExtractor = new AudioExtractor();
        this.formatConverter = new FormatConverter();
    }

    public void convertMedia(String file, String targetFormat) {
        videoDecoder.decodeVideo(file);
        audioExtractor.extractAudio(file);
        formatConverter.convertToFormat(file, targetFormat);
    }
}