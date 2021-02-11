import { TestBed } from '@angular/core/testing';

import { FortuneServiceService } from './fortune-service.service';

describe('FortuneServiceService', () => {
  let service: FortuneServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FortuneServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
