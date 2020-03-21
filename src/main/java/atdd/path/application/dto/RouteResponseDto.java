package atdd.path.application.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class RouteResponseDto {
    private Long startStationId;
    private Long endStationId;
    private List<StationResponseDto> stations;
    private int estimatedTime;

    @Builder
    public RouteResponseDto(Long startStationId, Long endStationId, List<StationResponseDto> stations, int estimatedTime) {
        this.startStationId = startStationId;
        this.endStationId = endStationId;
        this.stations = stations;
        this.estimatedTime = estimatedTime;
    }
}